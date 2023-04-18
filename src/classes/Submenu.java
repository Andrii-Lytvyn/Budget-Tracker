package classes;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.Comparator;
import java.util.List;

public class Submenu {
    public static final String LINEOPEN = " ╔======╦==============╦===============╦============╦==============╦========================╗";
    public static final String HEADER = "   ║  ID  ║     Date     ║    Category   ║    User    ║    Amount    ║        Comments        ║";
    public static final String LINECLOSE = "╚======╩==============╩===============╩============╩==============╩========================╝";

    public static void printHeader() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + LINEOPEN + Colors.RESET);
        System.out.println(Colors.WHITE_BOLD_BRIGHT + HEADER + Colors.RESET);
        System.out.println(Colors.WHITE_BOLD_BRIGHT + LINECLOSE + Colors.RESET);
    }



    public static void delayFirst(){
        int delay = 250;
        long start = System.currentTimeMillis();
        while (start >= System.currentTimeMillis() - delay);
    }
    public static void delaySecond(){
        int delay = 500;
        long start = System.currentTimeMillis();
        while (start >= System.currentTimeMillis() - delay);
    }
    public static void clearAll() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_Q);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_Q);
    }


    public static void recordsMenu(List<Record> records) throws IOException, ParseException, AWTException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print(Colors.WHITE_BOLD_BRIGHT + "Choose command: " + Colors.RESET);
            String key = br.readLine();
            switch (key) {
                case "1": { // sort by ID
                    clearAll();
                    Output.printList(Operations.sortByID(records));
                    break;
                }
                case "2": {
                    Comparator<Task> comparator = new TaskByExecutorComparator();
                    Collections.sort(tasks, comparator);
                    refresh(tasks);
                    break;
                }
                case "3": {
                    Comparator<Task> comparator = new TaskByTitleComparator();
                    Collections.sort(tasks, comparator);
                    refresh(tasks);
                    break;
                }
                case "4": {
                    Comparator<Task> comparator = new TaskByPriorityComparator();
                    tasks.sort(comparator);
                    refresh(tasks);
                    break;
                }
                case "5": {
                    Comparator<Task> comparator = new TaskByDifficultComparator();
                    tasks.sort(comparator);
                    refresh(tasks);
                    break;
                }
                case "6": {
                    Comparator<Task> comparator = new TaskByStatusComparator();
                    tasks.sort(comparator);
                    refresh(tasks);
                    break;
                }
                case "7": {
                    Comparator<Task> comparator = new TaskByStartDateComparator();
                    tasks.sort(comparator);
                    refresh(tasks);
                    break;
                }
                case "8": {
                    Comparator<Task> comparator = new TaskByFinishDateComparator();
                    tasks.sort(comparator);
                    refresh(tasks);
                    break;
                }
                case "9": {
                    Comparator<Task> comparator1 = new TaskByIdComparator();
                    tasks.sort(comparator1);
                    refresh(tasks);
                    break;
                }
                case "c": {
                    changeUser(tasks);
                    refresh(tasks);
                    break;
                }
                case "a": {
                    addTask(tasks);
                    refresh(tasks);
                    break;
                }
                case "d": {
                    deleteTask(tasks);
                    refresh(tasks);
                    break;
                }
                case "f": {
                    finishTask(tasks);
                    refresh(tasks);
                    break;
                }
                case "r": {
                    System.out.println();
                    System.out.print(ConsoleColors.BLUE_BOLD + "Input task ID to READ: " + ConsoleColors.RESET);
                    int id = Integer.parseInt(br.readLine());
                    if (checkIdInRange(tasks, id)) {
                        readTask(tasks, id);
                    }
                    refresh(tasks);
                    break;
                }
                case "g": {
//          refresh(tasks);
                    if (Task.getGeneral()) {
                        Gant gant = new Gant();
                        gant.printHead();
//            tasks.sort(new TaskByIdComparator());
                        for (Task task : tasks) {
                            gant.printTask(task);
                        }
                        gant.printLine();
                        System.out.println();
                        System.out.println("Q - Quit");
                        while (true) {
                            String quit = br.readLine();
                            if (quit != "") {
                                break;
                            }
                        }
                    }
                    refresh(tasks);
                }
                case "q": {
                    task.makeOutputFile(tasks);
                    System.exit(0);

                }
            }
        }
    }

}



