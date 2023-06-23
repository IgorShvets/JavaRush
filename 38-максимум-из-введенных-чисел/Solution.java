import java.util.Scanner;

/*
Максимум из введенных чисел
*/

public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    Scanner kbListener = new Scanner(System.in);
    int max = Integer.MIN_VALUE;

    while (kbListener.hasNextInt()){
      int current = kbListener.nextInt();

      if ((current % 2) == 0 && max < current) max = current;
    }
    System.out.println(max);
  }
}