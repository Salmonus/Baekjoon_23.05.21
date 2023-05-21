import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int N = s.nextInt();
      int M = s.nextInt();
      
    if(M <= 2){
        System.out.println("NEWBIE!");
    }else if(2 < M && M <= N){
        System.out.println("OLDBIE!");
    }else{
        System.out.println("TLE!");
    }
    }
}