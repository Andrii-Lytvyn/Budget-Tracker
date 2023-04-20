package classes;


import javax.sound.sampled.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Submenu {

  public static final String LINEOPEN = "┌┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒";
  public static final String HEADER = "│  ID  │          DATA          │         CATEGORY        │         USER         │         AMOUNT         │             COMMENTS             │";
  public static final String LINECLOSE = "┠┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┤";

  public static void printHeader() {
    System.out.println(Colors.WHITE_BOLD_BRIGHT + LINEOPEN + Colors.RESET);
    System.out.println(Colors.WHITE_BOLD_BRIGHT + HEADER + Colors.RESET);
    System.out.println(Colors.WHITE_BOLD_BRIGHT + LINECLOSE + Colors.RESET);
  }


  public static void delayMain() {
    int delay = 2000;
    long start = System.currentTimeMillis();
    while (start >= System.currentTimeMillis() - delay)
      ;
  }

  public static void delaySecond() {
    int delay = 100;
    long start = System.currentTimeMillis();
    while (start >= System.currentTimeMillis() - delay)
      ;
  }

  public static void clearAll() throws AWTException {
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_CONTROL);
    r.keyPress(KeyEvent.VK_Q);
    r.keyRelease(KeyEvent.VK_CONTROL);
    r.keyRelease(KeyEvent.VK_Q);
  }

  public static final String LEGEND = ""
          +"\n"
          + Colors.GREEN_BRIGHT + "LEGEND:      "
          + Colors.YELLOW + " 0 < 10% " + Colors.RESET + " | "
          + Colors.BLUE + "11 < 20% " + Colors.RESET + " | "
          + Colors.CYAN + "21 < 30% " + Colors.RESET + " | "
          + Colors.RED + " > 30% " + Colors.RESET + " | "
          + "\n"

          ;
  public static final String SHOW_ALL_MENU_MAIN = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "
          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  7 - User  " + Colors.RESET + " ";
  public static final String SHOW_ALL_MENU_ID = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.BLUE_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "
          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  7 - User  " + Colors.RESET + " ";
  public static final String SHOW_ALL_MENU_USER = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.BLUE_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  7 - User  " + Colors.RESET + " ";
  public static final String SHOW_ALL_MENU_CATEGORY = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.BLUE_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "
          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  7 - User  " + Colors.RESET + " ";
  public static final String SHOW_ALL_MENU_AMOUNT = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.BLUE_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "
          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  7 - User  " + Colors.RESET + " ";

  public static final String SHOW_ALL_MENU_CHART_DATE = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "
          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.BLUE_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  7 - User  " + Colors.RESET + " ";

    public static final String SHOW_ALL_MENU_CHART_CATEGORY = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "
          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.BLUE_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  7 - User  " + Colors.RESET + " ";

  public static final String SHOW_ALL_MENU_CHART_USER = ""
          + Colors.YELLOW_BRIGHT + "SORT BY:      " + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1-Id " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 2-User " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 3-Category " + Colors.RESET + " "
          + Colors.YELLOW_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 4-Amount " + Colors.RESET + " "
          + "                                "
          + Colors.GREEN_BRIGHT + "CHART BY:     "     +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  5 - Date  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.GREEN_BACKGROUND + "  6 - Category  " + Colors.RESET + " "
          +   Colors.WHITE_BOLD_BRIGHT + Colors.BLUE_BACKGROUND + "  7 - User  " + Colors.RESET + " ";

  public static final String SHOW_SUB_MENU_CHART = ""
          +"\n"
          + Colors.BLUE_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 0 - <┈┈┘  " + Colors.RESET + " "  + Colors.BLUE_BACKGROUND + Colors.WHITE_BOLD_BRIGHT + " 1 - Main menu " + Colors.RESET + " ";

    public static void recordsMenu(List<Record> records) throws IOException, ParseException, AWTException, UnsupportedAudioFileException, LineUnavailableException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        System.out.println();
        System.out.print(Colors.GRAY + "Choose command: " + Colors.RESET);
        String key = br.readLine();
        switch (key) {
          case "1": {
            File file = new File("src/classes/1.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clearAll();
            delaySecond();
            Submenu.printHeader();
            Submenu.delaySecond();
            Output.printList(records);
            System.out.println(SHOW_ALL_MENU_ID);
            Output.printList(Operations.sortByID(records));
            Submenu.recordsMenu(records);
            break;
          }
          case "2": {
            File file = new File("src/classes/1.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clearAll();
            delaySecond();
            Submenu.printHeader();
            Submenu.delaySecond();
            Output.printList(records);
            System.out.println(SHOW_ALL_MENU_USER);
            Output.printList(Operations.sortByUser(records));
            Submenu.recordsMenu(records);
            break;
          }
          case "3": {
            File file = new File("src/classes/1.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clearAll();
            delaySecond();
            System.out.println(SHOW_ALL_MENU_CATEGORY);
            Output.printList(Operations.sortByCategory(records));
            break;
          }
          case "4": {
            File file = new File("src/classes/1.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clearAll();
            delaySecond();
            System.out.println(SHOW_ALL_MENU_AMOUNT);
            Output.printList(Operations.sortByAmount(records));
            break;
          }
          case "5": {
            File file = new File("src/classes/1.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            clearAll();
            delaySecond();
            Output.chartDate(records, Operations.getMinData(records), Operations.getMaxData(records));
            System.out.println(LEGEND);
            System.out.println(SHOW_SUB_MENU_CHART);
//            System.out.println(SHOW_ALL_MENU_CHART_DATE);
            break;
          }
        }
      }
    }
                /*
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
   * @param records    List of Record with payments (can be sorted and filtered before)
   * @param categories List of Categories
   * @throws IOException    IO error
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
    String categoryName = "";
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
    System.out.print(Colors.BLUE + "Input comment:     ");
    String comment = br.readLine();
    System.out.println("Current date: " + Operations.dateToString(currentDate));
    System.out.print(Colors.BLUE + "Input date or 'Enter' for current date (dd.MM.yyyy):  ");
    String startDate = br.readLine();
    if (!startDate.isEmpty()) {
      stDate = formatter.parse(startDate);
    }
    if (!income) {
      for (int i = 0; i < categories.size(); ++i) {
        System.out.println("" + i + " " + categories.get(i).getTitle());
      }
      System.out.print("Choose category from list (1-10):      ");
      int cat = Integer.parseInt(br.readLine());
      categoryName = categories.get(cat).getTitle();//get category by number and get title
    }
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
        record.setComment(comment);
        record.setCategory(categoryName);
        if (!income) {
          multiply = -1;
        }
        amount *= multiply;
        record.setAmount(amount);
        records.add(record);

        IOCrypto.makeNewOutputCryptoFile(records, IOCrypto.list);
        return;
      }
    }
  }

  /**
   * Edit existing record, only fields: Income/Expenses; Comment; Amount; Category
   *
   * @param records    List of Record with payments (can be sorted and filtered before)
   * @param categories List of Categories
   * @throws IOException IO error
   */
  public static void editRecord(List<Record> records, List<Category> categories)
      throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input ID of record to delete: ");
    boolean income = false;
    double amount = 0;
    int multiply = 1;
    String comment = "";
    String categoryName = "";

    int id = Integer.parseInt(br.readLine());
    System.out.print("Want you change INCOME/EXPENSES? [y/n] ");
    String input = br.readLine();
    if (input.equalsIgnoreCase("y")) {
      System.out.print(Colors.BLUE + "Is this income or expenses (i/e):     ");
      String incomeOrExpenses = br.readLine();
      if (incomeOrExpenses.equalsIgnoreCase("i")) {
        income = true;
      }
    }
    System.out.print("Want you change comment? [y/n] ");
    input = br.readLine();
    if (input.equalsIgnoreCase("y")) {
      System.out.print(Colors.BLUE + "Input comment:     ");
      comment = br.readLine();
    }
    System.out.print("Want you change comment? [y/n] ");
    input = br.readLine();
    if (input.equalsIgnoreCase("y")) {
      for (int i = 0; i < categories.size(); ++i) {
        System.out.println("" + i + " " + categories.get(i).getTitle());
      }
      System.out.print("Choose category from list (1-10):      ");
      int cat = Integer.parseInt(br.readLine());
      categoryName = categories.get(cat).getTitle();//get category by number and get title
    }
    System.out.print("Want you change AMOUNT? [y/n] ");
    input = br.readLine();
    if (input.equalsIgnoreCase("y")) {
      System.out.print("Input amount:      ");
      amount = Double.parseDouble(br.readLine());
    }
    System.out.println();
    System.out.print(Colors.WHITE_BACKGROUND_BRIGHT + Colors.BLACK_BOLD + " s - SAVE " +
        Colors.RESET + " " + Colors.WHITE_BACKGROUND_BRIGHT +
        Colors.BLACK_BOLD + " e-EXIT: " + Colors.RESET);
    while (true) {
      String command = br.readLine();
      if (command.equalsIgnoreCase("e")) {
        return;
      } else if (command.equalsIgnoreCase("s")) {
        for (Record record : records) {
          if (record.getId() == id) {
            if (categoryName.equals(record.getCategory())) {
              record.setCategory(categoryName);
            }
            if (!income) {
              multiply = -1;
            }
            amount *= multiply;
            if (amount != record.getAmount()) {
              record.setAmount(amount);
            }
            if (!comment.equals(record.getComment())) {
              record.setComment(comment);
            }
            IOCrypto.makeNewOutputCryptoFile(records, IOCrypto.list);
          }
        }
        return;
      }
    }
  }

  /**
   * Delete record from list of records.
   *
   * @param records List of records
   * @throws IOException if IO error
   */
  public static void deleteRecord(List<Record> records) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Input ID of record to delete: ");
    int id = Integer.parseInt(br.readLine());
    System.out.println("Are you sure you want to delete record? [y/n]");
    String input = br.readLine();
    if (!input.equalsIgnoreCase("y")) {
      return;
    }
    records.removeIf(record -> record.getId() == id);
    IOCrypto.makeNewOutputCryptoFile(records, IOCrypto.list);
  }
}



