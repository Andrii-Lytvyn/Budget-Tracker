package classes;
import java.util.Date;
import java.util.List;

public class Output {

  /**
   * Print table with list of records
   *
   * @param records List of Record with payments (can be sorted and filtered before)
   */
  public static void printList(List<Record> records) {
    for(Record record: records){
      String recordRow = String.format("│%6d│%24s│%25s│%22s│%24.2f│%34s│",
          record.getId(), Operations.dateToString(record.getDate()), record.getCategory(), record.getUser(), record.getAmount(), record.getComment());
      System.out.println(recordRow);
      System.out.println("├┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┼┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┤");
    }
    System.out.println("└┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┘");

    // TODO
  }

  /**
   * print Chart with percents of expenses by Category
   *
   * @param records    List of Record with payments (can be sorted and filtered before)
   * @param categories List of Categories
   * @param dateBegin  Begin of payments period
   * @param dateEnd    End of payments period
   */
  public static void chartCategory(List<Record> records, List<Category> categories,
      Date dateBegin, Date dateEnd) {
    String color = Colors.RESET;
    System.out.println(Colors.WHITE_BRIGHT + "┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
    System.out.println(Colors.WHITE_BRIGHT +"┃     CATEGORY     ┃                                           AMOUNT                                          ┃");
    System.out.println(Colors.WHITE_BRIGHT +"┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚"+Colors.RESET);
    double totalEx = -1 * Operations.calcExpensesPeriod(records, dateBegin, dateEnd);
    for (Category category : categories) {
      double categorySum = -1 * Operations.expensesByCategory(records, category.getTitle(),
          dateBegin, dateEnd); //expenses are negative
      double percent = categorySum * 100 / totalEx;
      System.out.printf("| %16s |", category.getTitle());
      for (int i = 0; i < percent; ++i) {
        if(percent < 10) color = Colors.YELLOW;
        if(percent > 10) color = Colors.BLUE;
        if(percent > 15) color = Colors.CYAN;
        if(percent > 30) color = Colors.RED_BRIGHT;
        System.out.print(color + "*");
        color = Colors.RESET;
      }
      percent = Math.round(percent);
      System.out.println(Colors.WHITE_BRIGHT + " " + Colors.WHITE_BRIGHT + categorySum + Colors.RESET + " (" + percent + "% )");
    }
  }

  public static void printFinance(List<Record> records){
    double balance = Math.round(Operations.calcBalance(records, Operations.getMinDate(records),
            Operations.getMaxDate(records)) * 100) / 100.0;
    double expenses = -1 * Math.round(Operations.calcExpensesPeriod(records, Operations.getMinDate(records),
            Operations.getMaxDate(records)) * 100) / 100.0;
    double income = balance + expenses;
    String financeColor = Colors.GREEN;
    if (balance < 0) financeColor = Colors.RED;
    System.out.println(
            "\n"
            +Colors.WHITE_BRIGHT + "BALANCE: " + Colors.RESET
            + financeColor + balance + Colors.RESET
            + Colors.WHITE + " Expenses: " + Colors.RESET
            + Colors.RED + expenses +Colors.RESET
            + Colors.WHITE + " Income: " + Colors.RESET
            + Colors.GREEN + income + Colors.RESET
            + "\n")
    ;
  }

  /**
   * print Chart with percents of expenses by Users
   *
   * @param records   List of Record with payments (can be sorted and filtered before)
   * @param users     List of Users
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   */
  public static void chartUser(List<Record> records, List<String> users,
      Date dateBegin, Date dateEnd) {
    String color = Colors.RESET;
    System.out.println(Colors.WHITE_BRIGHT + "┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
    System.out.println(Colors.WHITE_BRIGHT +"┃     USER      ┃                                           AMOUNT                                                            ┃");
    System.out.println(Colors.WHITE_BRIGHT +"┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚"+Colors.RESET);
    double totalEx = -1 * Operations.calcExpensesPeriod(records, dateBegin, dateEnd);
    for (String user : users) {
      double userSum = -1 * Operations.expensesByUser(records, user,
          dateBegin, dateEnd); //expenses are negative
      double percent = userSum * 100 / totalEx;
      System.out.print(Colors.WHITE_BRIGHT + "┃      " + user + "     ┃" + Colors.RESET);
      for (int i = 0; i < percent; ++i) {
        if(percent < 10) color = Colors.YELLOW;
        if(percent > 10) color = Colors.BLUE;
        if(percent > 15) color = Colors.CYAN;
        if(percent > 30) color = Colors.RED_BRIGHT;
        System.out.print(color + "*");
        color = Colors.RESET;
      }

      percent = Math.round(percent);
      System.out.println(Colors.WHITE_BRIGHT + " " + Colors.WHITE_BRIGHT + userSum + Colors.RESET + " (" + percent + "% )");
    }
  }


  /**
   * print Chart with percents of expenses by Data
   *
   * @param records   List of Record with payments (can be sorted and filtered before)
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   */
  public static void chartDate(List<Record> records, Date dateBegin, Date dateEnd) {
    List<Date> dates;
    String color = Colors.RESET;
    dates = Operations.datesBetween(dateBegin, dateEnd);
    // get total expenses for period
    double totalEx = Operations.calcExpensesPeriod(records, dateBegin, dateEnd);
    // calculate and output sum by date
    System.out.println(Colors.WHITE_BRIGHT + "┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┰┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
    System.out.println(Colors.WHITE_BRIGHT +"┃     DATE      ┃                                           AMOUNT                                          ┃");
    System.out.println(Colors.WHITE_BRIGHT +"┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┸┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚"+Colors.RESET);
    for (Date date : dates) {
      double dateSum = -1 * Operations.expensesByDate(records, date); //expenses are negative
      double percent = -1 * dateSum * 100 / totalEx;
      if(percent == 0) continue;
      System.out.print("┃   " + Operations.dateToString(date) + "  ┃");
      for (int i = 0; i < percent; ++i) {
        if(percent < 10) color = Colors.YELLOW;
        if(percent > 10) color = Colors.BLUE;
        if(percent > 15) color = Colors.CYAN;
        if(percent > 30) color = Colors.RED_BRIGHT;
        System.out.print(color + "*");
      }
      color = Colors.RESET;
      System.out.print(Colors.RESET);
      percent = Math.round(percent);
      System.out.println(Colors.WHITE_BRIGHT + " " + Colors.WHITE_BRIGHT + dateSum + Colors.RESET + " (" + percent + "% )");
    }
  }

}