import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {

    Scanner kbListener = new Scanner(System.in);

    int myAge = kbListener.nextInt();

    if (myAge < 20 || myAge > 60) System.out.println("можно не работать");
  }
}