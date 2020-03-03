package xyz.zxcwxy999.Offer.No07;


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0 && inorder.length == 0) {
            return null;
        }
        TreeNode treeNode = new TreeNode(preorder[0]);
        if (preorder.length == 1 && inorder.length == 1) {
            return treeNode;
        }
        for (int i = 0; i < inorder.length; i++) {
            if (preorder[0] == inorder[i]) {
                int[] leftpre = new int[i];
                int[] leftin = new int[i];
                for (int j = 0; j < i; j++) {
                    leftpre[j] = preorder[j + 1];
                    leftin[j] = inorder[j];
                }
                treeNode.left = buildTree(leftpre, leftin);
                int[] rightpre = new int[inorder.length - i - 1];
                int[] rightin = new int[inorder.length - i - 1];
                for (int j = i + 1, k = 0; j < preorder.length; j++) {
                    rightpre[k] = preorder[j];
                    rightin[k++] = inorder[j];
                }
                treeNode.right = buildTree(rightpre, rightin);
            }
        }
        return treeNode;
    }

    public void traverse(TreeNode treeNode) {
        if (treeNode == null) {
            System.out.println("NULL");
            return;
        }
        System.out.println(treeNode.val);
        if (treeNode.left != null) {
            traverse(treeNode.left);
        }
        if (treeNode.right != null) {
            traverse(treeNode.right);
        }

    }

    public static void main(String[] args) {
        int[] preorder = {};
        int[] inorder = {};
        TreeNode treeNode = new Solution().buildTree(preorder, inorder);
        new Solution().traverse(treeNode);
    }

}