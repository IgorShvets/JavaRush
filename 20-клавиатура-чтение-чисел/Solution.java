import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner kbListener = new Scanner(System.in);

    int number1 = kbListener.nextInt();
    int number2 = kbListener.nextInt();
    int number3 = kbListener.nextInt();

    int sr_areph = (number1 + number2 + number3) / 3;

    System.out.println(sr_areph);
  }
}
