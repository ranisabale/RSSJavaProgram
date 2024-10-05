
package LinkedList;

import java.util.LinkedList;

class linkedlist8 {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("monika");
        obj.add("pooja");
        System.out.println(obj);
        obj.add("pranali");
        System.out.println(obj);
        obj.addFirst("varsh");
        System.out.println(obj);
        obj.remove();
        System.out.println(obj);

    }
}

