import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

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
