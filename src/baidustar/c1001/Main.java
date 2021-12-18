package baidustar.c1001;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        for(int i=0;i<len;i++){
            int num=in.nextInt();
            double max=Integer.MIN_VALUE;
            for(int j=0;j<num;j++){
                int a=in.nextInt();
                double b=in.nextDouble();
                double f1 = new BigDecimal((1.0-b)/(a+1.0-b)).setScale(5, BigDecimal.ROUND_HALF_UP).doubleValue();
                max=Math.max(max,f1);
            }
            System.out.println(max);
        }
    }

}
