import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int H = myObj.nextInt();
    int M = myObj.nextInt();
    int C = myObj.nextInt();
    int h, m;
    if(M + C >= 60){
        h= H + (M + C)/60;
        h= h >= 24 ? h-24: h;
        m= (M + C - 60) % 60;
        System.out.println(h + " " + m);
        
    }else{System.out.println(H + " " +  (M + C));}
    
    }
}