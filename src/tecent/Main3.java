package tecent;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        Map<String,Integer> map=new HashMap<>();
        Map<Integer,List<String>> m=new HashMap<>();
        for(int i=0;i<n;i++){
            String temp=in.next();
            map.put(temp,map.getOrDefault(temp,0)+1);
        }
        for(String i:map.keySet()){
            if(m.containsKey(map.get(i))){
                m.get(map.get(i)).add(i);
            }else{
                m.put(map.get(i),new ArrayList<String>());
                m.get(map.get(i)).add(i);
            }
        }
        int[] nums=new int[map.size()];
        int index=0;
        for(String i:map.keySet()){
            nums[index++]=map.get(i);
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            Collections.sort(m.get(nums[i]));
            System.out.println(m.get(nums[i]).get(0)+nums[i]);
            System.out.println(m.get(nums[i]).remove(0));
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            Collections.sort(m.get(nums[i]));
            System.out.println(m.get(nums[i]).get(0)+nums[i]);
            System.out.println(m.get(nums[i]).remove(0));
        }
    }
}
