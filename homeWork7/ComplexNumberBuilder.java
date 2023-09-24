package homeWork7;

import java.util.Locale;
import java.util.Random;

// Класс билдер для комплексных чисел, для реализации патерная builder
public class ComplexNumberBuilder {
  /**
   * @param truePart Реальная часть комлпексного числа
   */
  private double truePart;

  /**
   * @param imageneryPart Мнимая часть комплексного числа
   */
  private double imageneryPart;

  /**
   * Установливает рельную часть для будущего комплексного числа
   * 
   * @param truePart рельная часть для будущего комплексного числа
   * @return //
   */
  public ComplexNumberBuilder setTruePart(double truePart) {
    this.truePart = truePart;
    return this;
  }

  /**
   * Установливает мнимую часть для будущего комплексного числа
   * 
   * @param imageneryPart мнимая часть для будущего комплексного числа
   * @return //
   */
  public ComplexNumberBuilder setImageneryPart(double imageneryPart) {
    this.imageneryPart = imageneryPart;
    return this;
  }

  /**
   * Функция для создания комплексного числа
   * 
   * @return Возвращает комплексное число
   */
  public ComplexNumber build() {
    return new ComplexNumber(truePart, imageneryPart);
  }

  /**
   * Генерирует комлпексно число со случайной реальной и мнимой частью
   */
  public ComplexNumber buildRandom() {
    double d = new Random().nextInt();
    this.truePart = Double.parseDouble(truncateUptoTwoDecimal(d));
    d = new Random().nextInt();
    this.imageneryPart = Double.parseDouble(truncateUptoTwoDecimal(d));
    return new ComplexNumber(truePart, imageneryPart);
  }

  /**
   * @param doubleValue число
   * @return строковое представление числа doubleValue, сократив количество знаков
   *         после . до двух.
   */
  public static String truncateUptoTwoDecimal(double doubleValue) {
    String value = String.valueOf(doubleValue);
    if (value != null) {
      String result = value;
      int decimalIndex = result.indexOf(".");
      if (decimalIndex != -1) {
        String decimalString = result.substring(decimalIndex + 1);
        if (decimalString.length() > 2) {
          result = value.substring(0, decimalIndex + 3);
        } else if (decimalString.length() == 1) {
          result = String.format(Locale.ENGLISH, "%.2f",
              Double.parseDouble(value));
        }
      }
      return result;
    }
    return null;
  }
}
