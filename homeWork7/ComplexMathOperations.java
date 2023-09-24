package homeWork7;

public interface ComplexMathOperations {

  /**
   * Функция возвращает сумму двух комплексных чисел
   * 
   * @param num1 Первое комплексное число
   * @param num2 Второе комплексное число
   * @return Новое комплексное число.
   */
  public ComplexNumber add(ComplexNumber num1, ComplexNumber num2);

  /**
   * Функция возвращает разность двух комплексных чисел
   * 
   * @param num1 Первое комплексное число
   * @param num2 Второе комплексное число
   * @return Новое комплексное число.
   */
  public ComplexNumber subtraction(ComplexNumber num1, ComplexNumber num2);

  /**
   * Функция возвращает умножение двух комплексных чисел
   * 
   * @param num1 Первое комплексное число
   * @param num2 Второе комплексное число
   * @return Новое комплексное число.
   */
  public ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2);

  /**
   * Функция возвращает деление двух комплексных чисел
   * 
   * @param num1 Первое комплексное число
   * @param num2 Второе комплексное число
   * @return Новое комплексное число.
   */
  public ComplexNumber divide(ComplexNumber num1, ComplexNumber num2);

}
