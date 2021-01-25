public class binarySearchTree {
    binarySearchTree left, right;
    int data;

    public binarySearchTree(int data){ this.data = data; }

    void insert(int value){
        if(value <= data){
            if(left == null)
                left = new binarySearchTree(value);
            else
                left.insert(value);
        }
        else{
            if(right == null) right = new binarySearchTree(value);
            else right.insert(value);
        }
    }

    boolean contains(int value){
        if(data == value) return true;
        if(value < data)
            if(left == null) return false;
            else
                return left.contains(value);
        else
            if(right == null) return false;
            else
                return right.contains(value);
    }

    void printInOrder(){
        if(left != null) left.printInOrder();
        System.out.print(" " + data + " ");
        if(right != null) right.printInOrder();
    }

    void printPreOrder(){
        System.out.print(" " + data + " ");
        if(left != null) left.printPreOrder();
        if(right != null) right.printPreOrder();
    }
    void printPostOrder(){
        if(left != null) left.printPostOrder();
        if(right != null) right.printPostOrder();
        System.out.print(" " + data + " ");
    }

}
