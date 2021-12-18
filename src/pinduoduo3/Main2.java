package pinduoduo3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    private static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        int row=in.nextInt();
        int col=in.nextInt();
        char[][] arrs=new char[row][col];
        for(int i=0;i<row;i++){
            arrs[i]=in.next().toCharArray();
        }
        for(int i=0;i<arrs.length;i++){
            for(int j=0;j<arrs[0].length;j++){
                if(arrs[i][j]=='X'){
                    int res=helper(arrs,i,j,new boolean[row][col],0);
                    if(res<min){
                        min=res;
                        list.clear();
                        list.add(i);
                        list.add(j);
                    }else if(res==min){
                        list.add(i);
                        list.add(j);
                    }
                }
            }

        }
        if(min==Integer.MAX_VALUE){
            System.out.println(0);
            return;
        }
        System.out.println(min);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(" ");
            }
        }
    }

    private static int helper(char[][] arrs,int row,int col,boolean[][] used,int count) {
        if(row<0||row>=arrs.length||col<0||col>=arrs[0].length||used[row][col]||arrs[row][col]=='1'||count>min){
            return Integer.MAX_VALUE;
        }
        if(arrs[row][col]=='T'){
            return count;
        }
        used[row][col]=true;
        int num1=helper(arrs,row-1,col,used,count+1);
        int num2=helper(arrs,row+1,col,used,count+1);
        int num3=helper(arrs,row,col-1,used,count+1);
        int num4=helper(arrs,row,col+1,used,count+1);
        used[row][col]=false;
        return Math.min(Math.min(num1,num2),Math.min(num3,num4));
    }
}
