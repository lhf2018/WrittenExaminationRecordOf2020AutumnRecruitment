package xiecheng;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String pre=in.nextLine();
        int[] chs=new int[26];
        for(char c:pre.toCharArray()){
            chs[c-'a']++;
        }
        String line=in.nextLine();
        String tt=line;
        String res=in.next();
        line=line.replaceAll(","," ");
        line=line.replaceAll("\\."," ");
        line=line.replaceAll(":"," ");
//        System.out.println(line);
        String[] words=line.split(" ");
        List<Character> list=new ArrayList<>();
        for(int i=0;i<tt.length();i++){
            if(tt.charAt(i)==' '||tt.charAt(i)==','||tt.charAt(i)=='.'||tt.charAt(i)==':'){
                list.add(tt.charAt(i));
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            if(helper(words[i],chs)){
                sb.append(res);
            }else{
                sb.append(words[i]);
            }
            if(i!=words.length-1){
                sb.append(list.get(i));
            }
        }
        System.out.println(sb.toString());
    }

    private static boolean helper(String word, int[] chs) {
        int[] temp=chs.clone();
        for(char c:word.toCharArray()){
            temp[c-'a']--;
        }
        for(int i:temp){
            if(i!=0){
                return false;
            }
        }
        return true;

    }
}
