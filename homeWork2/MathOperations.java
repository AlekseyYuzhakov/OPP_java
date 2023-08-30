package homeWork2;

// Обьявлен базовый интерфейс MathOperations
public interface MathOperations {
  // дифолтная функция сложения
  default int add(int a, int b) {
    return a + b;
  }

  // дифолтная функция вычитания
  default int subtract(int a, int b) {
    return a - b;
  }

  // дифолтная функция умножения
  default int multiplication(int a, int b) {
    return a * b;
  }

  // дифолтная функция деления
  default double division(int a, int b) {
    return a / b;
  }

}
