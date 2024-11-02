package Graphs;
import java.util.*;

class Largestsumcycle {
    static List<Integer> tmp = new ArrayList<>();
          static List<List<Integer> > adj = new ArrayList<>();
       static int[] vis, par;
      static long dfs(int node, int p)
      {
          vis[node] = 1;
          par[node] = p;
          tmp.add(node);
          for (int i : adj.get(node)) {
              if (vis[i] == 0) {
                  long z = dfs(i, node);
                  if (z != -1) {
                      return z;
                  }
              }
              else if (vis[i] == 1) {
                  long sum = i;
                  while (node != i) {
                      sum += node;
                      node = par[node];
                  }
                  if (node == i) {
                      return sum;
                  }
                  return -1;
              }
          }
          return -1;
      }
  
      public static long largesSumCycle(int Edge[]){
          int  N = Edge.length;
          
          long ans = -1;
          vis = new int[N];
          adj = new ArrayList<>(N);
          par = new int[N];
          for (int i = 0; i < N; i++) {
              adj.add(new ArrayList<>());
              if (Edge[i] != -1) {
                  adj.get(i).add(Edge[i]);
              }
          }
          for (int i = 0; i < N; i++) {
              if (vis[i] == 0) {
                  ans = Math.max(ans, dfs(i, -1));
                  for (int j : tmp) {
                      vis[j] = 2;
                  }
                  tmp.clear();
              }
          }
  
          return ans;
          
      }
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int a = sc.nextInt();
         int[] Edge =  {4 ,4 ,1 ,4 ,13, 8 ,8 ,8 ,0 ,8 ,14 ,9 ,15, 11 ,-1 ,10 ,15 ,22 ,22 ,22 ,22 ,22 ,21};
         
        // for(int i=0;i<a;i++){
        //     Edge[i] = sc.nextInt();

        // }
       System.out.println(largesSumCycle(Edge));
      }
  }