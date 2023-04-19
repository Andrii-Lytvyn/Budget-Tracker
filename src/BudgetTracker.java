import classes.*;
import classes.Record;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BudgetTracker {
  public static List<Record> records = new ArrayList<>();
  public static List<Record> cryptoRecords = new ArrayList<>();
  public static List<Category> categories = new ArrayList<>();
  public static List<Users> users = new ArrayList<>();

  public static void main(String[] args) throws IOException, ParseException {
   // File budgetFile = new File("src/res/budget.txt");
   // IOCrypto.parseFileUncrypted(budgetFile, records);
    File loginFile = new File("src/res/login.txt");
    File crypto = new File("src/res/crypto.txt");

    Users.showLogin(loginFile);
    System.out.println(Users.getUserName());
    Category c0 = new Category(0, "Food", false);
    categories.add(c0);
    Category c1 = new Category(1, "Goods", true);
    categories.add(c1);
    Category c2 = new Category(2, "Clothes", true);
    categories.add(c2);
    Category c3 = new Category(3, "Entertainment", false);
    categories.add(c3);
    Category c4 = new Category(4, "House", true);
    categories.add(c4);
    Category c5 = new Category(5, "Transport", true);
    categories.add(c5);
    Category c6 = new Category(6, "Fuel", true);
    categories.add(c6);
    Category c7 = new Category(7, "Hobby", false);
    categories.add(c7);
    Category c8 = new Category(7, "Vacations", false);
    categories.add(c8);
    Category c9 = new Category(7, "Medicine", false);
    categories.add(c9);


    IOCrypto.makeRecordsFromCryptoFile(crypto, records);
    IOCrypto.makeNewOutputCryptoFile(records, IOCrypto.list);
    //Submenu.addRecord(records,categories);
       Output.chartDate(records, Operations.stringToDate("01.04.2023"), Operations.stringToDate("20.04.2023"));
  }
}