package Seminar1;

// Подкласс, наследующий от Animal
class Bird extends Animal {
  boolean canFly;

  // Конструктор класса Bird
  public Bird(String name, int age, boolean canFly) {
    super(name, age); // Вызов конструктора базового класса
    this.canFly = canFly;
  }

  // Переопределение метода makeSound()
  @Override
  public void makeSound() {
    if (state != true) {
      System.out.println("Dead bird can't make sounds ))");
    } else {
      System.out.println("The bird makes a chirping sound.");
    }

  }

  // Метод для вывода информации о птице, включая наследованные свойства
  @Override
  public void displayInfo() {
    super.displayInfo(); // Вызов метода базового класса
    if (state != true) {
      System.out.println("Dead bird can't fly ))");
    } else {
      System.out.println("Can fly: " + canFly);
    }

  }
}