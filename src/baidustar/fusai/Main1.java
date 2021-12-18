package baidustar.fusai;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
            double m=in.nextInt()*1.0;//bob
            double p=in.nextInt()*1.0/100;//alice
            double q=in.nextInt()*1.0/100;//bob
            double increase=0;
            double decrease=0;
            increase=m*p;
            decrease=(m-1)*q;
            if((int)(increase-decrease)-(increase-decrease)==0){
                System.out.println((int)(increase-decrease));
            }else {
                long temp= (int) ((increase-decrease)*100);
                long n100=100;
                for(long j=Math.min(temp, n100);j>=1;j--){
                    if(temp%j==0&&n100%i==0){
                        temp/=j;
                        n100/=j;
                    }
                }
                System.out.println((temp+998244353)/n100);
            }
        }
    }
}
