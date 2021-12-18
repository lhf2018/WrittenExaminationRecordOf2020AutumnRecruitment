package wangyi;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int T=in.nextInt();
        OUTER:
        for(int i=0;i<T;i++){
            int len=in.nextInt();
            int[] nums=new int[len];
            int total=0;
            for(int j=0;j<len;j++){
                nums[j]=in.nextInt();
                total+=nums[j];
            }
            Arrays.sort(nums);
            int index=-1;
            int temp=0;
            for(int j=0;j<nums.length;j++){
                temp+=nums[j];
                if(temp==(total/2)){
                    System.out.println(0);
                    continue;
                }
            }
            int tt=total;
            for(int j=0;j<nums.length;j++){
                tt-=nums[j];
                if(tt%2==1){
                    continue;
                }
                int start=0;
                for(int k=j+1;k<nums.length;k++){
                    start+=nums[k];
                    if(start==tt/2){
                        System.out.println(total-tt);
                        continue OUTER;
                    }
                }
            }
            System.out.println(index);
        }
    }
}
