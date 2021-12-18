package hulu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<nums.length;i++){
            nums[i]=in.nextInt();
        }
        int[] dp=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<n+1;i++){
            for(int j=1;j<i+1;j++){
                dp[i]+=dp[j-1]*dp[i-j];
            }
        }
        System.out.println(dp[n]);
    }
}
