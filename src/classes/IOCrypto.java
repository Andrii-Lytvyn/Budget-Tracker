package classes;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class IOCrypto {

  final static int CRYPTO = -211;
  final public static String SEP = ",";
  public static List<String> list = new ArrayList<>();

  /**
   * Overwrites List of Records character-by-character by changing number ASCII -> (code)+CRYPTO
   *
   * @param records ListRecord for crypt.
   */
  public static void makeCrypto(List<Record> records) {
    list.clear();
    StringBuilder tempString = new StringBuilder();
    int j = 0;
    for (Record items : records) {
      String line = recordToCryptoString(items);
      for (int i = 0; i < line.length(); i++) {
        int code = (int) line.charAt(i) + CRYPTO;
        tempString.append((char) code);
      }
      list.add(j, tempString.toString());
      tempString = new StringBuilder();
      j++;
    }
  }

  /**
   * Methods decrypt file, parse it and add records to ListRecord.
   * Use methods parseRecordFromString().
   * <p>
   * Check empty file.
   *
   * @param cryptoFile - File for decrypts.
   * @throws IOException throw.
   */
  public static void makeUnCrypt(File cryptoFile, List<Record> records) throws IOException, ParseException {
    if (cryptoFile.length() == 0) {
      System.out.println("Empty file");
    } else {
      try {
        BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
        for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
          StringBuilder tempString = new StringBuilder();
          for (int i = 0; i < row.length(); i++) {
            int code = (int) row.charAt(i) - CRYPTO;
            tempString.append((char) code);
          }
          parseRecordFromString(tempString.toString(), records);
        }
        inputFileReader.close();
      } catch (FileNotFoundException f) {
        cryptoFile = new File("src/res/crypto.txt");
        BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
        for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
          StringBuilder tempString = new StringBuilder();
          for (int i = 0; i < row.length(); i++) {
            int code = (int) row.charAt(i) - CRYPTO;
            tempString.append((char) code);
          }
          parseRecordFromString(tempString.toString(), records);
        }
        inputFileReader.close();
      }
    }
  }

  /**
   * Parse and add record from String to List Record.
   *
   * @param line    String from file.
   * @param records records for adding.
   * @throws ParseException can throw.
   */
  public static void parseRecordFromString(String line, List<Record> records) throws ParseException {
    String[] temp = line.split(SEP);
    Record record = new Record();
    record.setId(Integer.parseInt(temp[0]));
    record.setDate(Operations.stringToDate(temp[1]));
    record.setUser(temp[2]);
    record.setAmount(Double.parseDouble(temp[3]));
    record.setCategory(temp[4]);
    record.setComment(temp[5]);
    records.add(record);
  }

  /**
   * Make record to Crypto String
   *
   * @param record Records for parsing
   * @return parsed String from Record
   */
  public static String recordToCryptoString(Record record) {
    return record.getId() + "," + Operations.dateToString(record.getDate()) + "," + record.getUser() + "," + record.getAmount() +
            "," + record.getCategory() + "," + record.getComment();
  }

  /**
   * Method make new Output crypto file
   *
   * @param records list of Records
   * @param list    List of crypto items
   * @throws IOException can throw
   */
  public static void makeNewOutputCryptoFile(List<Record> records, List<String> list) throws IOException {
    makeCrypto(records);
    makeOutputCryptoFile(list);
  }

  /**
   * DON'T DELETE
   * Unencrypted file is decomposed
   *
   * @param fileName - Unencrypted file for parsing
   * @param records  - list records for adding
   * @throws IOException    throws
   * @throws ParseException throws
   */
  public static void parseFileUnencrypted(File fileName, List<Record> records) throws IOException, ParseException {
    //list.clear();
    BufferedReader inputFileReader = new BufferedReader(new FileReader(fileName));
    for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
      parseRecordFromString(row, records);
    }
  }

  /**
   * Make output encrypted file from encrypted List
   *
   * @param list list for encrypting
   * @throws IOException throws
   */
  public static void makeOutputCryptoFile(List<String> list) throws IOException {
    try {
      FileWriter cryptoFile = new FileWriter("src/res/crypto.txt");
      for (String items : list) {
        cryptoFile.write(items + "\n");
      }
      cryptoFile.close();
    } catch (FileNotFoundException e) {
      FileWriter cryptoFile = new FileWriter("src/res/crypto.txt");
      for (String items : list) {
        cryptoFile.write(items + "\n");
      }
      cryptoFile.close();
    } catch (IOException e) {
      System.err.println("Input/output exception: " + e.getMessage());
    }
  }
}
