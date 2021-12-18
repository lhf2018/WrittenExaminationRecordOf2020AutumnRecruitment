package beike;

import java.util.Scanner;

public class tMain4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int[] num=new int[T];
        for(int i=0;i<T;i++){
            num[i]=in.nextInt();
        }
        for(int i=0;i<num.length;i++){
        }
    }

    private static long helper(int[] num, int start, int end) {
        long res=0;
        for(int i=start;i<=end;i++){
            res|=num[i];
        }
        return res;
    }
}
