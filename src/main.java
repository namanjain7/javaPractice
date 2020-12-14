import java.math.BigDecimal;
import java.sql.Array;
import java.util.*;

public class main {

    //private static final int y = 10;      //Global variable declaration

    public static void main(String args[]){
        /*
        final int x;    //static variable declaration
        */
        /*
        long l = 5L;
        long k = 675340985743L;
        float f = 2.10f;
        double d = 4.10;
        double x = (double) (l / f) ;
        System.out.println(x);
        */
        /*
        BigDecimal dd = new BigDecimal(23.9);
        System.out.println(dd);
        int s = dd.intValue();
        System.out.println(s);
        */
        /*
        System.out.println(Double.isNaN(Math.sqrt(-1)));
        System.out.println(Math.pow(999, 9));
        */
        /*
        int x = 5;
        int a = x++;
        String s = "8";
        //System.out.println(x + " " + a);
        Integer y = Integer.parseInt(s);
        Integer z = Integer.valueOf(s);
        */
        /*
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        System.out.println(String.format("Hello %s", name));
        System.out.println(name.charAt(2));
         */
        /*
        int[] arr = new int[20];
        int[] brr = {8, 7, 6, 6, 5, 4, 5, 3, 1, 8, 6};

        System.out.println(arr + " " + Arrays.toString(brr));
        System.out.println(Arrays.toString(brr).getClass().getName());

        System.out.println(Arrays.binarySearch(brr, 6));
        Arrays.sort(brr);
        Arrays.fill(brr, -1);
        System.out.println(Arrays.toString(brr));
         */
        /*
        int[] arr = new int[10];
        Arrays.fill(arr, 4);
        Arrays.asList(arr);

        int brr[][] =
                {
                {
                    1, 1, 1
                }, {
                    2, 2, 2, 2, 2, 2, 2
        }
        };
         */
        /*
        List<Integer> brr = new ArrayList<Integer>();       //Implemented using static array, insertion and deletion requires whole array to be copied
        List<Integer> arr = new LinkedList<Integer>();      //Implemented using Linked List, insertion and deletion doesn't require much time
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(2, 3);
        System.out.println(arr);
        System.out.println(arr.indexOf(9));         //returns 1 if present otherwise -1
        System.out.println(arr.contains(1));        //Boolean returns true if present otherwise false
         */
        /*
        Integer[] l = {1, 5, 23, 4, 3, 54, 354, 345};
        List<Integer> l1 = Arrays.asList(l);


        System.out.println(Arrays.toString(l1.toArray()));
        for(int i = 0; i < l1.size(); i++){
            l1.set(i, l1.get(i) * 2);
            //System.out.print(l1.get(i) + " ");
        }
        //System.out.println("\n");
        System.out.println(Arrays.toString(l1.toArray()));

        for(int y : l1) System.out.print(" " + y);
        */
        /*
        List<List<Integer>> allGrades = new ArrayList<List<Integer>>();
        allGrades.add(Arrays.asList(5, 2, 65, 2, 6, 234, 234, 2354));
        allGrades.add(Arrays.asList(435, 234, 456, 234, 243));
        allGrades.add(Arrays.asList(234, 435, 234, 8, 567, 54, 54578, 4534));

        for(List<Integer> grade : allGrades) Collections.sort(grade);
        System.out.println(Arrays.toString(allGrades.toArray()));

        for(List<Integer> grades : allGrades){
            for(Integer grade : grades)
                System.out.print(" " + grade);
            System.out.println();
        }
         */
        /*
        binarySearchTree a = new binarySearchTree(3);
        a.insert(2);
        a.insert(8);
        a.insert(1);
        //a.insert(2);
        //a.printInOrder();
        //System.out.println();
        //a.printPreOrder();
        //System.out.println();
        //a.printPostOrder();
        //a.data = 900;
        random_functions b = new random_functions();
        System.out.println(b.isBST(a));

        int n1 = 3;
        int n2 = 5;
        System.out.println(n1 | n2);
         */
        /*
        String s1 = new String("java");
        String s2 = new String("java");
        String s3 = s2;

        System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // true
        */
        /*
        user a = new user();
        a.setFirstName("Naman");
        a.setLastName("Jain");                  //getters and setters
        System.out.println(String.format("My first Name is: %s and my last Name is: %s", a.getFirstName(), a.getLastName()));

        user b = new user();
        b.setFirstName("John");
        b.setLastName("Wick");

        List<user> l = new LinkedList<user>();
        l.add(a);
        l.add(b);

        for(int i = 0; i < l.size(); i++){
            l.get(i).print();
        }
         */
        /*
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Delhi");
        capitalCities.put("United States of America", "Washington DC");
        capitalCities.put("China", "Beijing");
        capitalCities.put("Japan", "Tokyo");
        capitalCities.put("Russia","Moscow");

        for(String i : capitalCities.keySet())
            System.out.println(String.format("The capital of the country %s is: %s", i, capitalCities.get(i)));
         */

        graph<Integer> a = new graph<Integer>();
        a.insert_edge(0, 1, false);
        a.insert_edge(0, 4, false);
        a.insert_edge(4, 3, false);
        a.insert_edge(4, 1, true);
        a.insert_edge(1, 3, true);
        a.insert_edge(1, 2, true);
        a.insert_edge(3, 2, true);
        System.out.println(String.format("Number of edges is %d", a.get_edge_count()));
        System.out.println(String.format("Number of nodes is %d", a.get_node_count()));
        System.out.println(a.adjecencyList());
    }
}


