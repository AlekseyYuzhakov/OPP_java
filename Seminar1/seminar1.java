package Seminar1;

public class seminar1 {
  public static void main(String[] args) {
    Animal lion = new Animal("Simba", 12);
    lion.makeSound();
    System.out.printf("Name = %s, age = %d \n", lion.name, lion.age);
    lion.displayInfo();
    System.out.println(lion.toString());
    Animal dog = new Animal("Flafy", 0);
    dog.displayInfo();
    dog.age = 11;
    dog.state = true;
    dog.displayInfo();
    Mammal cat = new Mammal("SnowWite", 5, "Red");
    cat.state = true;
    cat.displayInfo();
    cat.makeSound();
    Bird someBird = new Bird("Woody", 3, true);
    someBird.state = false;
    someBird.displayInfo();
    someBird.makeSound();
    

  }
}
