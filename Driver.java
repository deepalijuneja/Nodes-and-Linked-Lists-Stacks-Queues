/**
 * This is the driver class for homework 7. There is only one main class; in my opinion, it is more efficient as all the test methods required have been under the umbrella of one class.
 * 
 * @author Deepali Juneja
 * @version 18 May 2020
 */
public class Driver {
    public static void main(String[] args) throws LinkedListException {
        testList();
        System.out.println("_______________");
        testStack();
        System.out.println("_______________");
        testQueue();
    }

    /**
     * Below is the testing method for the list class.
     * 
     * @throws LinkedListException
     */
    private static void testList() throws LinkedListException {
        List list = new List();
        System.out.println("sorry, empty list:"+ list.isEmpty());
        for (int i = 0; i < 15; i++) {
            list.append(i+10);
            System.out.println(list);
        }
        System.out.println("sorry empty list: "+ list.isEmpty());
        System.out.println("list size:" + list.size());
        System.out.println(list.remove(9) + " has been removed");
        System.out.println(list);
        System.out.println("list size: " + list.size()); 
    }
     
    /**
     * Below is the testing method for thestack class.
     * 
     * @throws LinkedListException
     */
    private static void testStack() throws LinkedListException {
        Stack s = new Stack();
        System.out.println("sorry, empty stack "+ s.isEmpty());
        for (int i = 0; i < 10; i++) {
            s.push(i+20);
            System.out.println(s);
        }
        System.out.println("empty stack: "+ s.isEmpty());
        System.out.println("stack size: " + s.size());
        System.out.println(s.pop() + "has been removed");
        System.out.println(s);
        System.out.println("stack size: " + s.size());
        s.push("CORONA");
        System.out.println(s);
        System.out.println("stack size: " + s.size());   
    }
    
    /**
     * Below is the testing method for the queue class.
     * 
     * @throws LinkedListException
     */

    private static void testQueue() throws LinkedListException {
        Queue q = new Queue();
        for (int i = 0; i < 13; i++) {
            q.enqueue(i+22);
            System.out.println(q);
        }
        System.out.println("empty queue "+ q.isEmpty());
        System.out.println("queue size: " + q.size());
        System.out.println(q.dequeue() + " has been removed");
        System.out.println(q);
        System.out.println("queue size: " + q.size());
        q.enqueue("CORONA");
        System.out.println(q);
        System.out.println("queue size: " + q.size());   
    }
}