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
//    File budgetFile = new File("src/res/budget.txt");
//    File loginFile = new File("src/res/login.txt");
//    I_O_Crypto.parseFileUncrypted(budgetFile, records);
//    Record record = new Record();
//    I_O_Crypto.makeCrypto(records);
//    Users.showLogin(loginFile);
//    System.out.println(Users.getUserName());
    Submenu.printHeader();
    Submenu.showAll(records);


  }
}