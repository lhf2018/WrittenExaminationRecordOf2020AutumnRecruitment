package test.wangyi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class test3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int f=in.nextInt();
        Set<Integer> set=new HashSet<>();
        set.add(f);
        for(int i=0;i<m;i++){
            Set<Integer> temp=new HashSet<>();
            int len=in.nextInt();
            boolean injected=false;
            for(int j=0;j<len;j++){
                int tt=in.nextInt();
                if(set.contains(tt)){
                    injected=true;
                }
                temp.add(tt);
            }
            if(injected){
                for(Integer integer:temp){
                    set.add(integer);
                }
            }
        }
        System.out.println(set.size());
    }
}
