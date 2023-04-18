package classes;

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

//  Category c1 = new Category()

}
