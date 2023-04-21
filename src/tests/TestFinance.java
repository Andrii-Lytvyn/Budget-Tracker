package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import classes.Operations;
import classes.Record;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestFinance {

  DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

  @Test
  public void checkCalcBalance() throws ParseException {
    List<Record> records = new ArrayList<>();
    Record r1 = new Record(1, dateFormat.parse("10.10.2023"),
        "papa", "Food", "Pizza1", -15.00);
    Record r2 = new Record(2, dateFormat.parse("11.10.2023"),
        "papa", "Food", "Pizza2", -25.00);
    Record r3 = new Record(3, dateFormat.parse("12.10.2023"),
        "papa", "Food", "Pizza3", -27.00);
    Record r4 = new Record(4, dateFormat.parse("11.10.2023"),
        "papa", "Income", "Salary", 1200.00);

    records.add(r1);
    records.add(r2);
    records.add(r3);
    records.add(r4);

    Assertions.assertEquals(1133.00, Operations.calcBalance(records, dateFormat.parse("09.10.2023"),
        dateFormat.parse("13.10.2023")));
    assertEquals(1148.00, Operations.calcBalance(records, dateFormat.parse("10.10.2023"),
        dateFormat.parse("13.10.2023")));
  }

  @Test
  public void checkExpensesByPeriod() throws ParseException {
    List<Record> records = new ArrayList<>();
    Record r1 = new Record(1, dateFormat.parse("10.10.2023"),
        "mama", "Food", "Pizza1", -15.00);
    Record r2 = new Record(2, dateFormat.parse("11.10.2023"),
        "papa", "Goods", "Smartphone", -450.00);
    Record r3 = new Record(3, dateFormat.parse("12.10.2023"),
        "papa", "Transport", "Ticket to Berlin", -49.00);
    Record r4 = new Record(4, dateFormat.parse("11.10.2023"),
        "mama", "Income", "Salary", 1200.00);
    Record r5 = new Record(1, dateFormat.parse("12.10.2023"),
        "mama", "Food", "Pizza2", -15.00);

    records.add(r1);
    records.add(r2);
    records.add(r3);
    records.add(r4);
    records.add(r5);

    assertEquals(-529.00,
        Operations.calcExpensesPeriod(records,  dateFormat.parse("09.10.2023"),
            dateFormat.parse("13.10.2023")));
    assertEquals(-514.00,
        Operations.calcExpensesPeriod(records,  dateFormat.parse("10.10.2023"),
            dateFormat.parse("13.10.2023")));
    assertEquals(-450.00,
        Operations.calcExpensesPeriod(records,  dateFormat.parse("10.10.2023"),
            dateFormat.parse("12.10.2023")));
  }


  @Test
  public void checkExpensesByCategory() throws ParseException {
    List<Record> records = new ArrayList<>();
    Record r1 = new Record(1, dateFormat.parse("10.10.2023"),
        "mama", "Food", "Pizza1", -15.00);
    Record r2 = new Record(2, dateFormat.parse("11.10.2023"),
        "papa", "Goods", "Smartphone", -450.00);
    Record r3 = new Record(3, dateFormat.parse("12.10.2023"),
        "papa", "Transport", "Ticket to Berlin", -49.00);
    Record r4 = new Record(4, dateFormat.parse("11.10.2023"),
        "mama", "Income", "Salary", 1200.00);
    Record r5 = new Record(1, dateFormat.parse("12.10.2023"),
        "mama", "Food", "Pizza2", -15.00);

    records.add(r1);
    records.add(r2);
    records.add(r3);
    records.add(r4);
    records.add(r5);

    assertEquals(-30.00,
        Operations.expensesByCategory(records, "Food", dateFormat.parse("09.10.2023"),
            dateFormat.parse("13.10.2023")));
    assertEquals(-15.00,
        Operations.expensesByCategory(records, "Food", dateFormat.parse("09.10.2023"),
            dateFormat.parse("12.10.2023")));
    assertEquals(-49.00,
        Operations.expensesByCategory(records, "Transport", dateFormat.parse("09.10.2023"),
            dateFormat.parse("13.10.2023")));
    assertEquals(-450.00,
        Operations.expensesByCategory(records, "Goods", dateFormat.parse("09.10.2023"),
            dateFormat.parse("13.10.2023")));
  }

  @Test
  public void checkExpensesByUser() throws ParseException {
    List<Record> records = new ArrayList<>();
    Record r1 = new Record(1, dateFormat.parse("10.10.2023"),
        "mama", "Food", "Pizza1", -15.00);
    Record r2 = new Record(2, dateFormat.parse("11.10.2023"),
        "papa", "Goods", "Smartphone", -450.00);
    Record r3 = new Record(3, dateFormat.parse("12.10.2023"),
        "papa", "Transport", "Ticket to Berlin", -49.00);
    Record r4 = new Record(4, dateFormat.parse("11.10.2023"),
        "mama", "Income", "Salary", 1200.00);
    Record r5 = new Record(1, dateFormat.parse("12.10.2023"),
        "mama", "Food", "Pizza2", -15.00);

    records.add(r1);
    records.add(r2);
    records.add(r3);
    records.add(r4);
    records.add(r5);

    assertEquals(-30.00,
        Operations.expensesByUser(records, "mama", dateFormat.parse("09.10.2023"),
            dateFormat.parse("13.10.2023")));
    assertEquals(-499.00,
        Operations.expensesByUser(records, "papa", dateFormat.parse("09.10.2023"),
            dateFormat.parse("13.10.2023")));
  }

  @Test
  public void checkExpensesByDate() throws ParseException {
    List<Record> records = new ArrayList<>();
    Record r1 = new Record(1, dateFormat.parse("10.10.2023"),
        "mama", "Food", "Pizza1", -15.00);
    Record r2 = new Record(2, dateFormat.parse("11.10.2023"),
        "papa", "Goods", "Smartphone", -450.00);
    Record r3 = new Record(3, dateFormat.parse("12.10.2023"),
        "papa", "Transport", "Ticket to Berlin", -49.00);
    Record r4 = new Record(4, dateFormat.parse("11.10.2023"),
        "mama", "Income", "Salary", 1200.00);
    Record r5 = new Record(1, dateFormat.parse("12.10.2023"),
        "mama", "Food", "Pizza2", -15.00);

    records.add(r1);
    records.add(r2);
    records.add(r3);
    records.add(r4);
    records.add(r5);

    assertEquals(-15.00,
        Operations.expensesByDate(records, dateFormat.parse("10.10.2023")));
    assertEquals(-450.00,
        Operations.expensesByDate(records, dateFormat.parse("11.10.2023")));
    assertEquals(-64.00,
        Operations.expensesByDate(records, dateFormat.parse("12.10.2023")));
  }


}
