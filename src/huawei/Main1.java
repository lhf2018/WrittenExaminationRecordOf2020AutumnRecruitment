package huawei;

import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //第一部分
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        int[] nums=new int[m*n];
        int index=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                nums[index++]=in.nextInt();
            }
        }
        Arrays.sort(nums);
        index=0;
        int[][] res=new int[m][n];
        int l=0;
        int r=n-1;
        int u=0;
        int d=m-1;
        //第二部分
        while (l<=r&&u<=d){
            for(int i=l;i<=r;i++){
                res[u][i]=nums[index++];
            }
            u++;
            for(int i=u;i<=d;i++){
                res[i][r]=nums[index++];
            }
            r--;
            for(int i=r;i>=l&&u<=d;i--){
                res[d][i]=nums[index++];
            }
            d--;
            for(int i=d;i>=u&&l<=r;i--){
                res[i][l]=nums[index++];
            }
            l++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j]);
                if(j!=res[0].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
