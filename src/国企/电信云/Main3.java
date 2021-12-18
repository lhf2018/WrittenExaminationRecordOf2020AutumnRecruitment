package 国企.电信云;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        String[] arr=line.split(",");
        int[] nums=new int[arr.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=Integer.parseInt(arr[i]);
        }
        int first=0;
        int second=nums[0];
        int temp;
        for(int i=1;i<nums.length;i++){
            temp=Math.max(first,second);
            second=first+nums[i];
            first=temp;
        }
        System.out.println(Math.max(first,second));
    }
}
