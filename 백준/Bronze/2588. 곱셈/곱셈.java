import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      int a,b,c,d,e,f;
      Scanner sc = new Scanner(System.in);
      a = sc.nextInt();
      b = sc.nextInt();
      c = a * (b % 10);
      d = a * (((b % 100) - (b % 10))/10);
      e = a * ((b - (b % 100))/100);
      f = c + d*10 + e*100;
      System.out.println(c);
      System.out.println(d);
      System.out.println(e);
      System.out.println(f);
    }
}