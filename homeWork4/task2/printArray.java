package homeWork4.task2;

//Обьявлен класс
public class printArray<T> {
  // Метод для печати массивов
  public void print(T[] array) {
    for (T itemT : array) {
      System.out.printf(ANSI_GREEN + "[" + itemT + "]" + ANSI_RESET);
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // Созданы массивы двух типов данных
    Integer[] iArray = new Integer[] { 7, 5, 4, 8, 2 };
    String[] sArray = new String[] { "Summer", "Winter", "Spring", "Autumn" };
    // Созданы экземпляры класса для вывода на печать массивов
    printArray<Integer> iPrintArray = new printArray<Integer>();
    printArray<String> sPrintArray = new printArray<String>();
    // Вызов функции печати массивов
    iPrintArray.print(iArray);
    sPrintArray.print(sArray);

  }

  // Не судите строго, это просто для теста цветной печати))
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";

}

// Задача 2 : Напишите обобщенный метод printArray, который принимает массив
// любого типа и выводит его элементы на консоль.
// В этом примере мы объявляем обобщенный метод printArray, который принимает
// массив типа T. Затем мы используем цикл for-each, чтобы пройти по всем
// элементам массива и вывести их на консоль.
// В методе main мы создаем массивы типов Integer и String и вызываем printArray
// для каждого из них. В результате мы получаем вывод на консоль элементов
// каждого массива.
// Таким образом, обобщенные методы позволяют нам создавать код, который может
// работать с разными типами данных, обеспечивая повторное использование и
// гибкость.
// Полезные материалы
