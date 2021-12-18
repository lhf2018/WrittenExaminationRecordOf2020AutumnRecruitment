package langchao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        List<Integer> list=new ArrayList<>();
        List<Integer> sortlist=new ArrayList<>();
        for(int i=0;i<len;i++){
            int temp=in.nextInt();
            list.add(temp);
            sortlist.add(temp);
        }
        Collections.sort(sortlist);
        int first=0;
        int second=0;
        int num=0;
        while (first!=list.size()){
            while (!list.get(first).equals(sortlist.get(second))){
                num++;
                first++;
            }
            while (first<list.size()&&list.get(first).equals(sortlist.get(second))){
                first++;
                second++;
            }
        }
        System.out.println(num);
    }
}
