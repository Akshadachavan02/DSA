package Graphs;
import java.util.*;

//mport Array_2d.new11;

public class graph {
    static class Edge{
        int src;
        int des;
        int wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.des = d;
            this.wt = w;
        }
    }
    public static void search(ArrayList<Edge>[] graph){
        boolean visited[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            BFS(graph,visited);;
        }
    }
    public static void BFS(ArrayList<Edge>[] graph,boolean visited[]){  //O(V+E)
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        while(!q.isEmpty()){
            int curr = q.remove();
            if(!visited[curr]){
                System.out.print(curr+" ");
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    visited[curr] = true;
                    q.add(e.des);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge>[] graph,int curr,boolean vis[]){
        System.err.print(curr+" ");
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                dfs(graph, e.des, vis);
            }
        }
    }
    public static boolean haspath(ArrayList<Edge>[] graph,int src,int des,boolean vis[]){
        if(src==des){
            return true;
        }
        vis[src] = true;
        for(int i=0;i<graph[src].size();i++){
            Edge e = graph[src].get(i);
            int nei = e.des;
            if(!vis[nei] && haspath(graph, nei, des, vis)){
                return true;
            }

        }
        return false;
    }
    
   public static void main(String[] args) {
    int v =7;
    ArrayList<Edge>[] graph = new ArrayList[v];
    for(int i=0;i<v;i++){
        graph[i] = new ArrayList<>();
    }
    graph[0].add(new Edge(0,1,1));
    graph[0].add(new Edge(0,2,1));
    graph[1].add(new Edge(1,3,1));
    graph[1].add(new Edge(1,0,1));
    graph[2].add(new Edge(2,0,1));
    graph[2].add(new Edge(2,4,1));
    graph[3].add(new Edge(3,1,1));
    graph[3].add(new Edge(3,4,1));
    graph[3].add(new Edge(3,5,1));
    graph[4].add(new Edge(4,3,1));
    graph[4].add(new Edge(4,2,1));
    graph[4].add(new Edge(4,5,1));
    graph[5].add(new Edge(5,3,1));
    graph[5].add(new Edge(5,4,1));
    graph[5].add(new Edge(6,5,1));
//
   // BFS(graph);
   // dfs(graph, 0, new boolean[v]);
   System.out.println(haspath(graph, 0,7,new boolean[v]));
    
  
        
    }
    
}
