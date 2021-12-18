package test.baidu;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long max=Long.MIN_VALUE;
//        boolean[][] arr=new boolean[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
//                if(!arr[j][i]){
                    long temp=temp1(i,j);
                    max=Math.max(max,temp2(i,j,temp)-temp);
//                }
//                arr[i][j]=true;
            }
        }
        System.out.println(max);
    }
    private static long temp1(long a,long b){
        return b==0?a:temp1(b,a%b);
    }
    private static long temp2(long a,long b,long num){
        return a*b/num;
    }
}
