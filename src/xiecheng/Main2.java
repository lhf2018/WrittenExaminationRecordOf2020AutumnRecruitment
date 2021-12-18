package xiecheng;

import java.util.*;

public class Main2 {
    private static List<String> res=new ArrayList<>();
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String line=in.nextLine();
        String[] tt=line.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(tt));
        helper(list,0,"");
//        res.sort(Comparator.naturalOrder());
        for(int i=0;i<res.size();i++){
            if(helper2(res.get(i))){
                System.out.println(res.get(i));
            }else {
                System.out.println(res.get(i)+"--circular dependency");
            }
        }
    }

    private static boolean helper2(String s) {
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                return false;
            }
            set.add(c);
        }
        return true;
    }

    public static void helper(List<String> list,int index,String str){
        if(index==list.size()){
            res.add(str);
            return;
        }
        for(int i=0;i<list.get(index).length();i++){
            helper(list,index+1,str+list.get(index).charAt(i));
        }
    }
}
