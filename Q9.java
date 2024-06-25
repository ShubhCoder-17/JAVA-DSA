
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode(int x) {
        val = x;
    }
}

public class Q9 {
    private int sum = 0;
    
    public TreeNode bstToGst(TreeNode root) {
        if (root != null) {
            bstToGst(root.right);
            sum += root.val;
            root.val = sum;
            bstToGst(root.left);
        }
        return root;
    }
    
    // Helper method to print the tree (in-order traversal)
    public void printTree(TreeNode node) {
        if (node != null) {
            printTree(node.left);
            System.out.print(node.val + " ");
            printTree(node.right);
        }
    }

    public static void main(String[] args) {
        // Create a sample tree
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(1);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        root.left.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(8);

        Q9 solution = new Q9();
        System.out.println("Original tree (in-order):");
        solution.printTree(root);
        System.out.println();

        // Convert BST to GST
        solution.bstToGst(root);

        System.out.println("Greater Sum Tree (in-order):");
        solution.printTree(root);
    }
}
