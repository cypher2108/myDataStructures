package mylist;

public class SingleLinkedList<E> {

    // first we're gonna create our Node class which defines how the Single Node
    // should look like.
    private static class Node<E> {

        //this is our data fields which tells that our single node contains any sort on
        //data object and also contains the refrence for the next node.
        private E theData;
        private Node<E> nextNodeRef;

        //constructor for our node class.
        public Node(E theData) {
            this.theData = theData;
            this.nextNodeRef = null;
        }

        @Override
        public String toString() {
            return "Node [" + theData + "]";
        }

        

    }

    //data fields for the single-linked-list class

    //refrence for the node.
    private Node<E> head;
    
    //size of the list because there is no need for capacity like arraylist
    //we can add as many node as we want to add.
    private int size;

    //contstructor
    public SingleLinkedList() {
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
            size++;
        }

    }

    //what if we're want to add our data at specific index.

    //one important thing to take a note on is we're starting our list with index 0 not 1 , keep that in mind.
    public void add(E anEntry, int index){
        
        //check if the list is empty of index exist in our list or not.
        if (index >= 0 || index < size) {
            
            /**
             * now check for same conditions.
             * Here there are two possibilities that
             * 
             * 1.if they're trying to insert the data at the first index
             * 2. they're trying to insert data  at any other index.
             */

             if (index == 0) {
                 Node<E> temp = head;
                 head = new Node<>(anEntry);
                 head.nextNodeRef = temp;
                 size++;
             } else{
                 Node<E> temp = head;
                 for (var i = 0; i < index - 1; i++) {
                     temp = temp.nextNodeRef;
                 }

                 Node<E> tempNode = temp.nextNodeRef;
                 temp.nextNodeRef = new Node<>(anEntry);
                 temp = temp.nextNodeRef;
                 temp.nextNodeRef = tempNode;
                 size++;
             }

        } else{
            System.out.println("There is no such index you're trying to access.");
        }
    }
    
    public void printList(){
        Node<E> temp = head;
        for (var i = 0; i < size; i++) {
            System.out.println(temp.theData);
            temp = temp.nextNodeRef;
        }
    }
    
}
