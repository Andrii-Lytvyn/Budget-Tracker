package classes;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class I_O_Crypto {

  final static int CRYPTO = 1;
  final public static String SEP = ",";
  final static List<String> list = new ArrayList<>();

  /**
   * Overwrites the sheet character-by-character by shifting the ASCII code by the number when CRYPTO > 0 to the right
   * When CRYPTO < 0 to the left
   * интересно зашифрует ли рекорды вместо листа
   *
   * @param records hand over the sheet for encryption
   */
  public static void makeCrypto(List<Record> records) {
    StringBuilder tempString = new StringBuilder();
    int j = 0;
    for (Record items : records) {
      String line = recordToString(items);
      for (int i = 0; i < line.length(); i++) {
        int code = (int) line.charAt(i) + CRYPTO;
        tempString.append((char) code);
      }
      list.add(j, tempString.toString());
      tempString = new StringBuilder();
      j++;
    }
    list.forEach(System.out::println);
  }

  /**
   * Метод записывает всю информацию из файла в лист. Дешифрует его. Лист изначально очищается.
   *
   * @param cryptoFile - файл с шифрованными данными
   * @throws IOException выбрасывает
   */
  public static void addInfoFromFileToList(File cryptoFile) throws IOException {
    list.clear();
    BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
    for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
      StringBuilder tempString = new StringBuilder();
      for (int i = 0; i < row.length(); i++) {
        int code = (int) row.charAt(i)/* - CRYPTO*/;
        tempString.append((char) code);
      }
      list.add(tempString.toString());
    }
  }

  /**
   * Метод по расшифровке файла. Проверяет не пустой ли файл. Если нет расшифровывает и отображает записи.
   *
   * @param cryptoFile - Файл для расшифровки
   * @throws IOException выбрасывает
   */
  public static void makeUnCrypt(File cryptoFile, List<Record> records) throws IOException, ParseException {
    BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
    if (cryptoFile.length() == 0) {
      System.out.println("Файл пуст");
    } else {
      for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < row.length(); i++) {
          int code = (int) row.charAt(i) - CRYPTO;
          tempString.append((char) code);
        }
        //System.out.println(tempString);
        parseRecordFromString(tempString.toString(), records);
      }
      //   list.forEach(System.out::println); - это просто крутая запись.

      inputFileReader.close();
    }
  }

  /**
   * Parse and add record from String
   *
   * @param line    String from file
   * @param records records for adding
   * @throws ParseException can
   */
  public static void parseRecordFromString(String line, List<Record> records) throws ParseException {
    for (int i = 0; i < line.length(); ++i) {
      String[] temp = line.split(SEP);
      Record record = new Record();
      record.setId(Integer.parseInt(temp[0]));
      record.setDate(Operations.stringToDate(temp[1]));
      record.setUser(temp[2]);
      record.setAmount(Double.parseDouble(temp[3]));
      record.setCategory(temp[4]);
      record.setComment(temp[5]);
      records.add(record);
      System.out.println(recordToString(record));
      return;
    }
  }

  /**
   * Метод читает зашифрованные записи из файла
   *
   * @param cryptoFile
   * @throws IOException
   */
  public static void readCrypted(File cryptoFile) throws IOException {

    if (cryptoFile.length() == 0) {
      System.out.println("Файл пуст");
    } else {
      System.out.println("Зашифрованные записи: \n");
      BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
      for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
        System.out.println(row);
      }
      System.out.println();
      inputFileReader.close();
    }
  }


  /**
   * Make string from Record
   *
   * @return
   */
  public static String recordToString(Record record) {
    return record.getId() + "," + Operations.dateToString(record.getDate()) + "," + record.getUser() + "," + record.getAmount() +
            "," + record.getCategory() + "," + record.getComment() + "\n";
  }

  /**
   * Make output file from record list.
   *
   * @param records - add list Records
   * @throws IOException can throw
   */

  public static void makeOutputFile(List<Record> records) throws IOException {
    try {
      FileWriter fileWriter = new FileWriter("src/res/budget.txt");
      for (Record r : records) {
        fileWriter.write(recordToString(r));
      }
      fileWriter.close();
    } catch (FileNotFoundException e) {
      System.err.println("File not found: " + e.getMessage());
      //FileWriter fileWriter = new FileWriter("src/res/budget.txt");
    } catch (IOException e) {
      System.err.println("Input/output exception: " + e.getMessage());
    }
  }

  public static void parseFileUncrypted(File cryptoFile, List<Record> records) throws IOException, ParseException {
    //list.clear();
    BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
    for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
      parseRecordFromString(row, records);
    }
  }


}
