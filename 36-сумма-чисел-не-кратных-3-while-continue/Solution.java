/*
Сумма чисел, не кратных 3
*/

public class Solution {
  public static void main(String[] args) {
//напишите тут ваш код
    int count = 0;
    int summ = 0;

    while (count < 100) {
      count++;
      if ((count % 3) == 0) continue;
      summ = summ + count;
    }

    System.out.println(summ);
  }
}
