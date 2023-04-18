package classes;

import java.util.Date;
import java.util.List;

public class Record {
  private int id;
  private Date date;
  private String category;
  private String user; // must decide, may be use class Users
  private double amount;
  private String comment;

  public int getId() {
    return id;
  }

  public Date getDate() {
    return date;
  }

  public String getCategory() {
    return category;
  }

  public String getUser() {
    return user;
  }

  public double getAmount() {
    return amount;
  }

  public String getComment() {
    return comment;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Record() {
  }

  /**
   * Calculate new ID in List of records
   *
   * @param records List of records
   * @return new ID
   */
  public static int getNewRecordId(List<Record> records) {
    int max = 1;
    for (Record record : records) {
      if (record.getId() >= max) {
        max = record.getId() + 1;
      }
    }
    return max;
  }

}
