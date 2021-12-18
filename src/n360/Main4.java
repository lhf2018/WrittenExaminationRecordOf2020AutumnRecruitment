package n360;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        List<Integer> nums=new ArrayList<>();
        for(int i=0;i<N;i++){
            nums.add(i+1);
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<M;i++){
            int temp=in.nextInt();
            if(stack.isEmpty()){
                stack.push(temp);
                continue;
            }
            if(temp==1){
                if(stack.peek()!=2){
                    stack.push(stack.pop()+2);
                }else {
                    stack.push(1);
                }
            }else {
                if(stack.peek()!=2){
                    stack.push(2);
                }else {
                    stack.pop();
                }
            }
        }
        int[] arr=new int[stack.size()];
        for(int i=arr.length-1;i>=0;i--){
            arr[i]=stack.pop();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                for(int j=0;j<N;j+=2){
                    int ss=nums.get(j);
                    nums.set(j,nums.get(j+1));
                    nums.set(j+1,ss);
                }
            }else {
                int len=(arr[i]+1)/2;
                for(int j=0;j<len;j++){
                    int ss=nums.get(0);
                    nums.remove(0);
                    nums.add(ss);
                }
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
