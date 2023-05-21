import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    long A = myObj.nextInt(); 
    long B = myObj.nextInt(); 
    long P = myObj.nextInt(); 
    if(B >= P){
        System.out.println("-1");
    }else if(B < P){
        System.out.println(A / (P-B) + 1);
    }
    }
}