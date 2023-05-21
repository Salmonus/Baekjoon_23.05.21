import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int on, off, one, two, three, four;
        on = sc.nextInt(); off = sc.nextInt();
        one = -1 * on + off;
        on = sc.nextInt(); off = sc.nextInt();
        two = one + -1 * on + off;
        on = sc.nextInt(); off = sc.nextInt();
        three = two + -1 * on + off;
        on = sc.nextInt(); off = sc.nextInt();
        four = three + -1 * on + off;
        
        if(one > two && one >  three && one > four){
            System.out.printf("%d", one);
        }else if(two > one && two >  three && two > four){
            System.out.printf("%d", two);
        }else if(three > two && three >  one && three > four){
            System.out.printf("%d", three);
        }else if(four > two && four >  three && four > one){
            System.out.printf("%d", four);
        }
        
        }
    }