package haoweilai;

class Node{
    int data;
    Node next;
}
public class Solution {
    public Node mergeTwoLists(Node n1,Node n2){
        Node node=new Node();
        Node res=node;
        while (n1!=null&&n2!=null){
            if(n1.data<=n2.data){
                node.next=n1;
                n1=n1.next;
            }else{
                node.next=n2;
                n2=n2.next;
            }
            node=node.next;
        }
        if(n1!=null){
            node.next=n1;
        }
        if(n2!=null){
            node.next=n2;
        }
        return res.next;
    }
}
