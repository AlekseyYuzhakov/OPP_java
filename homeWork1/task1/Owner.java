package homeWork1.task1;

public class Owner {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void greet() {
    System.out.println("Привет меня зовут " + name);
  }

}
