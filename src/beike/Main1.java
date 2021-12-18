package beike;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        in.nextInt();
        String str=in.next();
        StringBuilder sb=new StringBuilder(str);
        String resvers=sb.reverse().toString();
        int count=0;
        for(int i=0;i<resvers.length()/2;i++){
            if(str.charAt(i)!=resvers.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
