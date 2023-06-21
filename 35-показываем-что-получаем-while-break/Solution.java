import java.util.Scanner;

/* 
Показываем, что получаем
*/

public class Solution {
  public static void main(String[] args) {
      //напишите тут ваш код
    Scanner kbListener = new Scanner(System.in);
    String text = "";

    while (true) {
      text = kbListener.nextLine();
      if (text.equals("enough")) break;
      System.out.println(text);
    }
  }
}
