package classes;


import java.util.Date;
import java.util.List;

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
}
