import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    System.out.println("Введите число:");

    Scanner kbListener = new Scanner(System.in);

    if (kbListener.hasNextInt()) {
      int number1 = kbListener.nextInt();
      System.out.println("Спасибо, это число");
    }
    else{
      System.out.println("Что за дич тут ввели?");
    }
  }
}
