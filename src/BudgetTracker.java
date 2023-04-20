import classes.*;
import classes.Menu;
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
    Menu.clearAll();

    IOCrypto.makeUnCrypt(crypto, records);
    IOCrypto.makeNewOutputCryptoFile(records, IOCrypto.list);

    System.out.println();
    Menu.delaySecond();
    Menu.printHeader();
    Menu.delaySecond();
    Output.printList(records);
    Output.printFinance(records);
    System.out.println(Menu.SHOW_ALL_MENU_MAIN);
    System.out.println(Menu.SHOW_SYSTEM_MENU_MAIN);
    Menu.recordsMenu(records, categories);



  }
}