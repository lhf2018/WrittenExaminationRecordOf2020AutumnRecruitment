package test.bianlifeng;

import java.util.*;

public class test2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        str=str.replaceAll("\\[","");
        str=str.replaceAll("\\]","");
        String[] str_arr=str.split(",");
        int[][] array=new int[str_arr.length][2];
        for(int i=0;i<array.length;i++){
            array[i/2][i%2]=Integer.parseInt(str_arr[i]);
        }
        int res=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(array[0][0],0);
        for(int i=1;i<array.length;i++){
            if(map.containsKey(array[i][1])){
                res=i-map.get(array[i][1])+1;
                break;
            }
            map.put(array[i][0],i);
        }
        System.out.println(res);
    }
}
