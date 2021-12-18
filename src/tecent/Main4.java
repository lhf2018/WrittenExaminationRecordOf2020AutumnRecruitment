package tecent;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int m=in.nextInt();
        int[] arr=new int[m];
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<m;i++){
            arr[i]=in.nextInt();
        }
        int[] nums=arr.clone();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            map.put(arr[i],new ArrayList<>());
        }
        for(int i=0;i<nums.length;i++){
            map.get(arr[i]).add(i);
        }
        int mid1=nums[nums.length/2];
        int mid2=nums[nums.length/2-1];
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i]).get(0)<arr.length/2){
                System.out.println(mid1);
            }else{
                System.out.println(mid2);
            }
            map.get(arr[i]).remove(0);
        }
    }
}
