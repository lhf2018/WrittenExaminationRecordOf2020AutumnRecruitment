package yuanfudao;

import java.util.Scanner;

public class n1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a=new int[10000000];
        int len=in.nextInt();
        int max=0;
        for(int i=0;i<len;i++){
            int start=in.nextInt();
            int end=in.nextInt();
            max=Math.max(max,end);
            for(int j=start;j<end;j++){
                a[j]++;
            }
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<=max;i++){
            res=Math.max(res,a[i]);
        }
        System.out.println(res);
    }
}
