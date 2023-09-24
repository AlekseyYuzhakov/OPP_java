package homeWork7;

public class ComplexNumber {
  /**
   * @param truePart Реальная часть комлпексного числа
   */
  private double truePart;

  /**
   * @param imageneryPart Мнимая часть комплексного числа
   */
  private double imageneryPart;

  /**
   * @param truePartРеальная часть комлпексного числа
   * @param imageneryPart    Мнимая часть комплексного числа
   */
  public ComplexNumber(double truePart, double imageneryPart) {
    this.truePart = truePart;
    this.imageneryPart = imageneryPart;
  }

  /**
   * @return Возвращает значение рельной части комлпексного числа
   */
  public double getTruePart() {
    return truePart;
  }

  /**
   * Устанавливает значение рельной части для текущего
   * комплексного числа
   * 
   * @param truePart реальная часть комплексного числа
   */
  public void setTruePart(double truePart) {
    this.truePart = truePart;
  }

  /**
   * @return Возвращает значение мнимой части комлпексного числа
   */
  public double getImageneryPart() {
    return imageneryPart;
  }

  /**
   * Устанавливает значение мнимой части для текущего
   * комплексного числа
   * 
   * @param imageneryPart мнимая часть комплексного числа
   */
  public void setImageneryPart(double imageneryPart) {
    this.imageneryPart = imageneryPart;
  }

  @Override
  public String toString() {
    return " [" + truePart + " " + " " + imageneryPart + "i]";
  }

}
