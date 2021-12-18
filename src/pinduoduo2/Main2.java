package pinduoduo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int[][] arr=new int[N][M];
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                arr[i][j]=in.nextInt();
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    list.add(helper(arr,i,j));
                }
            }
        }

    }

    private static Integer helper(int[][] arr, int row, int col) {
        if(arr[row][col]==0)return 0;
        arr[row][col]=0;
        int res=1;
        if(row>0){
            res+=helper(arr,row-1,col);
        }
        if(row<arr.length-1){
            res+=helper(arr,row+1,col);
        }
        if(col>0){
            res+=helper(arr,row,col-1);
        }
        if(col<arr.length-1){
            res+=helper(arr,row,col+1);
        }
        return res;
    }
}
