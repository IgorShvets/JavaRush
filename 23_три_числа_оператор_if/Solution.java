import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner kbListener = new Scanner(System.in);

    int number1 = kbListener.nextInt();
    int number2 = kbListener.nextInt();
    int number3 = kbListener.nextInt();

    boolean num1 = false;
    boolean num2 = false;
    boolean num3 = false;

    if (number1 == number2) {
      num1 = true;
      num2 = true;
    }
    if (number1 == number3) {
      num1 = true;
      num3 = true;
    }
    if (number3 == number2) {
      num3 = true;
      num2 = true;
    }

    String result = "";

    if (num1) result = result + number1 + " ";
    if (num2) result = result + number2 + " ";
    if (num3) result = result + number3 + " ";

    System.out.println(result);
  }
}
