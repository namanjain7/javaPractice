import java.awt.geom.IllegalPathStateException;

public class MinHeap {
    // Here the array size check condition is not added!!
    int size = 0;
    int capacity = 10;
    int items[] = new int[capacity];

    int getLeftChildIndex(int parentIndex) {return (parentIndex * 2) + 1;}
    int getRightChildIndex(int parentIndex) {return (parentIndex * 2) + 2;}
    int getParentIndex(int childIndex) {return (childIndex - 1) / 2;}

    boolean hasLeftChild(int parentIndex) {return getLeftChildIndex(parentIndex) < size;}
    boolean hasRightChild(int parentIndex) {return getRightChildIndex(parentIndex) < size;}
    boolean hasParent(int childIndex) {return getParentIndex(childIndex) >= 0;}

    int getLeftChild(int parentIndex) {return items[getLeftChildIndex(parentIndex)];}
    int getRightChild(int parentIndex) {return items[getRightChildIndex(parentIndex)];}
    int getParent(int childIndex) {return items[getParentIndex(childIndex)];}

    int peek() {return size != 0 ? items[0] : -1;}
    int poll() {
        if(size == 0) {System.out.println("Heap is Empty!!"); return Integer.MIN_VALUE;}
        int value = items[0];
        items[0] = items[size - 1];
        size--;
        heapifyDown();
        return value;
    }
    void add(int value){
        if(size <= capacity){
            //increase of array
        }
        items[size] = value;
        size++;
        heapifyUp();
        System.out.printf("Element %s is added in the head%n", value);
    }

    void swap(int index1, int index2){
        int temp = items[index1];
        items[index1] = items[index2];
        items[index2] = temp;
    }

    void heapifyUp(){
        int index = size - 1;
        while(hasParent(index) && getParent(index) > items[index]){
            swap(index, getParentIndex(index));
            index = getParentIndex(index);
        }
    }
    void heapifyDown(){
        if(size == 0) return;
        int parentIndex = 0;
        int smallerChildIndex;
        while(hasLeftChild(parentIndex)){
            smallerChildIndex = getLeftChild(parentIndex);
            if(hasRightChild(parentIndex) && getRightChild(parentIndex) < getLeftChild(parentIndex)){
                smallerChildIndex = getRightChildIndex(parentIndex);
            }

            if(items[parentIndex] > items[smallerChildIndex]) swap(parentIndex, smallerChildIndex);
            else break;
            parentIndex = smallerChildIndex;
        }
    }
}
