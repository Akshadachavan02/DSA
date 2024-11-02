package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Cycledetection {
   static  class Edge {
        int src;
        int des;
        public Edge(int a,int d){
            this.src = a;
            this.des = d;
        }
    }
    public static void creategraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        //graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));
        graph[2].add(new Edge(2, 1));
        //graph[2].add(new Edge(2, 0));
        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));
        graph[4].add(new Edge(4, 3));
    }
    public static boolean detectcycle(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0;i<graph.length;i++){
            if(!vis[i]){
                if(detectcycleutil(graph,vis,i,-1)){
                    return true;
                }
                

            }
        }
        return false;
    }
    public static boolean isbipartile(ArrayList<Edge>[] graph){
        int color[]  = new int[graph.length];
        for(int i=0;i<graph.length;i++){
            color[i] = -1; //no color
        }
        Queue<Integer> q= new LinkedList<>();
        for(int i=0;i<graph.length;i++){
            if(color[i]==-1){
                q.add(i);
                color[i] = 0; //yellow color
                while(!q.isEmpty()){
                    int curr = q.remove();
                    for(int j=0;j<graph[curr].size();j++){
                        Edge e = graph[curr].get(j);
                        if(color[e.des] ==-1){
                            int nxtcolor = color[curr]==0 ? 1:0;
                            color[e.des] = nxtcolor;
                            q.add(e.des);
                        }
                        else if(color[e.des]==color[curr]){
                            return false;
                        }
                    }
                   }
            }
        }

        return true;
    }
    public static boolean detectcycleutil(ArrayList<Edge>[] graph,boolean vis[],int curr,int par){
        vis[curr] = true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.des] ){
                if(detectcycleutil(graph, vis, e.des, curr)){
                    return true;

                }
                
            }
            else if(vis[e.des] && e.des!=par){
                return true;
            }

        }
        return false;
     
    }
    public static void main(String[] args) {
        int v=5;
        ArrayList<Edge>[] graph = new ArrayList[v];
        creategraph(graph);
        //System.out.println(detectcycle(graph));
        System.out.println(isbipartile(graph));

    }
    
}
