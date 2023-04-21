package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import classes.Operations;
import classes.Record;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TestDateOperations {

  DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

  @Test
  public void GetMinDateFromList() throws ParseException {
    List<Record> records = new ArrayList<>();
    Record r1 = new Record(1, dateFormat.parse("10.10.2023"),
        "papa", "Food", "Pizza1", -15.00);
    Record r2 = new Record(2, dateFormat.parse("11.10.2023"),
        "papa", "Food", "Pizza2", -25.00);
    Record r3 = new Record(3, dateFormat.parse("12.10.2023"),
        "papa", "Food", "Pizza3", -27.00);
    records.add(r1);
    records.add(r2);
    records.add(r3);

    Assertions.assertEquals(dateFormat.parse("09.10.2023"), Operations.getMinData(records));
  }

  @Test
  public void GetMaxDateFromList() throws ParseException {
    List<Record> records = new ArrayList<>();
    Record r1 = new Record(1, dateFormat.parse("10.10.2023"),
        "papa", "Food", "Pizza1", -15.00);
    Record r2 = new Record(2, dateFormat.parse("11.10.2023"),
        "papa", "Food", "Pizza2", -25.00);
    Record r3 = new Record(3, dateFormat.parse("12.10.2023"),
        "papa", "Food", "Pizza3", -27.00);
    records.add(r1);
    records.add(r2);
    records.add(r3);

    assertEquals(dateFormat.parse("13.10.2023"), Operations.getMaxData(records));
  }

  @Test
  public void TestDateBetweenDates() throws ParseException {
    Date dateBegin = dateFormat.parse("01.01.2023");
    Date dateEnd = dateFormat.parse("05.01.2023");
    List<Date> dates = Operations.datesBetween(dateBegin, dateEnd);
    List<Date> expected = new ArrayList<>();
    expected.add(dateFormat.parse("01.01.2023"));
    expected.add(dateFormat.parse("02.01.2023"));
    expected.add(dateFormat.parse("03.01.2023"));
    expected.add(dateFormat.parse("04.01.2023"));

    assertEquals(expected, dates);
  }
}
