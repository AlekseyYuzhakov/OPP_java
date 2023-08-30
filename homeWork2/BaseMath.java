package homeWork2;

//Обьявлен клас BaseMath, реализующий интерфейс MathOperations, и константы
class BaseMath implements MathOperations, Constants {
  // Внутреняя переменая для обращения через класс.
  private int a;

  // Гетер для а
  public int getA() {
    return a;
  }

  // Сеттер для а
  public void setA(int a) {
    System.out.println("а = " + a);
    this.a = a;
  }

  // Внутреняя переменая для обращения через класс.
  private int b;

  // Геттер для b
  public int getB() {
    return b;
  }

  // Сеттер для b
  public void setB(int b) {
    System.out.println("b = " + b);
    this.b = b;
  }

  // Функция класса для поиска площади круга, с применением константы и внутренней
  // функции класса Pow
  public double circleArea(int a) {
    return PI * Pow(a, 2);
  }

  // Функция класса для поиска длинны окружности круга, с применением константы
  public double circlePirimetr(int a) {
    return PI * a * 2;
  }

  // Функция для возведения числа a в тепень b
  public int Pow(int a, int b) {
    int sum = 0;
    for (int index = 1; index < b; index++) {
      sum += a * a;
    }
    return sum;
  }

  // Перегрузка функции деления a на b с проверкой на 0
  @Override
  public double division(int a, int b) {
    if (b != 0) {
      return (double) a / (double) b;
    } else {
      System.out.println("Числитель не должен равнятся 0");
      return 0;
    }
  }

}
