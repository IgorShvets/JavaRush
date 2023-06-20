import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    String militaryCommissar = ", явитесь в военкомат";

    Scanner kbListener = new Scanner(System.in);

    String mName = kbListener.nextLine();
    int mAge = kbListener.nextInt();

    if (mAge >= 18 && mAge <= 28) {
      System.out.println(mName + militaryCommissar);
    }
  }
}
