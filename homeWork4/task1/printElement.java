package homeWork4.task1;

//Обявлен класс 
class printElement<T> {
  // Предмет неизвестного типа
  private T item;

  // Конструктор
  public printElement(T o) {
    item = o;
  }

  // Геттер для получения предмета
  public T getItem() {
    return item;
  }

  // Сеттер для получения предмета
  public void setItem(T item) {
    this.item = item;
  }

  public static void main(String[] args) {
    //Созданы экземпляры класса printElement
    printElement<Integer> printInt = new printElement<Integer>(34);
    printElement<String> printStr = new printElement<String>("Привет");
    printElement<Double> printDbl = new printElement<Double>(3.14);
    printElement<Boolean> printBool = new printElement<Boolean>(true);
    
    //Выведены на печать значения и Классы этих значений
    System.out.println(printInt.getItem() + " <" + printInt.getItem().getClass().getName() + ">");
    System.out.println(printStr.getItem() + " <" + printStr.getItem().getClass().getName() + ">");
    System.out.println(printDbl.getItem() + " <" + printDbl.getItem().getClass().getName() + ">");
    System.out.println(printBool.getItem() + " <" + printBool.getItem().getClass().getName() + ">");

  }
}

// Задача 1 : Напишите обобщенный метод printElement, который принимает один
// параметр типа T и выводит его на консоль.
// В этом примере мы объявляем обобщенный метод printElement, который принимает
// один параметр типа T. Мы просто выводим этот элемент на консоль с помощью
// метода System.out.println().
// В методе main мы вызываем printElement с различными типами данных: целое
// число (Integer), строку (String) и число с плавающей запятой (Double).
// Компилятор автоматически выводит тип параметра T на основе переданных
// аргументов.
// Таким образом, обобщенные методы позволяют нам писать код, который может
// работать с различными типами данных, обеспечивая простоту и гибкость
// использования.
