package test.bianlifeng;

import java.util.PriorityQueue;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        PriorityQueue<Long> m2=new PriorityQueue<>();
        PriorityQueue<Long> m1=new PriorityQueue<>();
        long sum=0;
        while (in.hasNext()){
            long temp=in.nextLong();
            if(temp%3==1){
                m1.offer(temp);
            }else if(temp%3==2){
                m2.offer(temp);
            }
            sum+=temp;
        }
        if(sum%3==1){
            long sum1=0;
            if(m1.size()>=1){
                sum1+=m1.poll();
            }
            long sum2=0;
            if(m2.size()>=2){
                sum2+=m2.poll();
                sum2+=m2.poll();
            }
            sum-=Math.min(sum1,sum2);
        }else if(sum%3==2){
            long sum1=0;
            if(m1.size()>=2){
                sum1+=m1.poll();
                sum1+=m1.poll();
            }
            long sum2=0;
            if(m2.size()>=1){
                sum2+=m2.poll();
            }
            sum-=Math.min(sum1,sum2);
        }
        System.out.println((sum/3));

    }
}
