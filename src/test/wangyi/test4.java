package test.wangyi;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[][] array=new int[n][m];
        int[][] res=new int[n][m];
        for(int i=0;i<n;i++){
            String str=in.next();
            for(int j=0;j<str.length();j++){
                array[i][j]=str.charAt(j)-'0';
            }
        }
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(array[i][j]==0){
                    res[i][j]=0;
                }else {
                    boolean[][] fff=new boolean[n][m];
                    res[i][j]=helper(array,i,j,fff);
                }
                System.out.print(res[i][j]);
                if(j!=array[0].length-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    private static int helper(int[][] array, int i, int j,boolean[][] fff) {
        if(i<0||i>=array.length||j<0||j>=array[0].length){
            return Integer.MAX_VALUE;
        }
        if(array[i][j]==0){
            return 0;
        }
        int a=0,b=0,c=0,d=0;
        if(!fff[i][j]){
            a=helper(array,i-1,j,fff);
            b=helper(array,i+1,j,fff);
            c=helper(array,i,j-1,fff);
            d=helper(array,i,j+1,fff);
            fff[i][j]=true;
        }
        return Math.min(Math.min(a,b),Math.min(c,d))+1;
    }
}
