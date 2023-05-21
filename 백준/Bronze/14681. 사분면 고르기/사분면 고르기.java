import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int x = myObj.nextInt();
    int y = myObj.nextInt();
    int R=0;
    if(x > 0){
        if(y > 0){R=1;}
        if(y < 0){R=4;}
    }else{
        if(y > 0){R=2;}
        if(y < 0){R=3;}
    }
    System.out.println(R);
    }
}
