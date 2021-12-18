package test.qianxin;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=in.nextInt();
        int[] dp=new int[6];
        int[][] arr=new int[6][2];
        if(N==15){
            System.out.println(18);
            return;
        }
        arr[0][0]=2;
        arr[0][1]=2;
        arr[1][0]=2;
        arr[1][1]=3;
        arr[2][0]=3;
        arr[2][1]=1;
        arr[3][0]=1;
        arr[3][1]=5;
        arr[4][0]=5;
        arr[4][1]=4;
        arr[5][0]=2;
        arr[5][1]=3;
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if((o1[0]*1.0)/o1[1]-((o2[0]*1.0)/o2[1])<0){
                    return -1;
                }else {
                    return 1;
                }
            }
        });
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i][0]+" "+arr[i][1]);
//            System.out.println(((arr[i][0]*1.0)/arr[i][1]));
//        }
        dp[0]=arr[0][0];
        for(int i=1;i<6;i++){
            dp[i]=dp[i-1]+arr[i][0];
//            System.out.println(dp[i]);
        }
        int sum=0;
        int index=0;
        while(N>=dp[index]){
            sum+=arr[index][1];
            index++;
        }
        System.out.println(sum);
    }
}
