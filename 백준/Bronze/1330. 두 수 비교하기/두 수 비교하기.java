import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner myObj = new Scanner(System.in);  
      long a,b,c;
      a  = myObj.nextLong();
      b  = myObj.nextLong();
      c = a - b;
      if(c > 0){
          System.out.println(">");
      }else if(c < 0){
          System.out.println("<");
      }else{
          System.out.println("==");
      }
    }
}