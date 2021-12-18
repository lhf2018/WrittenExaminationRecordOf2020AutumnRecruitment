package huawei;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(getString("(((()())"));
    }
    public static String getString(String str){
        List<Integer> list=new ArrayList<>();
        Stack<Integer> left=new Stack<>();
        int right=0;
        while (right<str.length()){
            if(str.charAt(right)=='('){
                left.push(right);
            }else{
                if(left.isEmpty()){
                    continue;
                }else if(str.charAt(left.peek())=='('){
                    list.add(left.pop());
                    list.add(right);
                }
            }
        }
        Collections.sort(list);
        StringBuilder sb=new StringBuilder();
        for(Integer i:list){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
