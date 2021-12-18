package zhongxing;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        while (T-->0){
            int n=in.nextInt();
            int[] nums=new int[n];
            for(int i=0;i<nums.length;i++){
                nums[i]=in.nextInt();
            }
            int len=helper(nums);
            int len1=helper1(nums);
            System.out.println(Math.min(len,len1));
        }
    }

    private static int helper1(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int[] h=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[i]<nums[j]){
                    max=Math.max(h[j],max);
                }
            }
            h[i]=max+1;
        }
        int max=0;
        for(int i=0;i<h.length;i++){
            if(h[i]>max){
                max=h[i];
            }
        }
        return nums.length-max;
    }

    private static int helper(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int[] h=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int max=0;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    max=Math.max(h[j],max);
                }
            }
            h[i]=max+1;
        }
        int max=0;
        for(int i=0;i<h.length;i++){
            if(h[i]>max){
                max=h[i];
            }
        }
        return nums.length-max;
    }
}
