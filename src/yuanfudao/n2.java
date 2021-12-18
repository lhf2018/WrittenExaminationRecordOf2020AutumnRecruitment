package yuanfudao;

import java.util.*;

class Node{
    int source;
    int value;
    public Node(int source,int value){
        this.source=source;
        this.value=value;
    }
}
public class n2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        PriorityQueue<Node> queue=new PriorityQueue<Node>(new Comparator<Node>() {
            @Override
            public int compare(Node o1, Node o2) {
                if(o1.source==o2.source){
                    return o2.value-o1.value;
                }else {
                    return o1.source-o2.source;
                }
            }
        });
        for(int i=0;i<num;i++){
            int value=in.nextInt();
            int source=in.nextInt();
            queue.offer(new Node(source,value));
        }
        List<Integer> list=new LinkedList<>();
        while (!queue.isEmpty()){
            list.add(queue.poll().value);
        }
        long max=0;
        long temp=0;
        for(int i=0;i<list.size();i++){
            temp+=list.get(i);
            max=Math.max(temp,max);
            if(temp<0){
                temp=0;
            }
        }
        System.out.println((max%1000000003));
    }
}
