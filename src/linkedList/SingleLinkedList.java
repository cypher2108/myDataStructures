package linkedList;

public class SingleLinkedList<E> {

    // first we're gonna create our Node class which defines how the Single Node
    // should look like.
    private static class Node<E> {

        //this is our data fields which tells that our single node contains any sort on
        //data object and also contains the refrence for the next node.
        private E theData;
        private int index;
        private Node<E> nextNodeRef;

        //constructor for our node class.
        public Node(E theData, Node<E> nextNodeRef) {
            this.theData = theData;
            this.nextNodeRef = nextNodeRef;
        }

        public Node(E theData) {
            this.theData = theData;
            this.nextNodeRef = null;
        }

    }

    //data fields for the single-linked-list class

    //refrence for the node.
    private Node<E> head;
    
    //size of the list because there is no need for capacity like arraylist
    //we can add as many node as we want to add.
    private int size;

    //contstructor
    public SingleLinkedList(Node<E> head, int size) {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    //we're gonna add items to our list.
    public void add(E anEntry){
        //now there are some possiblities in adding data which we're gonna cover
        //in this method.

        //1. what if our list would be an empty list.
        if (head == null) {
            head = new Node<>(anEntry);
            size++;
        } else{
            //2. if it's not an empty list.
            Node <E> temp = head;
            
            //basically looping through the whole loop to get to that last node after which we're want to add next node.
            while (temp.nextNodeRef != null) {
                temp = temp.nextNodeRef;
            }
            //once we get to that node we're gonna set the next node refrence to the new node we've created for the data we've given.
            temp.nextNodeRef = new Node<>(anEntry);
        }

    }

}
