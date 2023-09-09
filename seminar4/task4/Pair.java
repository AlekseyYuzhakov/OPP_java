package seminar4.task4;

public class Pair<T, U> {
  private T first;
  private U second;

  public Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public U getSecond() {
    return second;
  }

  public static void main(String[] args) {
    Pair<Integer, String> pair1 = new Pair<Integer, String>(42, "Привет"); // Использование шаблона аргументов
    Pair<Double, Boolean> pair2 = new Pair<Double, Boolean>(3.14, true); // Использование шаблона аргументов

    Pair<Integer, String> pair3 = new Pair<Integer, String>(100, "Мир"); // Использование шаблона аргументов

    Pair pair4 = new Pair(42, "Hello"); // Без явного указания типов (предупреждение о неявном использовании)
    // Компилятор предупреждает о неявном использовании raw-типов
    // (непараметризованных) и рекомендует использовать параметризованные типы.

    System.out.println(pair1.toString() + pair2.toString() + pair3.toString() + pair4.toString());
  }
}
