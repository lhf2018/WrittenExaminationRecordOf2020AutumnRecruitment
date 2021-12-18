package test.t360;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int n1=n;
        int m=in.nextInt();
        int len=m/3;
        double total=0;
        double temp=1.0;
        double temp2=1.0;
        for(int i=0;i<=len;i++){
            total+=((n*1.0/(n+m))*temp);
//            System.out.println("total  "+total);
            for(int j=0;j<3;j++){
                temp*=((m*1.0)/(m+n));
                m--;
//                System.out.println("m "+m);
            }
            if(n1>1){
                temp*=2;
            }
            n1--;
//            System.out.println(temp);
        }
        System.out.printf("%.4f",total);
    }
}
