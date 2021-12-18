package test.bytedance;

import java.util.Scanner;

public class Main2 {
    private static int res=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int D=in.nextInt();
        int[] nums=new int[N];
        for(int i=0;i<N;i++){
            nums[i]=in.nextInt();
        }
        helper(nums,0,3,D,0);
        System.out.println(res);
    }
    public static void helper(int[] nums,int index,int n,int D,int small){
        if(index==nums.length){
            if(n==0){
                res++;
            }
            return;
        }
        if(n==0){
            res++;
            return;
        }

        for(int i=index;i<nums.length;i++){
            if(n==3){
                small=nums[i];
            }
            if(nums[i]-small<=D){
                helper(nums,i+1,n-1,D,small);
            }
        }

    }
}
