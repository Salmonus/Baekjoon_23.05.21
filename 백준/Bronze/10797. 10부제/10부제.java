import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    int A = myObj.nextInt(), c=-1, n=0; 
    for(int i=0; i < 5; i++){
        c = myObj.nextInt();
        n = c == A ? n += 1 : n;
    }
    System.out.println(n);
    }
}