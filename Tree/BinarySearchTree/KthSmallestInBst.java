import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Main {
    
    // Insert node dynamically in BST
    static Node insert(Node root, int data) {
        if (root == null)
            return new Node(data);
        if (data < root.data)
            root.left = insert(root.left, data);
        else
            root.right = insert(root.right, data);
        return root;
    }

    // Find kth smallest using count[0] as mutable variable
    static int FindKthSmall(Node root, int k, int[] count) {
        if (root == null)
            return -1;

        int left = FindKthSmall(root.left, k, count);
        if (left != -1)
            return left;

        count[0]++; // increase count
        if (count[0] == k)
            return root.data;

        return FindKthSmall(root.right, k, count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = null;

        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            root = insert(root, val);
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int[] count = {0}; // acts like mutable int
        int result = FindKthSmall(root, k, count);

        if (result != -1)
            System.out.println(k + "th smallest element is " + result);
        else
            System.out.println("Tree has fewer than " + k + " elements.");

        sc.close();
    }
}
