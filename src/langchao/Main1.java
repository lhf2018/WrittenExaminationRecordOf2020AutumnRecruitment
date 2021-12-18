package langchao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<len;i++){
            list.add(in.nextInt());
        }
        int last=list.get(list.size()-1);
        int num=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>last){
                num++;
                last=list.get(i);
            }
        }
        System.out.println(num);
    }
}
