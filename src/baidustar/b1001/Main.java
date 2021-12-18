package baidustar.b1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        for(int i=0;i<len;i++){
            int n=in.nextInt();
            int m=in.nextInt();
            int p=in.nextInt();
            int res=helper(n,m,p);
            System.out.println(res);
        }
    }

    private static int helper(int n, int m, int p) {
        int res=0;
        while(n>=m){
            res++;
            n=n-m+(int)(m*(100-p)/100.0);
        }
        return res;
    }
}
