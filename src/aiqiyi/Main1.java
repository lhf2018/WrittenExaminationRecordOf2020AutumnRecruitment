package aiqiyi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int res=0;
        for(int i=5;n/i>0;i*=5){
            res+=n/i;
        }
        System.out.println(res);
    }
}
