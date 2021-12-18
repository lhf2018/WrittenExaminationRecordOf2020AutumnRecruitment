package jingdong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main2 {
    private static Set<String> set=new HashSet<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int start=in.nextInt();
        int end=in.nextInt();
        int res=0;
        for(int i=2;i<=1000000;i++){
            if(helper1(i)){
                set.add(String.valueOf(i));
            }
        }
        for(int i=start;i<=end;i++){
            if(helper(i)){
                System.out.println("ssss :  "+i);
                res++;
            }
        }
        System.out.println(res);
    }
    //判断回文素数
    private static boolean helper(int num) {
        if(num<10&&core(String.valueOf(num))){
            return true;
        }
        String temp=String.valueOf(num);
        for(int i=0;i<temp.length();i++){
            String str=temp.substring(0,i)+temp.substring(i+1);
            if(str.length()==0)continue;
            int tempn=Integer.parseInt(str);
            String ss=String.valueOf(tempn);
            if(core(ss)){
                return true;
            }
        }
        return false;
    }
    public static boolean core(String str){
        //判断素数
        if(!set.contains(str)){
            return false;//不是素数，返回false;
        }
        if(str.length()==1){
            return true;
        }
        //判断是否回文
        StringBuilder sb=new StringBuilder(str);
        if(!sb.reverse().toString().equals(str)){
            return false;
        }
//        char[] cs=str.toCharArray();
//        int i=0;
//        int j=cs.length-1;
//        while (i<=j){
//            if(cs[i]!=cs[j])return false;
//            i++;
//            j--;
//        }
        return true;
    }
    public static boolean helper1(int num){
        //判断素数
        int i=2;
        while (i*i<=num){
            int j=num/i;
            if(j*i==num){
                return false;
            }
            i++;
        }
        return true;
    }

}
