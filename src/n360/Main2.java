package n360;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        int[] nums=new int[N];
        for(int i=0;i<N;i++){
            nums[i]=i+1;
        }
        for(int i=0;i<M;i++){
            int temp=in.nextInt();
            if(temp==1){
                int ss=nums[0];
                for(int j=1;j<N;j++){
                    nums[j-1]=nums[j];
                }
                nums[nums.length-1]=ss;
            }else {
                for(int j=0;j<N;j+=2){
                    int ss=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=ss;
                }
            }

        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if(i!=nums.length-1){
                System.out.print(" ");
            }
        }
    }
}
