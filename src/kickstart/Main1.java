package kickstart;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        for (int i=1;i<=T;i++){
            int len=in.nextInt();
            int[] arr=new int[len];
            for(int j=0;j<len;j++){
                arr[j]=in.nextInt();
            }
            int res=helper(arr);
            System.out.println("case #"+i+": "+res);
        }
    }

    private static int helper(int[] arr) {
        if(arr.length<=2){
            return arr.length;
        }
        int max=2;
        int count=2;
        int cha=arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]==cha){
                count++;
            }else {
                count=2;
                cha=arr[i]-arr[i-1];
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
