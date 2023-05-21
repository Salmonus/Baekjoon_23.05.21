import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      String[] a = s.next().split("/");
      int K = Integer.parseInt(a[0]);
      int D = Integer.parseInt(a[1]);
      int A = Integer.parseInt(a[2]);

    if(K + A < D || D == 0){
        System.out.println("hasu");}
    else{
        System.out.println("gosu");}
    }
}