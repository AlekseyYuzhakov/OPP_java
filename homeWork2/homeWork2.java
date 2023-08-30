package homeWork2;

public class homeWork2 {
  public static void main(String[] args) {
    BaseMath math = new BaseMath();
    int a = 5;
    System.out.println("a = " + a);
    int b = 2;
    System.out.println("b = " + b);
    System.out.printf("Сумма %d и %d = %d\n", a, b, math.add(a, b));
    System.out.printf("Разница между %d и %d = %d\n", a, b, math.subtract(a, b));
    System.out.printf("Умножение %d на %d = %d\n", a, b, math.multiplication(a, b));
    System.out.printf("Деление %d на %d = %s\n", a, b, math.division(a, b));
    System.out.printf("%d в степени %d = %d\n", a, b, math.Pow(a, b));
    System.out.printf("Площадь круга с раиусом %d = %.3f\n", a, math.circleArea(a));
    System.out.printf("Длинна окружности круга с раиусом %d = %.3f\n", a, math.circlePirimetr(a));
    math.setA(7);
    math.setB(10);
    System.out.printf("Сумма %d и %d = %d\n", math.getA(), math.getB(), math.add(math.getA(), math.getB()));
    System.out.printf("Разница между %d и %d = %d\n", math.getA(), math.getB(), math.subtract(math.getA(), math.getB()));
    b = 0;
    System.out.printf("Деление %d на %d = %s\n", a, b, math.division(a, b));

  }
}
