package arraylist;//Queue
import java.util.*;
class arraylist14 {
    public static void main(String args[]){
        //Queue
        Queue q = new LinkedList();
        //adding elements in queue
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println("Elements in queue: "+q);

        System.out.println("peek of queue: "+q.peek());//it will return first number

        System.out.println("removing peek elements: "+q.poll());//removing 10

        System.out.println("Elements in queue: "+q);

    }
}
