package test.wangyi;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        long[] array=new long[len];
        boolean flag=true;
        for(int i=0;i<len;i++){
            array[i]=in.nextInt();
        }
        flag= array[array.length - 1] - array[0] > 0;
        for(int i=1;i<array.length;i++){
            if(array[i]-array[i-1]==0||array[i]-array[i-1]>0!=flag){
                System.out.println(-1);
                return;
            }
        }
        long res=array[1]-array[0];
        for(int i=1;i<len-1;i++){
            res=gcd(res,array[i+1]-array[i]);
        }
        System.out.println(res);
    }
    public static long gcd(long a,long b){
        return b==0?a:gcd(b,a%b);
    }
}
