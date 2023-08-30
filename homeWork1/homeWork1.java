package homeWork1;

import homeWork1.task1.Owner;
import homeWork1.task2.Rectangle;
import homeWork1.task1.Cat;

public class homeWork1 {
  public static void main(String[] args) {
    System.out.println("Task 1 ");
    System.out.println("--------------");
    Owner dude = new Owner();
    dude.setName("Mike");
    dude.greet();
    Cat paw = new Cat("", 0);
    paw.setName("Fluf");
    paw.setAge(10);
    paw.setOwner(dude);
    paw.greet();
    System.out.println();
    System.out.println("--------------");
    System.out.println("Task 2 ");
    System.out.println("--------------");
    Rectangle rec = new Rectangle();
    rec.setHeight(2);
    rec.setWidth(5);
    System.out.printf("Площадь прямоугольника со сторонами %d и %d равна %d \n", rec.getHeight(), rec.getWidth(),
        rec.calculateArea());
    System.out.printf("Периметр прямоугольника со сторонами %d и %d равен %d \n", rec.getHeight(), rec.getWidth(),
        rec.calculatePerimeter());
    System.out.println("--------------");

  }
}
