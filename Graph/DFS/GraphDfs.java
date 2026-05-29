import java.util.*;
class Main {
    
    static void dfsGraph(int start,boolean[] visited,List<List<Integer>>ls){
        System.out.println(start+" ");
        visited[start]=true;
        
        for(int e:ls.get(start)){
            if(!visited[e]){
                dfsGraph(e,visited,ls);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of vertices : ");
        int n=sc.nextInt();
        List<List<Integer>>ls =new ArrayList<>();
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++){
            ls.add(new ArrayList<>());
        }
        System.out.println("Enter no of edges : ");
        int e=sc.nextInt();
        for(int i=0;i<e;i++){
            System.out.println("Enter vertex start : ");
            int u=sc.nextInt();
            System.out.println("Enter vertex end : ");
            int v=sc.nextInt();
            ls.get(u).add(v);
        }
        System.out.println("Enter start: ");
        int s=sc.nextInt();
        System.out.println("Dfs Traversal : ");
        dfsGraph(s,visited,ls);
    }
}
