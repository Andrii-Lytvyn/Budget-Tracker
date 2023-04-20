import classes.*;
import classes.Record;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BudgetTracker {

  public static List<Record> records = new ArrayList<>();
  //  public static List<Category> categories = new ArrayList<>();
  public static List<Category> categories = Category.createCategories();

  public static void main(String[] args)
      throws IOException, ParseException, AWTException, UnsupportedAudioFileException, LineUnavailableException {
    //File budgetFile = new File("src/res/budget.txt");
    //IOCrypto.parseFileUnencrypted(budgetFile, records);
    File loginFile = new File("src/res/login.txt");
    File crypto = new File("src/res/crypto.txt");

    Category.createCategories();

    Users.showLogin(loginFile);
    Submenu.clearAll();

    IOCrypto.makeUnCrypt(crypto, records);
    IOCrypto.makeNewOutputCryptoFile(records, IOCrypto.list);

    System.out.println();
    Submenu.delaySecond();
    Submenu.printHeader();
    Submenu.delaySecond();
    Output.printList(records);
    double balance = Operations.calcBalance(records, Operations.getMinData(records),
        Operations.getMaxData(records));
    double expenses = -1 * Operations.calcExpensesPeriod(records, Operations.getMinData(records),
        Operations.getMaxData(records));
    double income = balance + expenses;
    System.out.println("Balance: " + balance + " Expenses: " + expenses + " Income: " + income);
    System.out.println(Submenu.SHOW_ALL_MENU_MAIN);
    System.out.println(Submenu.SHOW_SYSTEM_MENU_MAIN);
    Submenu.recordsMenu(records, categories);



  }
}