package seminar3.Task3;

public class Seminar3 {
  public static void main(String[] args) {
    MyParamValue myParamValue = (val) -> {
      for (int i = 0; i < val; i++) {
        System.out.println(i+val);
      }
      return val+val;
    };
    int num = myParamValue.GetValue(7);
    System.out.println(myParamValue.GetValue(10));
    System.out.println(num);
  }
}
