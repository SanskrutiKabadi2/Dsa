import java.util.*;
class Solution{
    static class Node {

        int data;
        int parent;

        Node(int data, int parent) {
            this.data = data;
            this.parent = parent;
        }
    }
    static boolean isCycle(int start,int n,List<List<Integer>> graph){
        Queue<Node> qs=new LinkedList<>();
        boolean visited[]=new boolean[n];
        visited[start]=true;
        Node ele=new Node(start,-1);
        qs.add(ele);
        while(!qs.isEmpty()){
            Node el=qs.poll();
            int d=el.data;
            int p=el.parent;
            for(int ne:graph.get(d)){
                if(!visited[ne]){
                    visited[ne]=true;
                    qs.add(new Node(ne,d));
                }
                else{
                    if(ne!=p){
                        return true;
                    }
                    
                }
                
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of vertices : ");
        int n = sc.nextInt();
        System.out.println("Enter no of edges : ");
        int e = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < e; i++) {
            System.out.println("Enter edge start : ");
            int u = sc.nextInt();
             System.out.println("Enter edge end : ");
            int v = sc.nextInt();
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
         for (int i = 0; i < n; i++) {

            System.out.print(i + " -> ");

            for (int ne : graph.get(i)) {
                System.out.print(ne + " ");
            }

            System.out.println();
        }
        System.out.println(isCycle(0, n, graph));
        
        
    }
}
