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
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println("|    Category   |                                          Amount                                            |");
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    double totalEx = -1 * Operations.calcExpensesPeriod(records, dateBegin, dateEnd);
    for (Category category : categories) {
      double categorySum = -1 * Operations.expensesByCategory(records, category.getTitle(),
          dateBegin, dateEnd); //expenses are negative
      double percent = categorySum * 100 / totalEx;
      System.out.printf("| %15s |", category.getTitle());
      for (int i = 0; i < percent; ++i) {
        System.out.print("#");
      }
      percent = Math.round(percent);
      System.out.println(" " + percent + "% " + categorySum);
    }
  }

  /**
   * print Chart with percents of expenses by Users
   *
   * @param records   List of Record with payments (can be sorted and filtered before)
   * @param users     List of Users
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   */
  public static void chartUser(List<Record> records, List<Users> users,
      Date dateBegin, Date dateEnd) {
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println("|     User      |                                           Amount                                           |");
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    double totalEx = -1 * Operations.calcExpensesPeriod(records, dateBegin, dateEnd);
    for (Users user : users) {
      double userSum = -1 * Operations.expensesByUser(records, user.getName(),
          dateBegin, dateEnd); //expenses are negative
      double percent = userSum * 100 / totalEx;
      System.out.print("| " + user.getName() + " |");
      for (int i = 0; i < percent; ++i) {
        System.out.print("#");
      }
      percent = Math.round(percent);
      System.out.println(" " + percent + "%");
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
    dates = Operations.datesBetween(dateBegin, dateEnd);
    // get total expenses for period
    double totalEx = Operations.calcExpensesPeriod(records, dateBegin, dateEnd);
    // calculate and output sum by date
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    System.out.println("|     Dates     |                                            Amount                                          |");
    System.out.println("--------------------------------------------------------------------------------------------------------------");
    for (Date date : dates) {
      double dateSum = -1 * Operations.expensesByDate(records, date); //expenses are negative
      double percent = -1 * dateSum * 100 / totalEx;
      System.out.print("| " + Operations.dateToString(date) + " |");
      for (int i = 0; i < percent; ++i) {
        System.out.print("#");
      }
      percent = Math.round(percent);
      System.out.println(" " + percent + "% " + dateSum);
    }

  }
}