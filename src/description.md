# BudgetTracker.java
* Main file of project. Entrance point.
---
# Operations.java
* Operations with data, sorts, filters ...
---
# Output.java
* Output methods, Chart diagrams... 
---
# Submenu.java
* Edit records, Add records, Delete records ...
---
# Menu.java
* ?
---
# Users.java
* Class of users - getters, setters constructor and methods for Users
---
# Category.java
* Class of Categories - getters, setters constructor and methods for Categories
---
# Record.java
* Class of Record - getters, setters constructor and methods for Categories
* main data structure
---
# I_O_Crypto.java
* Input output operations and encryption of data files
---


## Operations.java

### 1. public static String dateToString(Date date)
* Convert Date to String with pattern "dd.MM.yyyy"
---
### 2. public static Date stringToDate(String string)
* Convert String to Date with pattern "dd.MM.yyyy"
---
### 3. public static double calcBalance(List<Record> records, Date dateBegin, Date dateEnd)
* Calculate payment balance in period
---
### 4. public static double calcExpensesPeriod(List<Record> records, Date dateBegin, Date dateEnd) 
* Calculate Expenses in period
---
### 5. public static double expensesByUser(List<Record> records, String user, Date dateBegin, Date dateEnd)
* Calculate expenses in period by User
---
### 6. public static double expensesByCategory(List<Record> records, String category, Date dateBegin, Date dateEnd)
* Calculate expenses in period by Category
---
### 7. public static double expensesByDate(List<Record> records, Date date)
* Calculate expenses in period by Date
---
### 8. public static List<Record> sortByID(List<Record> records, Date dateBegin, Date dateEnd)
* Sort part of LIst of Records by ID in period
---
### 9. public static List<Record> sortByID(List<Record> records)
* Sort part of LIst of by ID ALL Records
---
### 10. public static List<Record> sortByDate(List<Record> records, Date dateBegin, Date dateEnd)
* Sort part of LIst of Records by Date in period
---
### 11. public static List<Record> sortByDate(List<Record> records)
* Sort LIst of All Records by Date
---
### 12. public static List<Record> sortByUser(List<Record> records, Date dateBegin, Date dateEnd)
* Sort part of LIst of Records by User in period
---
### 13. public static List<Record> sortByUser(List<Record> records)
* Sort LIst of All Records by User
---
### 14. public static List<Record> sortByCategory(List<Record> records, Date dateBegin, Date dateEnd)
* Sort part of LIst of Records by Category in period
---
### 15. public static List<Record> sortByCategory(List<Record> records)
* Sort LIst of All Records by Category
---
### 16. public static List<Record> sortByAmount(List<Record> records, Date dateBegin, Date dateEnd)
* Sort part of LIst of Records by Amount in period
---
### 17. public static List<Record> sortByAmount(List<Record> records)
* Sort LIst of All Records by Amount
---
### 18. public static List<Date> datesBetween(Date dateBegin, Date dateEnd)
* Make List of dates one by one between two dates
---
### 19. public static Date getMaxData(List<Record> records)
* get Maximum date in records
---
### 20. public static Date getMinData(List<Record> records)
* get Minimum date in records
---

## Output.java
### 21. public static void printList(List<Record> records)
* Print table with list of records
---
### 22. public static void chartCategory(List<Record> records, List<Category> categories, Date dateBegin, Date dateEnd)
* print Chart with percents of expenses by Category 
---
### 23. public static void chartUser(List<Record> records, List<String> users,
* print Chart with percents of expenses by Users
---
### 24. public static void chartDate(List<Record> records, Date dateBegin, Date dateEnd)
* print Chart with percents of expenses by Data
---

## I_O_Crypto.java
### 25. public static void makeCrypto(List<Record> records)
* Overwrites the sheet character-by-character by shifting the ASCII code by the number when CRYPTO > 0 to the right
* When CRYPTO < 0 to the left
---
### 26. public static void addInfoFromFileToList(File cryptoFile)
* Метод записывает всю информацию из файла в лист. Дешифрует его. Лист изначально очищается.
---
### 27. public static void makeUnCrypt(File cryptoFile, List<Record> records)
* Метод по расшифровке файла. Проверяет не пустой ли файл. Если нет расшифровывает и отображает записи.
---  
### 28. public static void parseRecordFromString(String line, List<Record> records)
* Parse and add record from String
---
### 29. public static void readCrypted(File cryptoFile)
* Метод читает зашифрованные записи из файла
--- 
### 30. public static String recordToString(Record record)
* Make string from Record
---
### 31. public static void makeOutputFile(List<Record> records)
* Make output file from record list...
---
### 32. public static void parseFileUncrypted(File cryptoFile, List<Record> records) throws IOException, ParseException {
* parse uncrypted file of records for tests
---


## Record.java
### public int getId() 
* Get record Id
---
### public Date getDate() 
* Get record Date when record is made
---
### public String getCategory()
* Get record Category (food, goods ...)
---
### public String getUser() 
* Get record User, who make record 
---
### public double getAmount()
* Get record Amount for expenses is negative
---
### public String getComment()
* Get record Comment for record
---
### public void setId(int id) 
* Set record Id
---
### public void setDate(Date date) 
* Set record Date when record is made
---
### public void setCategory(String category)
* Set record Category (food, goods ...)
---
### public void setUser(String user)
* Set record User, who make record
---
### public void setAmount(double amount)
* Set record Amount for expenses is negative
---
### public void setComment(String comment) {
* Set record Comment for record
---
### public static int getNewRecordId(List<Record> records)
* Calculate new ID in List of records
---

## Category.java

### public void setTitle(String title) 
* Set Category Title
* ---
### public void setAllowed(boolean allowed) 
* Set flag Allowed - for parents and for children aviable different categories
* ---
### public int getId() 
* Get category Id
---
### public String getTitle()
* Get category Title
---
### public boolean isAllowed() 
* Get flag Allowed need to know show this category to children or no
---


## Users.java
