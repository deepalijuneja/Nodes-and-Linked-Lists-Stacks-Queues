/**
 * This is part 3 of Homework 7 to build a Queue and uses inheritance.
 * 
 * @author Deepali Juneja
 * @version 16 May 2020
 */
public class Queue extends List{
    /**
     * Below is the method enqueue which inserts an element to the beginning of the list.
     * 
     * @param newData 
     * @throws LinkedListException whenever newData is checked as null
     */
    public void enqueue(Object newData) throws LinkedListException {
        if (newData!=null) {
            super.append(newData);
        }else{
            throw new LinkedListException("sorry! newData cannot be null");
        }
    }

    /**
     * Below is the method dequeue which removes an element from the end of the list.
     * 
     * @return the element removed/dequeued
     * @throws LinkedListException
     */
    public Object dequeue() throws LinkedListException {
        return super.remove(0);
    }
    
    @Override
    /**
     * The final method isEmpty returns true if empty, otherwise returns false.
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }
}