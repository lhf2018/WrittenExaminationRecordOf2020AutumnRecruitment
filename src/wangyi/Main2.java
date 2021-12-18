package wangyi;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        List<String> list=new ArrayList<>();
        Set<String> set=new HashSet<>();
        for(int i=0;i<m;i++){
            String temp=in.next();
            list.add(temp);
            set.add(temp);
        }
        List<String> ll=new ArrayList<>();
        for (int i=1;i<=1000000;i++){
            String s=String.valueOf(i);
            if(!set.contains(s)){
                ll.add(s);
            }
        }
        Collections.sort(ll);
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        System.out.println("==============");
        List<String> res=new ArrayList<>();
        int first=0;
        int second=0;
        while (first<list.size()&&second<n-m){
            String rrr=helper(list.get(first),ll.get(second));
            res.add(rrr);
            if(list.get(first).equals(rrr)){
                first++;
            }else {
                second++;
            }
        }
        if(first<list.size()){
            for(int i=first;i<list.size();i++){
                res.add(list.get(first));
            }
        }
        if(second<n-m){
            for(int i=second;i<ll.size();i++){
                res.add(ll.get(second));
            }
        }
        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i));
            if(i!=res.size()-1){
                System.out.print(" ");
            }
        }

    }
    public static String helper(String m,String n){
        String[] temp=new String[2];
        temp[0]=m;
        temp[1]=n;
        Arrays.sort(temp);
        return temp[0];
    }
}
