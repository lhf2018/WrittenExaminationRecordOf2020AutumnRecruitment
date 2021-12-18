package test.baidu;

import java.util.*;

public class test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        PriorityQueue<Long> queue=new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if(o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        PriorityQueue<Long> queue1=new PriorityQueue<>(new Comparator<Long>() {
            @Override
            public int compare(Long o1, Long o2) {
                if(o1>o2){
                    return -1;
                }else if(o1<o2){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        for(int i=0;i<n;i++){
            queue.offer(in.nextLong());
        }
        int count=0;
        while((queue.size()>0&&queue.peek()>=n)||(queue1.size()>0&&queue1.peek()>=n)){
            count++;

            if(queue.size()>0){
                queue1.offer(queue.poll()-n);
                for(int i=0;i<n-1;i++){
                    queue1.offer(queue.poll()+1);
                }
            }else {
                queue.offer(queue1.poll()-n);
                for(int i=0;i<n-1;i++){
                    queue.offer(queue1.poll()+1);
                }
            }
        }
        System.out.println(count);
    }
}
