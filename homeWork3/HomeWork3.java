package HomeWork3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HomeWork3 {
  public static void main(String[] args) {
    ArrayList<Cat> petslist = new ArrayList<Cat>();
    AgeGenerator PetAGen = (x) -> 4 - x;
    AgeGenerator OnwAGen = (x) -> (x + 1) * (x + 2) + 5;
    for (int index = 0; index < 3; index++) {
      Cat tempCat = new Cat("Pet " + Integer.toString(index + 1), PetAGen.getAge(index));
      Owner tempOwner = new Owner("Owner " + Integer.toString(index + 10), OnwAGen.getAge(index));
      tempCat.setOwner(tempOwner);
      petslist.add(tempCat);
      tempOwner.greet();
      tempCat.greet();
    }
    Comparator<Cat> AgeComparator = Comparator.comparingInt(Cat -> Cat.age);
    Comparator<Cat> NameComporator = Comparator.comparing(Cat -> Cat.name);
    System.out.println("Sorted by Age");
    Collections.sort(petslist, AgeComparator);
    for (Cat Pet : petslist) {
      Pet.greet();
    }
    System.out.println("Sorted by name");
    Collections.sort(petslist, NameComporator);
    for (Cat Pet : petslist) {
      Pet.greet();
    }
  }
}
