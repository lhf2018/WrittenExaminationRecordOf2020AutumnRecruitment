package meituan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=len;i++){
            if(helper(i)){
                list.add(i);
            }
        }
        System.out.println(list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i)+" "+list.get(i)*4);
        }
    }

    private static boolean helper(int i) {
        StringBuilder sb=new StringBuilder();
        sb.append(i*4);
        String temp=sb.reverse().toString();
        int index=0;
        for(int j=0;j<temp.length();j++){
            if(temp.charAt(j)=='0'){
                index++;
            }else {
                break;
            }
        }
        return String.valueOf(i).equals(temp.substring(index));
    }
}
