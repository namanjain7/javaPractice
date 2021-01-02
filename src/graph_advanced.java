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

    public void topological_sorting(){
        int[] inDegree = new int[graph.size() + 1];
        for(Integer i : graph.keySet()){
            for(Integer j : graph.get(i))
                inDegree[j]++;
        }

        System.out.println();

        Queue<Integer> q = new LinkedList<>();
        for(int i : inDegree) {
            if (i == 0)
                q.add(i);
        }
        System.out.println("Topological Sorting of the graph is: ");
        while(!q.isEmpty()){
            Integer u = q.remove();
            System.out.print(u + " : ");
            for(Integer i : graph.get(u)){
                inDegree[i]--;
                if(inDegree[i] == 0){
                    q.add(i);
                }
            }
        }
        System.out.println();

    }

}
