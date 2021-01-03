/**
 * This is part 2 of Homework 7 where stack subclass extends the List superclass. 
 * 
 * @author Deepali Juneja
 * @version 14 May 2020
 */
public class Stack extends List{

    /**
     * Below is the push method which either pushes a new element to the beginning of a list or top of stack.
     * @param newData pushed object
     * @throws LinkedListException whenever newData is checked as null
     */
    public void push(Object newData) throws LinkedListException {
        if (newData != null) {
            super.insert(newData,0);
        }else{
            throw new LinkedListException("sorry! newData can't be null");
        }
    }

    /**
     * The method pop below removes an element from the beginning of the list.
     * @return 1st element
     * @throws LinkedListException 
     */
    public Object pop() throws LinkedListException {
        return super.remove(super.size()-1);
    }
    
    @Override
    /**
     * The final method isEmpty returns true if empty, otherwise returns false.
     */
    public boolean isEmpty(){
        return super.isEmpty();
    }
}