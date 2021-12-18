package duxiaoman;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int[] num=new int[26];
        for(char c:s2.toCharArray()){
            num[c-'A']++;
        }
        int count=0;
        for(char c:s1.toCharArray()){
            if(num[c-'A']>0){
                count++;
                num[c-'A']--;
            }
        }
        System.out.println(count);
    }
}
