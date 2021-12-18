package pinduoduo2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int[][] arr=new int[N][2];
        for(int i=0;i<N;i++){
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
        }
        int[][] dp=new int[N+1][M+1];
        for(int i=1;i<N+1;i++){
            for(int j=1;j<M+1;j++){
                if(arr[i-1][0]>j){
                    dp[i][j]=dp[i-1][j];
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-arr[i][0]]+arr[i][1]);
                }
            }
        }
        System.out.println(dp[N][M]);
    }
}
