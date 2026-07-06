class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Main {
    
        TreeNode invertTree(TreeNode root){
            if(root==null){
                return null;
            }
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            invertTree(root.left);
            invertTree(root.right);
            return root;
        }
        void preorder(TreeNode root) {
            if (root == null)
                return;
    
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    
    
    public static void main(String[] args) {
           Main obj = new Main();
           TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println("Before Inversion :");
        obj.preorder(root);

        obj.invertTree(root);

        System.out.println("\nAfter Inversion :");
        obj.preorder(root);
       
    }
}
