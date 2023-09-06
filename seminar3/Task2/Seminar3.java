package seminar3.Task2;

public class Seminar3 {
  public static void main(String[] args) {
    MyParamValue myParamValue = (n) -> 1.0 / n;
    System.out.println(myParamValue.GetValue(2));

    double a = 3;
    double b = 5;
    double c = 3;

    MyDoubleParamValue myDoubleParamValue = (x, y, z) -> 2 * x + y - z;
    System.out.println("Значение myDoubleParamValue = " + myDoubleParamValue.GetValue(5, 7, 14.25));
    MyDoubleParamValue myDoubleParamValue2 = (v1, v2, v3) -> 17 - a * b + c;
    System.out.println("Значение myDoubleParamValue2 = " + myDoubleParamValue2.GetValue(a, b, c));
    
  }
}
