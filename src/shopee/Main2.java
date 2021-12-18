package shopee;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String a=in.next();
        String b=a;
        if(a.charAt(0)=='0'||cm(a,b)>=0){
            System.out.println('0');
        }else {
            for (char c:a.toCharArray()){
                System.out.println(c);
            }
        }
    }

    private static int cm(String a,String b){
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)>b.charAt(i)){
                return 1;
            }else if(a.charAt(i)<b.charAt(i)) return -1;
        }
        return 0;
    }
}
