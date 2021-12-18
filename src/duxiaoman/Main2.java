package duxiaoman;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0){
            int row=in.nextInt();
            int col=in.nextInt();
            char[][] arr=new char[row][col];
            int index_row=0;
            int index_col=0;
            for(int i=0;i<row;i++){
                arr[i]=in.next().toCharArray();
            }
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]=='@'){
                        index_row=i;
                        index_col=j;
                    }
                }
            }
            boolean[][] dp=new boolean[row][col];
            int res=helper(dp, arr, index_row, index_col);
            System.out.println(res==Integer.MAX_VALUE?-1:res);
        }
    }

    private static int helper(boolean[][] dp, char[][] arr, int index_row, int index_col) {
        if(index_row<0||index_row>=arr.length){
            return 0;
        }
        if(index_col<0||index_col>=arr[0].length){
            return 0;
        }
        if(dp[index_row][index_col]||arr[index_row][index_col]=='#'){
            return Integer.MAX_VALUE;
        }
        dp[index_row][index_col]=true;
        int l1=helper(dp,arr,index_row-1,index_col);
        int l2=helper(dp,arr,index_row,index_col-1);
        int l3=helper(dp,arr,index_row+1,index_col);
        int l4=helper(dp,arr,index_row,index_col+1);
        dp[index_row][index_col]=false;
        if(arr[index_row][index_col]=='*'){
            return 1+Math.min(Math.min(l1,l2),Math.min(l3,l4));
        }else{
            return Math.min(Math.min(l1,l2),Math.min(l3,l4));
        }
    }
}
