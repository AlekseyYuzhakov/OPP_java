package HomeWork3;

//Обьявлен класс Cat
public class Cat extends Owner {
  public String name;
  public Integer age;
  private Owner owner;

  // Конструктор для класса
  public Cat(String name, Integer age) {
    super(name, age);
    this.name = name;
    this.age = age;
  }

  // Геттер для name
  public String getName() {
    return name;
  }

  // Сеттер для name
  public void setName(String name) {
    this.name = name;
  }

  // Геттер для age
  public Integer getAge() {
    return age;
  }

  // Сеттер для age
  public void setAge(Integer age) {
    this.age = age;
  }

  // Геттер для Owner
  public Owner getOwner() {
    return owner;
  }

  // Сеттер для Owner
  public void setOwner(Owner owner) {
    this.owner = owner;
  }

  @Override
  public void greet() {
    System.out.printf("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.\n", name, age, owner.getName());
    
  }

}
