package ms;

public class Main {
    public static ListNode insert(ListNode root,int val){
        if(root==null){
            return new ListNode(val);
        }
        if(root.next==null){
            if(root.val>val){
                ListNode res=new ListNode(val);
                res.next=root;
                return res;
            }else {
                root.next=new ListNode(val);
                return root;
            }
        }
        ListNode node=root;
        while (node.next!=null&&node.next.val<val){
            node=node.next;
        }
        ListNode new_node=new ListNode(val);
        new_node.next=node.next;
        node.next=new_node;
        return root;
    }
}
class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val=val;
    }
}