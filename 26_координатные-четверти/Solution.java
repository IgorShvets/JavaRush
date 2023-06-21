import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner kbListener = new Scanner(System.in);

    int numX = kbListener.nextInt();
    int numY = kbListener.nextInt();

    int whereIt = 0;

    if (numX > 0 && numY > 0) whereIt = 1;
    if (numX < 0 && numY > 0) whereIt = 2;
    if (numX < 0 && numY < 0) whereIt = 3;
    if (numX > 0 && numY < 0) whereIt = 4;

    System.out.println(whereIt);
  }
}
