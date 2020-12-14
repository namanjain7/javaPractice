public class random_functions {

    private boolean checkBST(binarySearchTree root, int min, int max){
        if(root == null) return true;
        System.out.println(root.data);
        if(root.data < min || root.data > max) return false;
        return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
    }

    public boolean isBST(binarySearchTree root){
        return checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}

//Ggetters and setters
class user{
    private String firstName;
    private String lastName;

    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public void setFirstName(String firstName) { this.firstName = firstName;}
    public void setLastName(String lastName) { this.lastName = lastName;}
    public void print(){
        System.out.println(String.format("First Name is: %s and Last Name is: %s", firstName, lastName));
    }
}