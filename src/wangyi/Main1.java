package wangyi;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int res=0;
        int len=in.nextInt();
        for(int i=0;i<len;i++){
            long temp=in.nextLong();
            if(temp>1){
                res+=(temp/2);
            }

        }
        System.out.println(res);
    }
}
