package seminar2.Example4;

// Интерфейс для математических операций
interface MathOperations {
  int add(int a, int b);

  default int subtract(int a, int b) {
    return a - b;
  }
}