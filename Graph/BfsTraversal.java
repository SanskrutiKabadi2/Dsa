import java.util.*;
class Solution {
    static void bfs(int start,int n,List<List<Integer>> ls){
        Queue<Integer> qs=new LinkedList<>();
        boolean visited[]=new boolean[n];
        qs.add(start);
        visited[start]=true;
        while(!qs.isEmpty()){
            int ele=qs.poll();
            System.out.print(ele+" ");
            for(int e:ls.get(ele)){
                if(!visited[e]){
                    visited[e]=true;
                    qs.add(e);
                }
                
            }
            
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of vertices");
        int vertex=sc.nextInt();
        System.out.println("enter no of edges");
        int edges=sc.nextInt();
        
        List<List<Integer>> ls=new ArrayList<>();
        for(int i=1;i<=vertex;i++){
             List<Integer> l=new ArrayList<>();
             ls.add(l);
             
        }
        
        for(int i=1;i<=edges;i++){
             System.out.println("enter edges start : ");
             int p=sc.nextInt();
             System.out.println("enter edges end : ");
             int q=sc.nextInt();
             ls.get(p).add(q);
        }
        System.out.println();
        System.out.print("Bfs Traversal :");
        bfs(0,vertex,ls);
          
       
    }
}
