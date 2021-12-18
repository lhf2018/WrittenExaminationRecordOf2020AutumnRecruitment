package haoweilai;

public class Solution1 {
    public String reverseParentheses(String s){
        StringBuilder sb=new StringBuilder(s);
        int left=-1;
        int right=-1;
        while ((left=sb.lastIndexOf("("))!=-1){
            right=sb.indexOf(")",left);
            StringBuilder temp=new StringBuilder(sb.substring(left+1,right));
            sb.replace(left,right+1,temp.reverse().toString());
        }
        return sb.toString();

    }
}
