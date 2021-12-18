package beike;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
            int N=in.nextInt();
            int M=in.nextInt();
            if(N==1){
                System.out.println(helper(M));
                return;
            }
            if(M==1){
                System.out.println(helper(N));
                return;
            }
            System.out.println(Math.min(helper(N),helper(M)));
        }
    }
    public static int helper(int n){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return i;
            }
        }
        return n;
    }
}
