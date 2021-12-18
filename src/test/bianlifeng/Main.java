package test.bianlifeng;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PriorityQueue<Integer> m2=new PriorityQueue<>();
        PriorityQueue<Integer> m1=new PriorityQueue<>();
        int sum=0;
        while (in.hasNext()){
            int temp=in.nextInt();
            if(temp%3==1){
                m1.offer(temp);
            }else if(temp%3==2){
                m2.offer(temp);
            }
            sum+=temp;
        }
        if(sum%3==1){
            int sum1=0;
            if(m1.size()>=1){
                sum1+=m1.poll();
            }
            int sum2=0;
            if(m2.size()>=2){
                sum2+=m2.poll();
                sum2+=m2.poll();
            }
            sum-=Math.min(sum1,sum2);
        }else if(sum%3==2){
            int sum1=0;
            if(m1.size()>=2){
                sum1+=m1.poll();
                sum1+=m1.poll();
            }
            int sum2=0;
            if(m2.size()>=1){
                sum2+=m2.poll();
            }
            sum-=Math.min(sum1,sum2);
        }
        System.out.println((sum/3));

    }
}
