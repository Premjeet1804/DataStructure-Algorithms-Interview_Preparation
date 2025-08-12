package TreesAlgorithms;

import java.util.List;

public class InOrder {
    class TreeNode{
        int val;
        TreeNode left,right;
    }

    public static void main(String[] args) {

    }
    private List<Integer> preOrder(TreeNode root,List<Integer> list)
    {
        if(root==null) return list;
        list.add(root.val);
        preOrder(root.left,list);
        preOrder(root.right,list);
        return list;

    }
}
