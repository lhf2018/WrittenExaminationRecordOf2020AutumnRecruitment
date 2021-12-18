package meituan;

import java.util.Scanner;

public class Main5 {
    private static int res=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] nums=new int[m];
        helper(nums,0,1,n);
        System.out.println(res%998244353);
    }
    public static void helper(int[] nums,int index,int pre,int n){
        if(n<pre*2){
            res++;
            return;
        }
        if(index==nums.length){
            res++;
            return;
        }
        for(int i=pre;i<=n;i++){
            if(i%pre==0){
                nums[index]=i;
                helper(nums,index+1,i,n);
            }
        }
    }
}
