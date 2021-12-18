package pinduoduo2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int[] arr=new int[M];
        for(int j=0;j<M;j++){
            arr[j]=in.nextInt();
        }
        int res=0;
        Set<Integer> set=new HashSet<>();
        for(int j=0;j<arr.length;j++){
//            int index=1;
//            while (arr[j]*index<=N){
//                set.add(arr[j]*index);
//                index++;
//            }
            res+=N/arr[j];
        }
        System.out.println(res);
    }
}
