package baidustar.b1002;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        for(int i=0;i<len;i++){
            int n=in.nextInt();
            List<Long> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                list.add(in.nextLong());
            }
            Collections.sort(list);
            long res=0;
            long last=0;
            for(int j=1;j<list.size();j++){
                last+=(list.get(j)-list.get(j-1))*j;
                res+=last;
            }
            System.out.println(res);
        }
    }
}
