package classes;

public class Users {

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

  public Users() {
  }
}
