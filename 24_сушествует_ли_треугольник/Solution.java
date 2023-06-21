import java.util.Scanner; 

public class Solution {
  private static final String TRIANGLE_EXISTS = "треугольник существует";
  private static final String TRIANGLE_NOT_EXISTS = "треугольник не сущесвует";

  public static void main(String[] args) {

    Scanner kbListener = new Scanner(System.in);

    int side1 = kbListener.nextInt();
    int side2 = kbListener.nextInt();
    int side3 = kbListener.nextInt();

    boolean check1 = false;
    boolean check2 = false;
    boolean check3 = false;

    check1 = (side1 + side2) > side3;
    check2 = (side2 + side3) > side1;
    check3 = (side3 + side1) > side2;

    if (check1 && check2 && check3){
      System.out.println(TRIANGLE_EXISTS);
    }
    else{
      System.out.println(TRIANGLE_NOT_EXISTS);
    }
  }
}
