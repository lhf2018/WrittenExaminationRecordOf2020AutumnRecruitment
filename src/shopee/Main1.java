package shopee;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String temp=in.nextLine();
        char[] chars=temp.toCharArray();
        if(chars[0]>='A'&&chars[0]<='Z'){
            chars[0]=(char)(chars[0]-'A'+'a');
        }
        for(int i=1;i<chars.length;i++){
            if(!((chars[i-1]>='a'&&chars[i-1]<='z')||(chars[i-1]>='A'&&chars[i-1]<='Z')||(chars[i-1]>='0'&&chars[i-1]<='9'))){
                if(chars[i]>='a'&&chars[i]<='z'){
                    chars[i]=(char)(chars[i]-'a'+'A');
                }
            }else {
                if(chars[i]>='A'&&chars[i]<='Z'){
                    chars[i]=(char)(chars[i]-'A'+'a');
                }
            }
        }
        StringBuilder sb=new StringBuilder();
        boolean flag=false;
        for(char c:chars){
            if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
                if(!flag){
                    if((c>='A'&&c<='Z')){
                        sb.append((char)(c-'A'+'a'));
                    }else {
                        sb.append(c);
                    }
                    flag=true;
                }else {
                    sb.append(c);
                }
            }else if((c>='0'&&c<='9')){
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }
}
