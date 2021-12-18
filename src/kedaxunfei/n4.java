package kedaxunfei;

import java.util.Scanner;

public class n4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        StringBuilder sb=new StringBuilder();
        for(char c:str.toCharArray()){
            if(c-'0'>=0&&c-'0'<=9){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
