import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int S = myObj.nextInt();
    int K = myObj.nextInt();
    int H = myObj.nextInt();
    String R = "Hello";
    if(S + K + H >= 100){
        R = ("OK");
    }else{
        if(S < K && S < H){R = ("Soongsil");}
        if(K < S && K < H){R = ("Korea");}
        if(H < S && H < K){R = ("Hanyang");}
    }
    System.out.println(R);
    }
}