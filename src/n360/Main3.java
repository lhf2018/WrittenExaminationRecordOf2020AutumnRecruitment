package n360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        List<Integer> nums=new ArrayList<>();
        boolean flag=true;
        for(int i=0;i<N;i++){
            nums.add(i+1);
        }
        int count=0;
        for(int i=0;i<M;i++){
            int temp=in.nextInt();
            if(temp==1){
                if(flag&&(count%2==1)){
                    for(int j=0;j<N;j+=2){
                        int ss=nums.get(j);
                        nums.set(j,nums.get(j+1));
                        nums.set(j+1,ss);
                    }
                }
                int ss=nums.get(0);
                nums.remove(0);
                nums.add(ss);
                flag=false;
                count=0;
            }else {
                if(count==0||flag){
                    count++;
                }
                flag=true;
            }
        }
        if(flag&&count%2==1){
            for(int j=0;j<N;j+=2){
                int ss=nums.get(j);
                nums.set(j,nums.get(j+1));
                nums.set(j+1,ss);
            }
        }
        for(int i=0;i<nums.size();i++){
            System.out.print(nums.get(i));
            if(i!=nums.size()-1){
                System.out.print(" ");
            }
        }
    }
}
