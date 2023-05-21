import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner myObj = new Scanner(System.in);  
      double a,b,c;
      a  = myObj.nextInt();
      b  = myObj.nextInt();
      c = a / b;

      System.out.println(c);
    }
}