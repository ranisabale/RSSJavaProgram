package linkedlist;

import java.util.LinkedList;
public class linkedlist3 {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("ajay");
        System.out.println(obj);
        obj.addFirst("Vishal");
        System.out.println(obj);
        obj.set(2,"Savita");
        System.out.println(obj);
    }
}
