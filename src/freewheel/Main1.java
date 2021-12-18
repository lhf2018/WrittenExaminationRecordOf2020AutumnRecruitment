package freewheel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main1 {
    public ArrayList<ArrayList<Integer>> hashJoin (ArrayList<Integer> setA, ArrayList<Integer> setB) {
        // write code here
        Map<Integer, List<Integer>> map=new HashMap<>();
        for(int i=0;i<setA.size();i++){
            List<Integer> list=map.getOrDefault(setA.get(i),new ArrayList<>());
            list.add(i);
            map.put(setA.get(i),list);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<setB.size();i++){
            if(map.containsKey(setB.get(i))){
                for(Integer ii:map.get(setB.get(i))){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(ii);
                    temp.add(i);
                    res.add(temp);
                }
            }
        }
        return res;
    }
}
