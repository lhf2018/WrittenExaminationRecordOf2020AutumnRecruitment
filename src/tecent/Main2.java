package tecent;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int M=in.nextInt();
        List<Set<Integer>> list=new ArrayList<>();
        for(int i=0;i<M;i++){
            int temp=in.nextInt();
            Set<Integer> set=new HashSet<>();
            for(int j=0;j<temp;j++){
                set.add(in.nextInt());
            }
            list.add(set);
        }
        List<Set<Integer>> arr=new ArrayList<>();
        for(int i=0;i<N;i++){
            arr.add(new HashSet<>());
        }
        for(int i=0;i<list.size();i++){
            for(int t:list.get(i)){
                arr.get(t).add(i);
            }
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        boolean[] flag=new boolean[N];
        Set<Integer> set=new HashSet<>();
        set.add(0);
        flag[0]=true;
        for(int i=0;i<N;i++){
            if(flag[i]){
                set.addAll(arr.get(i));
                for(Integer t:set){
                    flag[t]=true;
                    set.addAll(arr.get(t));
                }
            }
        }
        System.out.println(set.size());
//        for(Integer t:set){
//            System.out.println(t);
//        }
    }
    public static void helper(List<Set<Integer>> arr){

    }
}
