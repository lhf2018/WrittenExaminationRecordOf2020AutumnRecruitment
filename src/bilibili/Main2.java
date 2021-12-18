package bilibili;

import java.util.Stack;

public class Main2 {
    public boolean IsValidExp (String s) {
        // write code here
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                stack.push(s.charAt(i));
            }else {
                char c=s.charAt(i);
                char peek=stack.peek();
                if((s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']')&&stack.size()==0){
                    return false;
                }
                if((c==')'&&peek!='(')||(c==']'&&peek!='[')||(c=='}'&&peek!='{')){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        return stack.size()==0;
    }
    public boolean IsValidExp2(String s){
        while (s.contains("{}")||s.contains("()")||s.contains("[]")){
            s=s.replaceAll("\\{\\}","");
            s=s.replaceAll("\\[\\]","");
            s=s.replaceAll("\\(\\)","");
        }
        return s.length()==0;
    }
}
