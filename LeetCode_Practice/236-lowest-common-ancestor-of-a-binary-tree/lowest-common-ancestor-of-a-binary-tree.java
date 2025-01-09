class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: If the current node is null, return null.
        if (root == null) {
            return null;
        }

        // If the current node is either p or q, return the current node.
        else if (root.val == p.val || root.val == q.val) {
            return root;
        }

        // Recursively search for LCA in the left and right subtrees.
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both left and right are non-null, the current node is the LCA.
        if (left != null && right != null) {
            return root;
        }

        // If either left or right is non-null, return that non-null value.
        else if (left != null) {
            return left;
        }

        return right;
    }
}