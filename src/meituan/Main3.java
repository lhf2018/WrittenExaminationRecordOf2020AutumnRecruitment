package meituan;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] arr=new int[n+1];
        for(int i=0;i<m;i++){
            int a=in.nextInt();
            int b=in.nextInt();
            if(arr[a]==0&&arr[b]==0){
                arr[a]=i+1;
                arr[b]=i+1;
            }else if(arr[a]!=0&&arr[b]==0){
                arr[b]=arr[a];
            }else if(arr[a]==0&&arr[b]!=0){
                arr[a]=arr[b];
            }else{
                int temp=arr[b];
                arr[b]=arr[a];
                for(int j=0;j<arr.length;j++){
                    if(arr[j]==temp){
                        arr[j]=arr[a];
                    }
                }
            }
        }
        Set<Integer> ss=new TreeSet<>();
        Map<Integer, List<Integer>> map=new TreeMap<>();
        for(int i=1;i<arr.length;i++){
            ss.add(arr[i]);
            if(map.containsKey(arr[i])){
                map.get(arr[i]).add(i);
            }else {
                map.put(arr[i],new ArrayList<>());
                map.get(arr[i]).add(i);
            }

        }
        System.out.println(map.size());
        for(Integer i:ss){
            List<Integer> list=map.get(i);
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
