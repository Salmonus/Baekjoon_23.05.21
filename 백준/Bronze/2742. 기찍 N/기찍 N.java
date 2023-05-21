import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder output = new StringBuilder();
        for (int i = N ; i > 0; i--){
            output.append(i).append("\n");
        }
        
        System.out.print(output);
    }
}