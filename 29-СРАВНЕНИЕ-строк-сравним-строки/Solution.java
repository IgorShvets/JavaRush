import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    
    Scanner kbListener = new Scanner(System.in);

    String str1 = kbListener.nextLine();
    String str2 = kbListener.nextLine();

    if (str1.equals(str2)){
      System.out.println("строки одинаковые");
    }
    else {
      System.out.println("строки разные");
    }
  }
}
