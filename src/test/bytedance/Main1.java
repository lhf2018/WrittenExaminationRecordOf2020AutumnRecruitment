package test.bytedance;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        while (len-->0){
            String s=in.next();
            String res=helper(s);
            System.out.println(res);
        }
    }

    private static String helper(String s) {
        StringBuilder sb=new StringBuilder(s);
        int count=0;
        for(int i=2;i<s.length();i++){
            if(sb.charAt(i)==sb.charAt(i-1)&&sb.charAt(i-1)==sb.charAt(i-2)){
                sb.deleteCharAt(i);
                i--;
                continue;
            }
            if(i>2){
                if(sb.charAt(i)==sb.charAt(i-1)&&sb.charAt(i-2)==sb.charAt(i-3)){
                    sb.deleteCharAt(i);
                    i--;
                }
            }
        }
        return sb.toString();
    }
}
