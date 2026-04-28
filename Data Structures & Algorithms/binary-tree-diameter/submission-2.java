/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

 class Solution {
    private int diameter = 0; 
    public int diameterOfBinaryTree(TreeNode root) {
        length(root);
        return diameter;
    }
    public int length(TreeNode root) {
        if (root == null) return 0; 
        
        int left = length(root.left); 
        int right = length(root.right); 

        diameter = Math.max(diameter, left + right);

        return 1 + Math.max(left, right);
    }
}

// class Solution {
    
//     public int diameterOfBinaryTree(TreeNode root) {
//         int[]maxD = new int[1];
//         height(root,maxD);
//         return maxD[0];
//     }

//     public int height(TreeNode root,int[]maxD){
//         if(root==null) return 0;

//         int leftH = height(root.left,maxD);
//         int rightH = height(root.right,maxD);
//         maxD[0] = Math.max(maxD[0],leftH+rightH);

//         return 1+Math.max(leftH,rightH);
//     }
// }
