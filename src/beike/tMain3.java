package beike;

import java.util.Scanner;

public class tMain3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int[] num=new int[T];
        for(int i=0;i<T;i++){
            num[i]=in.nextInt();
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            max=Math.max(max,num[i]);
        }
        if(helper(max)){
            System.out.println(1);
        }else {
            System.out.println(2);
        }
    }
    public static boolean helper(int n){
        String v=Integer.toBinaryString(n);
        if(v.contains("0")){
            return false;
        }else {
            return true;
        }
    }
}
