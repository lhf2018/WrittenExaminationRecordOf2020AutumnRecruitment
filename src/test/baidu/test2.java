package test.baidu;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        long[] arr=new long[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextLong();
        }

        long max=Long.MIN_VALUE;
        int count=0;
        while(max>=n||max==Long.MIN_VALUE){
//            if(count>10){
//                break;
//            }
            count++;
            int index=-1;
            max=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(arr[i]>max){
                    max=arr[i];
                    index=i;
                }
            }
            max=Long.MIN_VALUE;
            for(int i=0;i<n;i++){
                if(index==i){
                    arr[i]=arr[i]-n;
                }else{
                    arr[i]=arr[i]+1;
                }
                max=Math.max(max,arr[i]);
            }
//            for(int i=0;i<n;i++){
//                System.out.println("arr"+i+": "+arr[i]);
//            }
//            System.out.println("max "+max);
        }
        System.out.println(count);
    }
}
