package test.newcodeer.pinduoduo;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
            int temp=in.nextInt();
            System.out.println(helper(temp));
        }
    }

    private static int helper(int n) {
        if(n<=2)return n;
        return 1+helper(n/2);
    }
}
