import java.util.Scanner;

public class Solution {
  public static String secret = "AmIGo";

  public static void main(String[] args) {
    
    Scanner kbListener = new Scanner(System.in);

    String str1 = kbListener.nextLine();

    if (str1.equalsIgnoreCase(secret))
      System.out.println("доступ разрешен");
    else
      System.out.println("доступ запрещен");
  }
}
