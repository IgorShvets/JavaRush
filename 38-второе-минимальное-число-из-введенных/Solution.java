import java.util.Scanner;

/*
Второе минимальное число из введенных
*/

public class Solution {
  public static void main(String[] args) {
    //напишите тут ваш код
    String strArray = "";
    int secondMin = Integer.MAX_VALUE;
    int firstMin = Integer.MAX_VALUE;
    int ostatok = 0;
    int minOstatok = Integer.MAX_VALUE;
    Scanner kbListener = new Scanner(System.in);

    while(kbListener.hasNextInt()) {
      int current = kbListener.nextInt();

      strArray += String.valueOf(current) + ":";
      if (current < firstMin) firstMin = current;
    }

    Scanner scannerArray = new Scanner(strArray);
    scannerArray.useDelimiter(":");

    while(scannerArray.hasNext()){
      int current = scannerArray.nextInt();

      ostatok = firstMin - current;
      if(minOstatok > Math.abs(ostatok) && Math.abs(ostatok) != 0) {
        secondMin = current;
        minOstatok = Math.abs(ostatok);
      }
    }

    System.out.println(secondMin);

  }
}