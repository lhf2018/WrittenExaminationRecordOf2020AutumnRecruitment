package aiqiyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char[] chs =in.next().toCharArray();
        Set<String> set=new HashSet<>();
        int x=0;
        int y=0;
        set.add(x+","+y);
        for(char c:chs){
            if(c=='N'){
                y++;
            }else if(c=='S'){
                y--;
            }else if(c=='W'){
                x--;
            }else {
                x++;
            }
            String temp=x+","+y;
            if(set.contains(temp)){
                System.out.println("True");
                return;
            }else{
                set.add(temp);
            }
        }
        System.out.println("False");
    }
}
