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
    
    static void bfs(Node root){
        if(root==null)return;
        Queue<Node> qs=new LinkedList<>();
        qs.add(root);
        while(!qs.isEmpty()){
            Node curr=qs.poll();
             System.out.print(curr.data + " ");
              if (curr.left != null)
                qs.add(curr.left);
                 if (curr.right != null)
                qs.add(curr.right);
        }
        
    }
    public static void main(String[] args) {
        
        System.out.println("Try programiz.pro");
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(8);

        bfs(root);
        
        
    }
}
