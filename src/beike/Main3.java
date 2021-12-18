package beike;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        int[] num=new int[T];
        for(int i=0;i<T;i++){
            num[i]=in.nextInt();
        }
        long max=Long.MIN_VALUE;
        int index=-1;
        for(int i=num.length-1;i>=0;i--){
            long res=helper(num,i,num.length-1);
            if(res>max){
                max=res;
                index=i;
            }
        }
        int len=-1;
        for(int i=index;i<num.length;i++){
            long res=helper(num,index,i);
            if(res==max){
                len=i-index+1;
                break;
            }
        }
        System.out.println(len);
    }

    private static long helper(int[] num, int start, int end) {
        long res=0;
        for(int i=start;i<=end;i++){
            res|=num[i];
        }
        return res;
    }
}
