/**
 * This is the first part of homework7 where we have the linked list class and its contains a node subclass. I took some help from www.geeksforgeeks.org/data-structures/linked-list/
 * and www.geeksforgeeks.org/linked-list-set-2-inserting-a-node/
 * 
 * @author Deepali Juneja
 * @version 14 May 2020
 * 
 */
public class List {
    /**
     * Below is the node subclass.
     * 
     * @author Deepali Juneja
     * @version 14 May 2020
     */
    private class Node {
        private Object data;
        private Node next;

       /**
         * Below is the node class constructor.
         * 
         * @param newData sets the new data
         * @param nextNode points at the next node
         */
        private Node(Object newData, Node nextNode) throws LinkedListException {
            this.setData(newData);
            this.next = nextNode;
        }
      
         /**
         * Below is the constructor for data only (not node).
         * 
         * @param newData 
         * @throws LinkedListException 
         */
        private Node(Object newData) throws LinkedListException {
            this.setData(newData);
            this.next = null;
        }

         /**
         * Below is the setter for data.
         * @param newData
         * @throws LinkedListException when data is null
         */
        private void setData(Object newData) throws LinkedListException {//checks if data is null
             if (newData != null) {
                this.data = newData;
            } else {
                throw new LinkedListException("sorry, this is null!");
             }
         }
         }

        private Node head;// as mentioned in hw, the start of the linked list
         /**
          * The method below moves every element to its right as new ones are added.
          * @param index 
          * @throws LinkedListException under 2 cases: null data or out of range index
          */
          public void insert(Object newData, int index) throws LinkedListException {
              if (this.isEmpty()) {
            this.head = new Node(newData);
           } else if (this.size() == 1) {
            head.next = new Node(newData);
           } else if (this.size() > 1 && index < this.size()) {
            Node newNode = head;
            for (int i = 0; i < index; i++) {
                newNode = newNode.next;
            }
             Node x = new Node(newData);
            x.next = newNode.next;
            newNode.next = x;
           } 
           if(newData == null || index <0 || index > this.size()){
            throw new LinkedListException("sorry! out of range index");
           }
    }

    /**
     * Below is the remove method which has two purposes: 1. it removes the element at the chosen index and 2. verifies the issue of index out fo range
     *
     * @param index where element is removed
     * @return whichever element is removed
     * @throws LinkedListException whenever the issue of index out of range arises
     */
    public Object remove(int index) throws LinkedListException {
        Object output = null;
        Node node = head;
          if (index == 0) {
            Node entry = head;
            head = head.next;
            output = entry.data;
        }
         if (index > 0 && index < this.size()) {
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            Node entry = node.next;
            node.next = node.next.next;
            output= entry.data;
        }
        if (index < 0 || index > this.size()) {
            throw new LinkedListException("sorry! index out of range");
        }
        return output;
    }

    /**
     * Below is the method that adds newData to the end of list and checks if newData is null. 
     * @param newData 
     * @throws LinkedListException whenever data is null
     */
    public void append(Object newData) throws LinkedListException {
        if (newData != null) {
            if (this.isEmpty()) {
                this.head = new Node(newData);
            } else {
                Node entry = head;
                while (entry.next != null) {
                    entry = entry.next;
                }
                entry.next = new Node(newData);
            }
        } else {
            throw new LinkedListException("sorry! data is null");
        }
    }

    /**
     * Below is the method delete which is the same as remove but has no return value, but also checks to see the index remains in the range.
     *
     * @param index where element gets removed
     * @throws LinkedListException whenever index is out of range
     */
    public void delete(int index) throws LinkedListException {
        Node node = head;
        if (index == 0) {
            Node entry = head;
            entry = head.next;
        }
        if (index > 0 && index <= this.size()) {
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            node.next = node.next.next;
        } else {
            throw new LinkedListException("sorry! the index is out of range");
        }
    }

    /**
     * Below is a standard accessor
     * @return size of the linked list
     */
    public int size() {
        int size = 0;
        Node node = head;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    /**
     * Below is the method that enumerates our list.
     * @return enumeration as a string
     */
    @Override
    public String toString() {
        String output = "[ ";
        Node node = head;
        while (node != null) {
            output+= node.data + " ";
            node = node.next;
        }
        output += "]";
        return output;

    }

    /**
     * Below is the isEmpty method which returns true if empty, otherwise it returns false.
     * @return true/false
     */
    public boolean isEmpty() {
        boolean output= false;
        if (head == null) {
            output = true;
        }
        return output;
    }

    /**
     * Below is the indexOf method which returns the value of the index and returns appropriate value.
     *
     * @param newData target object
     * @return index if found or -1 if not found
     */
    public int indexOf(Object newData) {
        int index = -1, counts = 0;
        Node node = head;
        while (node != null) {
            if ((node.data.equals(newData))) {
                index = counts;
                break;
            }
            counts++;
            node = node.next;
        }
        return index;
    }

    /**
     * Below is the final method called equals which checks if one list is a deep copy of the other i.e. whether they are equal or not.
     */
    @Override
    public boolean equals(Object other) {
        boolean output = false;
        if (other != null) {
            List list = (List) other;
            if (this.size() == list.size()) {
                if (this.toString().equals(list.toString())) {
                    output = true;
                }
            }
        }
        return output;
    }
}