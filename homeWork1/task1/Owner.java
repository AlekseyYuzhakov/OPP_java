package homeWork1.task1;

//Обьявлен класс Owner
public class Owner {
  private String name;

  // Геттер для класса Owner
  public String getName() {
    return name;
  }

  // Сеттер для класса Owner
  public void setName(String name) {
    this.name = name;
  }

  // Функция приветствия
  public void greet() {
    System.out.println("Привет меня зовут " + name);
  }

}
