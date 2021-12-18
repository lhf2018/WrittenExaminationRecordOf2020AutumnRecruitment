package meituan;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        Set<String> set=new HashSet<>();
        int count=0;
        for(int i=0;i<len*2;i++){
            String str=in.next();
            if(i%2==0){
                set.add(str);
            }else {
                if(set.contains(str)){
                    count++;
                    set.clear();
                }
            }

        }
        System.out.println(count);
    }
}
