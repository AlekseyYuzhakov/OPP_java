package HomeWork3;

//Обьявлен класс Owner
public class Owner {
  private String name;
  private Integer age;

  public Owner(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  // Геттер для класса Owne
  public Integer getAge() {
    return age;
  }

  // Сеттер для класса Owner
  public void setAge(Integer age) {
    this.age = age;
  }

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
    System.out.printf("Привет меня зовут %s, мне %d лет \n", name, age);
  }

}
