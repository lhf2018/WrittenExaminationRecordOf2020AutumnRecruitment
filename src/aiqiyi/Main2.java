package aiqiyi;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] chs =in.next().toCharArray();
        int[][] dp=new int[chs.length*2][chs.length*2];
        int x=chs.length;
        int y=chs.length;
        dp[x][y]=1;
        for(char c:chs){
            if(c=='N'){
                y++;

            }else if(c=='S'){
                y--;
            }else if(c=='W'){
                x--;
            }else {
                x++;
            }
            if(dp[x][y]==1){
                System.out.println("True");
                return;
            }else{
                dp[x][y]=1;
            }
        }
        System.out.println("False");
    }
}
