
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    Scanner kbListener = new Scanner(System.in);
    
    String data = "0";
    int summ = 0;

    while (!data.equals("ENTER")){
      summ = summ + Integer.parseInt(data);
      data = kbListener.nextLine();
    }

    System.out.println(summ);

  }
}
