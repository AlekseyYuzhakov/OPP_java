package homeWork4.task3;

public class GetMax<T> implements Comparable<T> {
  private T o;

  // Как то очень сложно. 1.5 часа и гугл не смогли мне помочь в этом вопросе((

  @Override
  public int compareTo(T o) {
    int result = this.o.compareTo(o);
    return 0;
  }

  @Override
  public int icompareTo(GetMax<T> o1) {
    return this.o.compareTo(o1);
  }

  public static void main(String[] args) {

  }

}

// Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает
// два параметра типа T и возвращает максимальное значение из них.
// В этом примере мы объявляем обобщенную функцию getMax, которая принимает два
// параметра типа T, ограниченных интерфейсом Comparable. Мы используем метод
// compareTo для сравнения значений и возвращаем максимальное значение из двух.
// В методе main мы вызываем getMax с разными типами данных: целое число
// (Integer), число с плавающей запятой (Double) и строку (String). В результате
// мы получаем максимальные значения из каждой пары и выводим их на консоль.
// Обобщения позволяют нам писать универсальный код, который может работать с
// разными типами данных, сохраняя при этом безопасность типов.