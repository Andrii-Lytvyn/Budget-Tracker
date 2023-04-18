package classes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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

    for (Category category : categories) {
      double categorySum = Operations.expensesByCategory(records, category.getTitle(),
          dateBegin, dateEnd);
      System.out.println(category.getTitle() + " " + categorySum);
      // TODO Chart print in percents: Category and categorySum
      //  (height or width proportional to percentage. quantity as Categories)
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

    for (Users user : users) {
      double userSum = Operations.expensesByUser(records, user.getName(),
          dateBegin, dateEnd);
      System.out.println(user.getName() + " " + userSum);
      // TODO Chart print in percents: User and userSum
      //  (height or width proportional to percentage. quantity as Users)

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
    // make List of dates between dateBegin and dateEnd
    List<Date> dates = new ArrayList<>();
    Calendar calendar = new GregorianCalendar();
    // setup calendar for dateBegin
    calendar.setTime(dateBegin);
    // fill List of dates one by one
    while (calendar.getTime().before(dateEnd)) // dateEnd exclusive!
    {
      Date result = calendar.getTime(); // get date from current day
      dates.add(result); // add to list of dates current date
      calendar.add(Calendar.DATE, 1); // move day in calendar one dey front
    }
    // get total expenses for period
    double totalEx = Operations.calcExpensesPeriod(records, dateBegin, dateEnd);
    // calculate and output sum by date
    for (Date date : dates) {
      double dateSum = Operations.expensesByDate(records, date);
      double percent = dateSum * 100 / totalEx;
      System.out.println(Operations.dateToString(date) + " " + percent);
      // TODO visual CHART
    }

  }
}