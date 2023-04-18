import classes.Category;
import classes.I_O_Crypto;
import classes.Record;
import classes.Users;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class BudgetTracker {
    public static List<Record> records= new ArrayList<>();
    public static List<Record> cryptoRecords= new ArrayList<>();
    public static List<Category> categories = new ArrayList<>();
    public static List<Users> users = new ArrayList<>();
    public static void main(String[] args) throws IOException, ParseException {
        File budgetFile = new File("src/res/budget.txt");
        I_O_Crypto.parseFileUncrypted(budgetFile,records);



    }
}