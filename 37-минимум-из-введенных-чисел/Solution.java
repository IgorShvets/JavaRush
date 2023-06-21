import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner kbListener = new Scanner(System.in);
    int min = Integer.MAX_VALUE;

    while (kbListener.hasNextInt()) {
      int current = kbListener.nextInt();

      if (min > current) min = current;
    }

    System.out.println(min);
  }
}