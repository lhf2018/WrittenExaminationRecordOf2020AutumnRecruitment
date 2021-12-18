package kedaxunfei;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n5=in.nextInt();
        int n10=in.nextInt();
        int n50=in.nextInt();
        int n100=in.nextInt();
        int res=0;
        int target=in.nextInt();
        while (target!=0){
            if(target>=100&&n100>0){
                target-=100;
                res++;
                n100--;
            }else if(target>=50&&n50>0){
                target-=50;
                res++;
                n50--;
            }else if(target>=10&&n10>0){
                target-=10;
                res++;
                n10--;
            }else if(target>=5&&n5>0){
                target-=5;
                res++;
                n5--;
            }else if(target>=1&&n1>0){
                target-=1;
                res++;
                n1--;
            }else{
                System.out.println(-1);
                return;
            }
        }
        System.out.println(res);
    }
}
