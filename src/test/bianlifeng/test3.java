package test.bianlifeng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String input=in.next();
        String[] strs=input.split(",");
        int[] times=new int[strs.length];
        int[] array=new int[strs.length];
        for(int i=0;i<strs.length;i++){
            times[i]=Integer.parseInt(strs[i]);
            array[i]=(i%2==0?times[i]-30:times[i]+30);
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<times.length;i++){
            if(i==0||i==times.length-1){
                list.add(array[i]);
                continue;
            }
            if(i%2==1&&i<array.length-1){
                if(array[i]+60<array[i+1]){
                    list.add(array[i]);
                }
            }else if(i%2==0&&i<array.length-1){
                if(array[i-1]+60<array[i]){
                    list.add(array[i]);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
            if(i!=list.size()-1){
                System.out.print(",");
            }
        }
    }
}
