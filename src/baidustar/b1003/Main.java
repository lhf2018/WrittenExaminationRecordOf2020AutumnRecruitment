package baidustar.b1003;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int len=in.nextInt();
        for(int i=0;i<len;i++){
            int p=in.nextInt();//人数
            Map<Integer, Set<Integer>> map=new HashMap<>();//时间，地点 会被感染
            Set<Integer> res=new HashSet<>();//感染名单
            res.add(1);
            for(int j=0;j<p;j++){
                int t=in.nextInt();//几组时间
                boolean isInject=false;//未被感染
                for(int k=0;k<t;k++){
                    if(j==0){
                        int time=in.nextInt();
                        int place=in.nextInt();
                        map.put(time,new HashSet<>());
                        map.get(time).add(place);
                    }else {
                        int time=in.nextInt();
                        int place=in.nextInt();
                        if(isInject){
                            if(map.containsKey(time)){
                                map.getOrDefault(time,new HashSet<>()).add(place);
                            }else {
                                map.put(time,new HashSet<>());
                                map.get(time).add(place);
                            }
                            continue;
                        }
                        if(map.containsKey(time)&&map.get(time).contains(place)){
                            //被感染
                            isInject=true;
                            res.add(j+1);
                        }
                    }
                }
            }
            List<Integer> list=new ArrayList<>(res);
            Collections.sort(list);
            for(int j=0;j<list.size();j++){
                System.out.print(list.get(j));
                if(j!=list.size()-1){
                    System.out.print(" ");
                }
            }
        }
    }
}