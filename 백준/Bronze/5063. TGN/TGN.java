import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r,e,c;
        for(int i=0; i < n; i++){
        r = sc.nextInt(); e = sc.nextInt(); c = sc.nextInt();
        if(e - (r + c) > 0){
            System.out.printf("advertise\n");
            
        }
        else if(e - (r + c) < 0){
            System.out.printf("do not advertise\n");
            
        }
        else if(e - (r + c) == 0){
            System.out.printf("does not matter\n");
            
        }
        }
    }
}