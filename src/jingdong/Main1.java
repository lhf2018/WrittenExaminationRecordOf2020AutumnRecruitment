package jingdong;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        double res=0;
        while (n>0){
            res+=(1.0/(5*(2*n-1))-1.0/(5*2*n));
            n--;
        }
        System.out.println(String.format("%.4f",res));
    }
}
