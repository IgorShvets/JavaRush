import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    String cold = "на улице холодно";
    String warm = "на улице тепло";

    Scanner kbListener = new Scanner(System.in);
    
    int tStreet = kbListener.nextInt();

    if (tStreet >= 0) {
      System.out.println(warm);
    }
    else{
      System.out.println(cold);
    }
  }
}
