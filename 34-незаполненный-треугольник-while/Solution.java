/* 
Незаполненный прямоугольник
*/

public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    int rows = 0;

    while (rows < 10) {
      int stolb = 0;

      while (stolb < 20) {
        if (stolb == 0 || stolb == 19 || rows == 0 || rows == 9)
          System.out.printf("Б");
        else
          System.out.printf(" ");
        stolb++;
      }

      System.out.println();
      rows++;
    }
  }
}
