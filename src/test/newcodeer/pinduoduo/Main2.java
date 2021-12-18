package test.newcodeer.pinduoduo;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for(int i=0;i<T;i++){
            int temp=in.nextInt();
            int min=getMin(temp);
            System.out.println(min+" "+(temp-getMin(temp-1)));
        }
    }

    private static int getMin(int temp) {
        if(temp%4==1||temp%4==2){
            return 1;
        }else {
            return 0;
        }
    }
}
