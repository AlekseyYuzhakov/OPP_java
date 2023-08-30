package homeWork1.task2;

// Обьявлен класс Rectangle
public class Rectangle {
  private Integer width;
  private Integer height;

  // Базовый конструктор для класса Rectangle
  public Rectangle(Integer width, Integer height) {
    this.width = width;
    this.height = height;
  }

  // Конструктор для класса Rectangle одинаковые стороны
  public Rectangle(Integer equal) {
    this.height = equal;
    this.width = equal;
  }

  // Пустой конструктор для класса Rectangle
  public Rectangle() {
    this.height = 1;
    this.width = 1;
  }
  // Геттер для width

  public Integer getWidth() {
    return width;
  }
  // Сеттер для width

  public void setWidth(Integer width) {
    System.out.println("Ширина = " + width);
    this.width = width;
  }
  // Геттер для height

  public Integer getHeight() {
    return height;
  }
  // Сеттер для height

  public void setHeight(Integer height) {
    System.out.println("Высота = " + height);
    this.height = height;
  }
  // Функция для поиска площади

  public Integer calculateArea() {
    return height * width;
  }

  // Функция для поиска периметра
  public Integer calculatePerimeter() {
    return (2 * (height + width));
  }
}
