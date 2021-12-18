package ms;

import java.util.ArrayList;
import java.util.List;

public class Main2 {
    public static String reverseSentence(String str,char c){
        String[] words=str.split(" ");
        StringBuilder sb=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseSentence2(" hello 1world 2tom2 "));
    }
    public static String reverseSentence2(String str){
        List<String> list=new ArrayList<>();
        int start=0;
        for(int i=0;i<str.length();i++){
            if(!((str.charAt(i)-'a'>=0&&str.charAt(i)-'a'<26)||(str.charAt(i)-'A'>=0&&str.charAt(i)-'A'<26))){
                list.add(str.substring(start,i+1));
                start=i+1;
            }

        }
        StringBuilder sb=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            String temp=list.get(i);
            sb.append(temp.charAt(temp.length()-1));
            sb.append(temp.substring(0,temp.length()-1));
        }
        return sb.toString();
    }
}
