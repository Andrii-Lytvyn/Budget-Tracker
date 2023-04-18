package classes;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
public class I_O_Crypto {

    final static int CRYPTO = 213;
    final static List<String> list = new ArrayList<>();

    /**
     * Overwrites the sheet character-by-character by shifting the ASCII code by the number when CRYPTO > 0 to the right
     * When CRYPTO < 0 to the left
     *
     * @param list hand over the sheet for encryption
     */
    private static void makeCrypto(List<String> list) {
      StringBuilder tempString = new StringBuilder();
      int j = 0;
      for (String items : list) {
        for (int i = 0; i < items.length(); i++) {
          int code = (int) items.charAt(i) + CRYPTO;
          tempString.append((char) code);
        }
        list.set(j, tempString.toString());
        tempString = new StringBuilder();
        j++;
      }
    }

    /**
     * Метод записывает всю информацию из файла в лист. Дешифрует его. Лист изначально очищается.
     *
     * @param cryptoFile - файл с шифрованными данными
     * @throws IOException выбрасывает
     */
    private static void addInfoFromFileToList(File cryptoFile) throws IOException {
      list.clear();
      BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
      for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
        StringBuilder tempString = new StringBuilder();
        for (int i = 0; i < row.length(); i++) {
          int code = (int) row.charAt(i) - CRYPTO;
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
    public static void makeUnCrypt(File cryptoFile) throws IOException {
      BufferedReader inputFileReader = new BufferedReader(new FileReader(cryptoFile));
      if (cryptoFile.length() == 0) {
        System.out.println("Файл пуст");
      } else {
        System.out.println("Расшифрованные записи: \n");
        for (String row = inputFileReader.readLine(); row != null; row = inputFileReader.readLine()) {
          StringBuilder tempString = new StringBuilder();
          for (int i = 0; i < row.length(); i++) {
            int code = (int) row.charAt(i) - CRYPTO;
            tempString.append((char) code);
          }
          System.out.println(tempString);
        }
        //   list.forEach(System.out::println); - это просто крутая запись.
        System.out.println();
        inputFileReader.close();
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
     * Создает выходной файл
     *
     * @param list передаем лист
     * @throws IOException выбрасывает
     */
    public static void makeOutputFile(List<String> list) throws IOException {
      try {
        FileWriter cryptoFile = new FileWriter("src/res/crypto.txt");
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


}
