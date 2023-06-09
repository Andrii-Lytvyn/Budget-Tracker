# BudgetTracker.java
* Main file of project. Entrance point.
---
# Operations.java
* Operations with data, sorts, filters ...
---
# Output.java
* Output methods, Chart diagrams... 
---
# Menu.java
* Edit records, Add records, Delete records ...
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
# IOCrypto.java
* Input output operations and encryption of data files
---


## Operations.java

### public static String dateToString(Date date)
* Convert Date to String with pattern "dd.MM.yyyy"
---
### public static Date stringToDate(String string)
* Convert String to Date with pattern "dd.MM.yyyy"
---
### public static double calcBalance(List<Record> records, Date dateBegin, Date dateEnd)
* Calculate payment balance in period
---
### public static double calcExpensesPeriod(List<Record> records, Date dateBegin, Date dateEnd) 
* Calculate Expenses in period
* dateBegin - must be one day before of first day of period
* dateEnd must be one day after last day of period
---
### public static double expensesByUser(List<Record> records, String user, Date dateBegin, Date dateEnd)
* Calculate expenses in period by User

* dateBegin - must be one day before of first day of period
* dateEnd must be one day after last day of period
---
### public static double expensesByCategory(List<Record> records, String category, Date dateBegin, Date dateEnd)
* Calculate expenses in period by Category
*
* dateBegin - must be one day before of first day of period
* dateEnd must be one day after last day of period
---
### public static double expensesByDate(List<Record> records, Date date)
* Calculate expenses in period by Date
---
### public static List<Record> sortByID(List<Record> records)
* Sort part of LIst of by ID ALL Records
---
### public static List<Record> sortByDate(List<Record> records)
* Sort LIst of All Records by Date
---
### public static List<Record> sortByUser(List<Record> records)
* Sort LIst of All Records by User
---
### public static List<Record> sortByCategory(List<Record> records)
* Sort LIst of All Records by Category
---
### public static List<Record> sortByAmount(List<Record> records)
* Sort LIst of All Records by Amount
---
### public static List<Date> datesBetween(Date dateBegin, Date dateEnd)
* Make List of dates one by one between two dates
* dateBegin - must be one day before of first day of period
* dateEnd must be one day after last day of period
---
### public static Date getMaxDate(List<Record> records)
* get Maximum date in records
---
### public static Date getMinDate(List<Record> records)
* get Minimum date in records
---

## Output.java
### public static void printList(List<Record> records)
* Print table with list of records
---
### public static void chartCategory(List<Record> records, List<Category> categories, Date dateBegin, Date dateEnd)
* print Chart with percents of expenses by Category
* dateBegin - must be one day before of first day of period
* dateEnd must be one day after last day of period
---
### public static void chartUser(List<Record> records, List<String> users,
* print Chart with percents of expenses by Users
* dateBegin - must be one day before of first day of period
* dateEnd must be one day after last day of period
---
### public static void chartDate(List<Record> records, Date dateBegin, Date dateEnd)
* print Chart with percents of expenses by Data
* dateBegin - must be one day before of first day of period
* dateEnd must be one day after last day of period
---
### public static void printFinance(List<Record> records)
* print calculation of Balance, Expanses and Income

## IOCrypto.java
### public static void makeCrypto(List<Record> records)
* Overwrites the sheet character-by-character by shifting the ASCII code by the number when CRYPTO > 0 to the right
* When CRYPTO < 0 to the left
---

### public static void makeUnCrypt(File cryptoFile, List<Record> records)
* Methods decrypt file, parse it and add records to ListRecord.
* Use methods parseRecordFromString().
---  
### public static void parseRecordFromString(String line, List<Record> records)
* Parse and add record from String to List Record
---
### parseRecordFromString(String line, List<Record> records)
* Make string from Record
* Parse and add record from String to List Record.
---
### public static void parseRecordFromString(String line, List<Record> records)
* Parse and add record from String to List Record.
---
### public static String recordToCryptoString(Record record)
* Make record to Crypto String
---
### public static void makeNewOutputCryptoFile(List<Record> records, List<String> list)
* Method make new Output crypto file
---
### public static void makeOutputCryptoFile(List<String> list)
* Make output encrypted file from encrypted List
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
* Set record id
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

### public String getTitle()
* Get category Title
---



## Users.java
### public static void showLogin(File usersFile)
* Methods read login and password from file, check it
---
### 