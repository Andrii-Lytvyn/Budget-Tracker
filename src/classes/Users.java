package classes;

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
    Users.userName = userName;
  }

  public static String getUserName() {
    return userName;
  }

  public Users() {
  }

  /**
   * Methods read login and password from file, check it
   *
   * @param usersFile file with password and login
   * @throws IOException can throw
   */
  public static void showLogin(File usersFile) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader inputFileReader = new BufferedReader(new FileReader(usersFile));
    Map<String, String> users = new HashMap<>();
    for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
      String[] temp = row.split(IOCrypto.SEP);
      users.put(temp[0], temp[1]);
      userNames.add(temp[0]);

    }
    System.out.println();
    System.out.print(Colors.BLUE_BRIGHT + "Enter login:     " + Colors.RESET);
    String login = br.readLine();
    System.out.print(Colors.BLUE_BRIGHT + "Enter password:  " + Colors.RESET);
    String password = br.readLine();
    System.out.println();
    try {
      if (users.get(login).equals(password)) {
        System.out.println(Colors.YELLOW_BOLD_BRIGHT + "Congratulations, you're logged in! \uD83D\uDC4C" + Colors.RESET);
        Submenu.delayMain();
        setUserName(login);
      } else {
        System.err.println("Incorrect password.");
        System.out.println();
        showLogin(usersFile);
      }
    } catch (NullPointerException e) {
      System.err.println("User is not detected.");
      showLogin(usersFile);
    }
  }
}









