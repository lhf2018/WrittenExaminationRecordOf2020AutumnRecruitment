package ms;

import java.util.HashSet;
import java.util.Set;

public class Main5 {
    public static int calCount(ListNode root){
        Set<ListNode> set=new HashSet<>();
        ListNode node=root;
        int count=0;
        while (!set.contains(node)){
            count++;
            set.add(node);
            node=node.next;
        }
        return count;
    }
}
