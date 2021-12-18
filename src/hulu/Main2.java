package hulu;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[][] nums=new int[n][k];
        for(int i=0;i<n;i++){
            for(int j=0;j<k;j++){
                nums[i][j]=in.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int min=Integer.MAX_VALUE;
                for(int h=0;h<k;h++){
                    min=Math.min(min,Math.max(nums[i][h],nums[j][h]));
                }
                max=Math.max(max,min);
            }
        }
        System.out.println(max);
    }
}
