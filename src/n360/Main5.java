package n360;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int a=1;
        int b=2;
        int flag=1;
        for(int i=0;i<M;i++){
            int temp=in.nextInt();
            if(temp==1){
                if(flag==0) {
                    a+=2;
                }else {
                    b+=2;
                }
            }
            flag=(flag==0)?1:0;
        }
        for(int i=1;i<=N;i++){
            if(((i+flag+1)&1)==1){
                a=(a%N!=0)?a%N:N;
                System.out.print(a);
                a+=2;
            }else {
                b=(b%N!=0)?b%N:N;
                System.out.print(b);
                b+=2;
            }
            if(i!=N){
                System.out.print(" ");
            }
        }
    }
}
