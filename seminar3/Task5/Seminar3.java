package seminar3.Task5;

import java.util.function.Predicate;

public class Seminar3 {
  public static void main(String[] args) {
    Predicate<Integer> isPositive = number -> number > 0;
    boolean result = isPositive.test(5);
    System.out.println("Is 5 positive ? " + result);

    result = isPositive.test(-3);
    System.out.println("Is -3 positive ? " + result);
  }
}
