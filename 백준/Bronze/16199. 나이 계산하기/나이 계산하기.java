import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
    Scanner myObj = new Scanner(System.in); 
    
    int BY = myObj.nextInt();
    int BM = myObj.nextInt();
    int BD = myObj.nextInt();
    int SY = myObj.nextInt();
    int SM = myObj.nextInt();
    int SD = myObj.nextInt();
    int D, D1, A=1;
    
    D = SY - BY;
    if(BM > SM){
        D1 = D < 1 ? 0 : D-1;
        A = D1;
    }
    if(BM == SM){
        if(BD > SD){
            D1 = D < 1 ? 0 : D-1;
            A = D1;
        }else if(BD <= SD){
            A = D;
    }}
    if(BM < SM){
        A = D;
    }
    System.out.println(A);
    A = D + 1;
    System.out.println(A);
    System.out.println(D);
    }
}