import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count_u = 1, count_d = 1;
        
        for(int i=1; i<10000; i++){
            if(i%2 == 0){
                for(int x=i-1; x>0; x--){
                    if(count_u==N) System.out.print(x + "/");
                    count_u++;
                }
                for(int y=1; y<i; y++){
                    if(count_d==N) System.out.print(y);
                    count_d++;
                }
            } else {
                for(int m=1; m<i; m++){
                    if(count_u==N) System.out.print(m + "/");
                    count_u++;
                }
                for(int n=i-1; n>0; n--){
                    if(count_d==N) System.out.print(n);
                    count_d++;
                }
            }
        }
    }
}
