import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner myObj = new Scanner(System.in);  
      long a,b,c,d;
      a  = myObj.nextLong();
      b  = myObj.nextLong();
      c  = myObj.nextLong();
      d = a * b - c;
      if(d < 0){d = 0;}
      System.out.println(d);
    }
}