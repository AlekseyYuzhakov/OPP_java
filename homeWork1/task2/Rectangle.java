package homeWork1.task2;

public class Rectangle {
  private Integer width;
  private Integer height;

  public Rectangle(Integer width, Integer height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(Integer equal) {
    this.height = equal;
    this.width = equal;
  }

  public Rectangle() {
    this.height = 1;
    this.width = 1;
  }

  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    System.out.println("Ширина = " + width);
    this.width = width;
  }

  public Integer getHeight() {
    return height;
  }

  public void setHeight(Integer height) {
    System.out.println("Высота = " + height);
    this.height = height;
  }

  public Integer calculateArea() {
    return height * width;
  }

  public Integer calculatePerimeter() {
    return (2 * (height + width));
  }
}
