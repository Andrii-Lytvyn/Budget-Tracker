package classes;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {

  /**
   * Calculate payment balance in period
   *
   * @param records   List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return Sum of payments in this period
   */
  public static double calcBalance(List<Record> records, Date dateBegin, Date dateEnd) {
    return records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .mapToDouble(Record::getAmount)
        .sum();
  }

  /**
   * Calculate expenses in period by User
   *
   * @param records   List of Record with payments
   * @param user      Username to find their expenses
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return Sum of expenses by User in this period
   */
  public static double expensesByUser(List<Record> records, String user, Date dateBegin, Date dateEnd) {
    return records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .filter(x -> x.getUser() == user)
        .mapToDouble(Record::getAmount)
        .sum();
  }

  /**
   * Calculate expenses in period by Category
   *
   * @param records   List of Record with payments
   * @param category  Category to find expenses by it
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return Sum of expenses by User in this period
   */
  public static double expensesByCategory(List<Record> records, String category, Date dateBegin, Date dateEnd) {
    return records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .filter(x -> x.getCategory() == category)
        .mapToDouble(Record::getAmount)
        .sum();
  }

  /**
   * Sort part of LIst of Records by ID in period
   *
   * @param records   List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return new sorted LIst of Records in period
   */
  public static List<Record> sortByID(List<Record> records, Date dateBegin, Date dateEnd) {
    List<Record> result;
    result = records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .sorted(Comparator.comparingInt(Record::getId))
        .collect(Collectors.toList());
    return result;
  }

  /**
   * Sort part of LIst of by ID ALL Records
   *
   * @param records List of Record with payments
   * @return new sorted LIst of Records
   */
  public static List<Record> sortByID(List<Record> records) {
    List<Record> result;
    result = records.stream()
        .sorted(Comparator.comparingInt(Record::getId))
        .collect(Collectors.toList());
    return result;
  }

  /**
   * Sort part of LIst of Records by Date in period
   *
   * @param records   List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return new sorted LIst of Records
   */
  public static List<Record> sortByDate(List<Record> records, Date dateBegin, Date dateEnd) {
    List<Record> result;
    result = records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .sorted(Comparator.comparing(Record::getDate))
        .collect(Collectors.toList());
    return result;
  }

  /**
   * Sort part of LIst of Records by User in period
   *
   * @param records   List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return new sorted LIst of Records
   */
  public static List<Record> sortByUser(List<Record> records, Date dateBegin, Date dateEnd) {
    List<Record> result;
    result = records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .sorted(Comparator.comparing(Record::getUser))
        .collect(Collectors.toList());
    return result;
  }

  /**
   * Sort part of LIst of Records by Category in period
   *
   * @param records   List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return new sorted LIst of Records
   */
  public static List<Record> sortByCategory(List<Record> records, Date dateBegin, Date dateEnd) {
    List<Record> result;
    result = records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .sorted(Comparator.comparing(Record::getCategory))
        .collect(Collectors.toList());
    return result;
  }

  /**
   * Sort part of LIst of Records by Amount in period
   *
   * @param records   List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd   End of payments period
   * @return new sorted LIst of Records
   */
  public static List<Record> sortByAmount(List<Record> records, Date dateBegin, Date dateEnd) {
    List<Record> result;
    result = records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .sorted(Comparator.comparing(Record::getAmount))
        .collect(Collectors.toList());
    return result;
  }

}
