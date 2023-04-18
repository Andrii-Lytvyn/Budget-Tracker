package classes;


import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Operations {

  /**
   * Calculate payment balance in period
   *
   * @param records List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd End of payments period
   * @return Sum of payments in this period
   */
  public static double calcBalance (List<Record> records, Date dateBegin, Date dateEnd){
    return records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .mapToDouble(Record::getAmount)
        .sum();
  }

  /**
   * Sort part of LIst of Records in period
   *
   * @param records List of Record with payments
   * @param dateBegin Begin of payments period
   * @param dateEnd End of payments period
   * @return new sorted LIst of Records in period
   */
  public static List<Record> sortByID (List<Record> records, Date dateBegin, Date dateEnd){
    List<Record> result;
    result = records.stream()
        .filter(x -> x.getDate().after(dateBegin))
        .filter(x -> x.getDate().before(dateEnd))
        .sorted(Comparator.comparingInt(Record::getId))
        .collect(Collectors.toList());
    return result;
  }

  /**
   * Sort part of LIst of ALL Records
   *
   * @param records List of Record with payments
   * @return new sorted LIst of Records
   */
  public static List<Record> sortByID (List<Record> records){
    List<Record> result;
    result = records.stream()
        .sorted(Comparator.comparingInt(Record::getId))
        .collect(Collectors.toList());
    return result;
  }
}
