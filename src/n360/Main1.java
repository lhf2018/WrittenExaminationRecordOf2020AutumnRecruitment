package n360;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        int res=0;
        for(int i=0;i<len;i++){
            if(helper(in.next())){
                res++;
            }
        }
        System.out.println(res);
    }

    private static boolean helper(String next) {
        if(next.length()>10)return false;
        for(char c:next.toLowerCase().toCharArray()){
            if(c<'a'||c>'z'){
                return false;
            }
        }
        return true;
    }

}
