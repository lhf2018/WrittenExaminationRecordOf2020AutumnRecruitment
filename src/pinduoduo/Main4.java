package pinduoduo;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    private static int count=0;
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        List<String> list=new LinkedList<>();
        for(int i=0;i<6;i++){
            list.add(in.next());
        }
        char[][] ch=new char[list.size()][list.get(0).length()];
        for(int i=0;i<list.size();i++){
            ch[i]=list.get(i).toCharArray();
        }
        helper(ch,0,0);
        System.out.println(count%1000000009);
    }

    private static void helper(char[][] ch,int row,int col) {
        if(row==6){
            count++;
            System.out.println(count);
            return;
        }else {
            for(int i=0;i<6;i++){
                char tmp=(char)(i+'0');
                if(row!=0){
                    if(ch[row-1][col]==tmp)continue;
                }
                if(col!=0){
                    if(ch[row][col-1]==tmp)continue;
                }
                if(ch[row][col]=='#'){
                    ch[row][col]=tmp;
                    if(col==5){
                        helper(ch,row+1,0);
                    }else {
                        helper(ch,row,col+1);
                    }
//                    ch[row][col]='#';
                }else {
                    if(col==5){
                        helper(ch,row+1,0);
                    }else {
                        helper(ch,row,col+1);
                    }
                }
            }
        }
    }
}
