package classes;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Users {
  private static String userName;
  public static List<String> userNames = new ArrayList<>();
  private String name;
  private boolean child;

  public void setName(String name) {
    this.name = name;
  }

  public void setChild(boolean child) {
    this.child = child;
  }

  public boolean isChild() {
    return child;
  }

  public String getName() {
    return this.name;
  }

  public static void setUserName(String userName) {
    Users.userName= userName;
  }
  public static String getUserName() {
    return userName;
  }

  public Users() {
  }

  public static void showLogin(File usersFile) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader inputFileReader = new BufferedReader(new FileReader(usersFile));
    Map<String, String> users = new HashMap<>();
    for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
      String[] temp = row.split(I_O_Crypto.SEP);
      users.put(temp[0], temp[1]);
      userNames.add(temp[0]);
    }
    System.out.print("Enter login |mama|papa|: ");
    String login = br.readLine();
    System.out.print("Enter password |mama-1|papa-2|" );
    String password = br.readLine();
    try {
      if (users.get(login).equals(password)) {
        System.out.println("Passed");
        setUserName(login);
      } else {
        System.err.println("Incorrect password.");
        System.out.println();
        showLogin(usersFile);
        //System.exit(1);
      }
    } catch (NullPointerException e) {
      System.err.println("User is not detected.");
      System.out.println();
      showLogin(usersFile);
    }

  }

}


