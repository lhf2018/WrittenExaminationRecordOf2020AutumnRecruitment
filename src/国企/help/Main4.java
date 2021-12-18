package 国企.help;

import java.util.HashMap;
import java.util.Iterator;

public class Main4 {
    public static void main(String[] args) {
        HashMap map=new HashMap<Integer,Integer>();
        changeHashMap(map);
        for(Iterator it=map.keySet().iterator();it.hasNext();){
            Object k=it.next();
            System.out.println(k+"="+map.get(k));
        }
    }

    private static void changeHashMap(HashMap map) {
        map=new HashMap<Integer,String>();
        map.put(6,"apple");
        map.put(3,"banana");
        map.put(2,"pear");
        map.put(null,null);
        map.put(null,null);
    }
}
