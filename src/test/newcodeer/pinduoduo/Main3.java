package test.newcodeer.pinduoduo;

import java.math.BigInteger;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        BigInteger[][] dp = new BigInteger[50][50];
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        long K = sc.nextLong();
        for(int i=0;i<=N;i++){
            dp[i][0] = new BigInteger(Integer.toString(i));
        }
        for(int i=0;i<=M;i++){
            dp[0][i] = new BigInteger(Integer.toString(i));
        }
        for(int i=1;i<=N;i++){
            for(int j=1;j<=M;j++){
                //dp[i][j] = 1+dp[i-1][j] + 1+ dp[i][j-1];
                dp[i][j] = dp[i-1][j].add(dp[i][j-1]).add(new BigInteger("2"));
            }
        }
        StringBuilder sb = new StringBuilder();
        int n = N, m = M;
        long k = K;
        while(k>0){
            if(n>0 && m>0){
                if(dp[n-1][m].compareTo(new BigInteger(Long.toString(k-1)))>=0){//k<=dp[n-1][m]+1
                    k--;
                    sb.append('a');
                    n--;
                }else{ //k>dp[n-1][m]+1
                    k -= dp[n-1][m].longValue()+2;
                    sb.append('b');
                    m--;
                }
            }else if(n>0 && m==0){
                k--;
                sb.append('a');
                n--;
            }else if(n==0 && m>0){
                k--;
                sb.append('b');
                m--;
            }else{
                k=0;
            }
        }
        System.out.println(sb.toString());
    }
}
