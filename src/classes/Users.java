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

  public static void getLoginFromFile(File usersFile) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader inputFileReader = new BufferedReader(new FileReader(usersFile));
    Map<String, String> users = new HashMap<>();
    for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
      String[] temp = row.split(I_O_Crypto.SEP);
      users.put(temp[0], temp[1]);

      userNames.add(temp[0]);
    }
 //  makeCrypto(userNames);

  }

//TODO Crypto ADDER TO FILE

  public static void makeCrypto(List<String> list) throws IOException {
    StringBuilder tempString = new StringBuilder();
    int j = 0;
    for (String items : list) {
      for (int i = 0; i < items.length(); i++) {
        int code = (int) items.charAt(i) + I_O_Crypto.CRYPTO;
        tempString.append((char) code);
      }
      list.set(j, tempString.toString());
      tempString = new StringBuilder();
      j++;
    }
    makeOutputLoginFile(list);
  }
//TODO Чтение зашифрованного файла

  //TODO запись зашифрованного имени и логина
  public static void makeOutputLoginFile(List<String> list) throws IOException {
    try {
      FileWriter cryptoFile = new FileWriter("src/res/login.txt");
      for (String items : list) {
        cryptoFile.write(items + "\n");
      }
      cryptoFile.close();
    } catch (FileNotFoundException e) {
      FileWriter cryptoFile = new FileWriter("src/res/crypto.txt");
    } catch (IOException e) {
      System.err.println("Input/output exception: " + e.getMessage());
    }
  }
  public static void makeUnCrypt(File cryptoFile) throws IOException {
    BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
    if (cryptoFile.length() == 0) {
      System.out.println("Файл пуст");
    } else {
      System.out.println("Расшифрованные записи: \n");
      for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < row.length(); i++) {
          int code = (int) row.charAt(i) - I_O_Crypto.CRYPTO;
          tempString.append((char) code);
        }
        System.out.println(tempString);
      }
      //   list.forEach(System.out::println); - это просто крутая запис.
      System.out.println();
      inputFileReader.close();
    }
  }










}









