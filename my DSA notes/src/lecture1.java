import java.util.Scanner;

public class lecture1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int j= sc.nextInt();
        while(j-->0){
            int n= sc.nextInt();
            int p=  sc.nextInt();
            if(n>=p) System.out.println(n);
            else System.out.println(p);
        }

    }
}
