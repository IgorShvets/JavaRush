import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner kbListener = new Scanner(System.in);

    double number1;
    double number2;

    number1 = kbListener.nextDouble();
    number2 = kbListener.nextDouble();

    double result = Math.abs(number1 - number2);

    if (result < 0.000001) {
      System.out.println("числа равны");
    }
    else {
      System.out.println("числа не равны");
    }
  }
}
