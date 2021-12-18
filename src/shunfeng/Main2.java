package shunfeng;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=in.nextInt();
            arr[i][1]=in.nextInt();
            arr[i][2]=in.nextInt();
        }
        long[] dp=new long[1000000];
        Arrays.sort(arr, (o1, o2) -> {
            if(o1[1]!=o2[1]){
                return o1[1]-o2[1];
            }else {
                return o1[0]-o2[0];
            }
        });
        for(int i=0;i<dp.length;i++){
            long max=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j][1]<i){
                    max=Math.max(dp[arr[j][0]]+arr[j][2],max);
                }
            }
            dp[i]=max;
        }
        System.out.println(dp[dp.length-1]);
    }
}
