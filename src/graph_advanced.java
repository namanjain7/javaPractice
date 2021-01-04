import java.util.*;

public class graph_advanced {

    HashMap<Integer, LinkedList<Integer>> graph = new HashMap<>();

    public void addNode(int data){
        if(!graph.containsKey(data))
            graph.put(data, new LinkedList<>());
        return;
    }
    public void add_edge(Integer s, Integer d, boolean isBidirectional){
        if(!graph.containsKey(s)) addNode(s);
        if(!graph.containsKey(d)) addNode(d);
        graph.get(s).add(d);
        if(isBidirectional)
            graph.get(d).add(s);
    }

    public void print_adjacency_list(){
        for(Integer i : graph.keySet()){
            System.out.print("\n" + i + " -> ");
            for(Integer j : graph.get(i)){
                System.out.print(j + " : ");
            }
        }
        System.out.println();
    }

    public void topological_sort(){
        int[] inDegree = new int[graph.size()];
        for(LinkedList<Integer> i : graph.values()){
            for(Integer j : i){
                inDegree[j]++;
            }
        }
        System.out.print("InDegree of the Graph is");
        for(int i : inDegree)
            System.out.print( " : " + i);
        System.out.println();

        Queue<Integer> q = new LinkedList<Integer>();
        for(int i = 0; i < inDegree.length; i++){
            if(inDegree[i] == 0)
                q.add(i);
        }
        System.out.print("Topological Sorting of the graph");
        while(!q.isEmpty()){
            Integer u = q.remove();
            System.out.print(" : " + u);
            for(Integer j : graph.get(u)){
                inDegree[j]--;
                if(inDegree[j] == 0)
                    q.add(j);
            }
        }
    }

}
