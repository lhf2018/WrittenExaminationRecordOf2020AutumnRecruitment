package test.ali;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S=in.next();
        String T=in.next();
        if(S.length()==0){
            System.out.println(-1);
        }
        char last=T.charAt(T.length()-1);
        int[] num=new int[26];
        int index=-1;
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==last){
                index=i;
            }
        }
        int count=T.length()-1;
        for(int i=index;i>=0;i--){
            if(S.charAt(i)==T.charAt(count)){
                count--;
            }else {

            }
        }

    }
}
