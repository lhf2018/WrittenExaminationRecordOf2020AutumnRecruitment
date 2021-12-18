package haoweilai;

import javax.swing.tree.TreeNode;

public class Main1 {
    private StringBuilder sb=new StringBuilder();
    public String notReCuPreOrder (TreeNode root) {
        // write code here
        helper(root);
        StringBuilder ss=new StringBuilder();
        for(int i=0;i<sb.length();i++){
            ss.append(sb.charAt(i));
            if(i!=sb.length()-1){
                ss.append(",");
            }
        }
        return ss.toString();
    }
    public void helper(TreeNode root){
        if(root==null){
            return;
        }
//        sb.append(root.val);
//        helper(root.left);
//        helper(root.right);
    }
}
