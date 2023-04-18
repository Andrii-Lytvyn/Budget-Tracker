package classes;


import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.Calendar;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Submenu {
    public static final String LINEOPEN = "╔======╦==============╦===============╦============╦==============╦========================╗";

    public static final String HEADER = "║  ID  ║     Date     ║    Category   ║    User    ║    Amount    ║        Comments        ║";
    public static final String LINEMIDLE = "║======╬==============╬===============╬============╬==============╬========================║";
    public static final String LINEOPEN2 = "╟----4------10----------------15------------10-----------10-------------------35--------------------╢";

    public static void printHeader() {
        System.out.println(Colors.WHITE_BOLD_BRIGHT + LINEOPEN + Colors.RESET);
        System.out.println(Colors.WHITE_BOLD_BRIGHT + HEADER + Colors.RESET);
        System.out.println(Colors.WHITE_BOLD_BRIGHT + LINEMIDLE + Colors.RESET);
        System.out.println(Colors.WHITE_BOLD_BRIGHT + LINEOPEN2 + Colors.RESET);
        System.out.printf("");
    }


    public static void delayFirst() {
        int delay = 250;
        long start = System.currentTimeMillis();
        while (start >= System.currentTimeMillis() - delay) ;
    }

    public static void delaySecond() {
        int delay = 500;
        long start = System.currentTimeMillis();
        while (start >= System.currentTimeMillis() - delay) ;
    }

    public static void clearAll() throws AWTException {
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_Q);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_Q);
    }
    public static void showAll(List<Record> records) throws IOException, ParseException {

        for (Record record : records) { //cut long Titles
            int id = record.getId();
            String category = record.getCategory();
            String user = record.getUser();
            double amount = record.getAmount();
            String comment = record.getComment();
            String data = Operations.dateToString(record.getDate());

            String recordRow = String.format("|%4d|%10s|%10s|%35s|%11s|%11s|%12s|%13s|%9s|",
                   id, category, user, amount, comment,
                    data);
            System.out.println(recordRow);
        }
    }


/*
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
                    clearAll();
                    Output.printList(Operations.sortByUser(records));
                    break;
                }
                case "3": {
                    clearAll();
                    Output.printList(Operations.sortByCategory(records));
                    break;
                }
                case "4": {
                    clearAll();
                    Output.printList(Operations.sortByAmount(records));
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
*/
  /**
   * Add new record to List of records
   *
   * @param records List of Record with payments (can be sorted and filtered before)
   * @param categories List of Categories
   * @throws IOException IO error
   * @throws ParseException if illegal Date format
   */
  public static void addRecord(List<Record> records, List<Category> categories)
      throws IOException, ParseException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    DateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    Record record = new Record();

    Calendar today = Calendar.getInstance();
    Date currentDate = today.getTime();
    Date stDate = currentDate;

    boolean income = false;
    int multiply = 1;
    int id = Record.getNewRecordId(records);

    System.out.println(Colors.BLUE + "Task ID:         " + id);
    // TODO - make method getUserName()
    System.out.printf(Colors.BLUE + "User:          %s%n", Users.getUserName());
    System.out.print(Colors.BLUE + "Is this income or expenses (i/e):     ");
    String incomeOrExpenses = br.readLine();
    if (incomeOrExpenses.equalsIgnoreCase("i")) {
      income = true;
    }
    System.out.print(Colors.BLUE + "Input title:     ");
    String title = br.readLine();
    System.out.print(Colors.BLUE + "Input date or 'Enter' for current date (dd.MM.yyyy):  ");
    String startDate = br.readLine();
    if (!startDate.isEmpty()) {
      stDate = formatter.parse(startDate);
    }
    for (int i = 1; i <= categories.size(); ++i) {
      System.out.println("" + i + categories.get(i));
    }
    System.out.print("Choose category from list (1-10):      ");
    int cat = Integer.parseInt(br.readLine());
    String categoryName = categories.get(cat).getTitle();//get category by number and get title
    System.out.print("Input amount:      ");
    double amount = Double.parseDouble(br.readLine());
    System.out.println();
    System.out.print(Colors.WHITE_BACKGROUND_BRIGHT + Colors.BLACK_BOLD + " s - SAVE " +
        Colors.RESET + " " + Colors.WHITE_BACKGROUND_BRIGHT +
        Colors.BLACK_BOLD + " e-EXIT: " + Colors.RESET);
    while (true) {
      String command = br.readLine();
      if (command.equalsIgnoreCase("e")) {
        return;
      } else if (command.equalsIgnoreCase("s")) {
        record.setId(id);
        record.setUser(Users.getUserName());
        record.setDate(stDate);
        record.setCategory(categoryName);
        if (!income) {
          multiply = -1;
        }
        record.setAmount(amount * multiply);
        records.add(record);
        return;
      }
    }
  }
}



