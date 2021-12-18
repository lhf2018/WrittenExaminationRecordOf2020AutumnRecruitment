package test.qianxin;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str=in.next();
        String[] strings= str.split(",");
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<strings.length;i++){
            queue.offer(Integer.parseInt(strings[i]));
        }
        int res=0;
        boolean flag=false;
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<4;j++){
                sum+=queue.poll();
            }
            if(i==0){
                res+=sum;
            }else{
                if(res!=sum){
                    System.out.println("no");
                    flag=true;
                }
            }
        }
        if(!flag){

            System.out.println("yes");
        }
    }
}
