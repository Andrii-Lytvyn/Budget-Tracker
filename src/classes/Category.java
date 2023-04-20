package classes;

import java.util.ArrayList;
import java.util.List;

public class Category {

  private int id;
  private String title;
  private boolean allowed;

  public void setId(int id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAllowed(boolean allowed) {
    this.allowed = allowed;
  }

  public int getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public boolean isAllowed() {
    return allowed;
  }

  public Category() {
  }

  public Category(int id, String title, boolean allowed) {
    this.id = id;
    this.title = title;
    this.allowed = allowed;
  }

  public static List<Category> categories = new ArrayList<>();

  public static List createCategories() {

    Category c0 = new Category(0, "Food", false);
    categories.add(c0);
    Category c1 = new Category(1, "Goods", true);
    categories.add(c1);
    Category c2 = new Category(2, "Clothes", true);
    categories.add(c2);
    Category c3 = new Category(3, "Entertainment", false);
    categories.add(c3);
    Category c4 = new Category(4, "House", true);
    categories.add(c4);
    Category c5 = new Category(5, "Transport", true);
    categories.add(c5);
    Category c6 = new Category(6, "Fuel", true);
    categories.add(c6);
    Category c7 = new Category(7, "Hobby", false);
    categories.add(c7);
    Category c8 = new Category(7, "Vacations", false);
    categories.add(c8);
    Category c9 = new Category(7, "Medicine", false);
    categories.add(c9);
  return categories;
  }
}
