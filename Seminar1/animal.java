package seminar1;

// Базовый класс
class Animal {
  String name;
  int age;
  Boolean state;

  // Конструктор класса Animal
  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  // public Animal(String name) {
  // this.name = name;
  // }

  // public Animal() {
  // }

  // Метод для издания звука
  public void makeSound() {
    System.out.println("The animal makes a sound.");
  }
  
  @Override
  public String toString() {
    String info = "";
    info = name.toString() + " " + Integer.toString(age);
    return info;
  }

  // Метод для вывода информации о животном
  public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("State: " + state);
  }
}
