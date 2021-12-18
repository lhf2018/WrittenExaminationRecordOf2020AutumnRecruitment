package zhongxing;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] arr=new int[m][n+1];
        for(int i=0;i<m;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
                sum+=arr[i][j];
            }
            arr[i][n]=sum;
        }
        double[] nums=new double[m];
        for(int i=0;i<m;i++){
            nums[i]=arr[i][n]*1.0/m;
        }
        int count=0;
        OUTER:
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[j][i]>nums[j]){
                    continue OUTER;
                }
            }
            count++;
        }
        System.out.println(n-count);
    }
}
