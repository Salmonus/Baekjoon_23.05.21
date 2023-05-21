import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int h = myObj.nextInt();
    int m = myObj.nextInt();
    int s = myObj.nextInt();
    int R = myObj.nextInt();
    
    h += m / 3600; m += R/60; s += R % 60;
    m += s / 60;
    h += m / 60;
    m = m % 60;
    h = h % 24;
    s = s % 60;
    System.out.println(h + " " + m + " " +  s);
    }
}