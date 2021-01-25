import java.util.*;

public class graph<T> {
    private HashMap<T, LinkedList<T>> map = new HashMap<T, LinkedList<T>>();

    public void insert_value(T value) {
        if (!map.keySet().contains(value)) {
            map.put(value, new LinkedList<T>());
            System.out.println(String.format("Value %d is inserted", value));
        } else
            System.out.println(String.format("Value %d is already present", value));
    }

    public void insert_edge(T source, T destination, boolean isBidirectional){
        if(!map.containsKey(source)) insert_value(source);
        if(!map.containsKey(destination)) insert_value(destination);
        map.get(source).add(destination);
        if(isBidirectional) map.get(destination).add(source);
    }

    public int get_node_count(){
        return map.size();
    }

    public int get_edge_count(){
        int count = 0;
        for(T i : map.keySet())
            count += map.get(i).size();
        return count;
    }

    public StringBuilder adjecencyList(){
        StringBuilder builder = new StringBuilder();
        for(T i: map.keySet()){
            builder.append(i.toString() + ":");
            for(T j: map.get(i)){
                builder.append(j.toString() + "->");
            }
            builder.append("\n");
        }
        return builder;
    }
}


class graphRobust{
    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    public class Node{
        private int id;
        LinkedList<Node> adjacent = new LinkedList<Node>();
        private Node(int id) {
            this.id = id;
        }
    }

    private Node getNode(int id){   //if node exist, then do nothing else create new node and add node in nodeLookup
        if(nodeLookup.containsKey(id)) return nodeLookup.get(id);
        Node t = new Node(id);
        nodeLookup.put(id, t);
        return nodeLookup.get(id);
    }

    public void addNode(int id){
        if(nodeLookup.containsKey(id)) return;
        Node t = new Node(id);
        nodeLookup.put(id, t);
        return;
    }

    public void addEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacent.add(d);
    }

    public boolean hasPathDFS(int source, int destination){
        Node s = nodeLookup.get(source);
        Node d = nodeLookup.get(destination);
        HashSet<Integer> visited = new HashSet<Integer>();
        return dfs(s, d, visited);
    }
    private boolean dfs(Node s, Node d, HashSet<Integer> visited){
        if(visited.contains(s.id)) return false;
        visited.add(s.id);
        if(s == d) return true;
        for(Node child : s.adjacent){
            if(dfs(child, d, visited)) return true;
        }
        return false;
    }

    public boolean hasPathBFS(int source, int destination){
        return hasPathBFS(getNode(source), getNode(destination));
    }

    private boolean hasPathBFS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        LinkedList<Node> visited = new LinkedList<Node>();
        nextToVisit.add(source);

        while(!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if(node == destination) return true;
            if(visited.contains(node)) continue;
            visited.add(node);
            for(Node child: node.adjacent){
                nextToVisit.add(child);
            }
        }

        return false;
    }
}