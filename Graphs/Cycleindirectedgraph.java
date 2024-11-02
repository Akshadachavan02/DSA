package Graphs;

import java.util.ArrayList;
import java.util.Stack;

//import Array_2d.new11;

//import Array_2d.new11;

public class Cycleindirectedgraph {
    static class Edge{
        int src; int des;
        public Edge(int s,int d){
            this.src = s;
            this.des = d;
        }

    }
    public static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[2].add(new Edge(2, 3));
        graph[1].add(new Edge(1, 3));
    }
    public static boolean iscycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(iscycleutil(graph,i,vis,stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean iscycleutil(ArrayList<Edge>[] graph,int curr,boolean vis[],boolean stack[]){
        vis[curr] = true;
        stack[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(stack[e.des]){
                return true;
            }
            else if(!vis[curr] && iscycleutil(graph,e.des, vis, stack)){
                return true;
            }
        }
        return false;

    }
    public static void topological(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                topologicalutil(graph,i,vis,s);

            }0
        }
        while(!s.isEmpty()){
            System.out.println(s.pop()+" ");
        }
    }
    public static void topologicalutil(ArrayList<Edge>[] graph,int curr,boolean vis[],Stack<Integer> s){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des]){
                topologicalutil(graph, e.des, vis, s);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        //System.out.println(iscycle(graph));
        topological(graph);
        
    }
    
}
