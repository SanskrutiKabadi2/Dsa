class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {  // ✅ You forgot the data constructor
        this.data = data;
        this.left = null;
        this.right = null;
    }

    Node() {  // Optional: default constructor
        this.left = null;
        this.right = null;
    }
}

class BinarySearchTree {

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insertNode(int data) {
        root = insert(root, data);
    }

    // ✅ helper for insertion
    Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;  // ✅ missing semicolon
        }
        if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // ================= Traversals =================

    // preorder
    void preorderTraversal() {
        preorder(root);
    }

    void preorder(Node root) {
        if (root == null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }

    // inorder
    void inorderTraversal() {
        inorder(root);
    }

    void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);               // ✅ was wrongly calling preorder()
        System.out.println(root.data);
        inorder(root.right);
    }

    // postorder
    void postorderTraversal() {
        postorder(root);
    }

    void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);             // ✅ was wrongly calling preorder()
        postorder(root.right);
        System.out.println(root.data);
    }

    // ================= Find Minimum =================
    int findMin() {
        return min(root);
    }

    int min(Node root) {
        if (root == null) {
            throw new IllegalStateException("Invalid tree");  // ✅ fixed syntax
        }
        if (root.left == null) {
            return root.data;
        } else {
            return min(root.left);
        }
    }

    // ================= Find Maximum =================
    int findMax() {
        return max(root);
    }

    int max(Node root) {
        if (root == null) {
            throw new IllegalStateException("Invalid tree");
        }
        if (root.right == null) {
            return root.data;
        } else {
            return max(root.right);
        }
    }

    // ================= Driver Test =================
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertNode(50);
        bst.insertNode(30);
        bst.insertNode(70);
        bst.insertNode(20);
        bst.insertNode(40);
        bst.insertNode(60);
        bst.insertNode(80);

        System.out.println("Inorder Traversal:");
        bst.inorderTraversal();

        System.out.println("\nPreorder Traversal:");
        bst.preorderTraversal();

        System.out.println("\nPostorder Traversal:");
        bst.postorderTraversal();

        System.out.println("\nMinimum value: " + bst.findMin());
        System.out.println("Maximum value: " + bst.findMax());
    }
}

