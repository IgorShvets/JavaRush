import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    String text = " любит меня.";

    Scanner kbListener = new Scanner(System.in);

    String name = kbListener.nextLine();

    int iteration = 0;

    while (iteration < 10) {
      System.out.println(name + text);
      iteration++;
    }
  }
}
