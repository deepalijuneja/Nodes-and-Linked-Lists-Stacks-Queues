/**
 * This is the fourth part of the homework. The LinkedListException class here is thrown in place of RuntimeExceptions. It checks for any error/exceptions. 
 * 
 * @author Deepali Juneja
 * @version 16 May 2020
 */
public class LinkedListException extends Exception{

    /**
     * This is the first constructor and is empty.
     */
    public LinkedListException() {
        super();
    }

    /**
     * Below is the second constructor and it returns a user message.
     * @param m message
     */
    public LinkedListException(String m){
        super(m);
    }
    
}