package shopee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class n2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while (in.hasNext()){
            list.add(in.nextInt());
        }
        int[] arr=new int[list.size()+1];
        for(int i=0;i<list.size();i++){
            arr[i+1]=list.get(i);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            //左节点
            if(i*2<arr.length&&i*4>=arr.length){
                res.add(arr[i*2]);
            }
            //右节点
            if(i*2+1<arr.length&&(i*2+1)*2>=arr.length){
                res.add(arr[i*2+1]);
            }
        }
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
            if(i!=res.size()-1){
                System.out.print(" ");
            }
        }
    }
}
