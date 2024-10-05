
package LinkedList;

import java.util.LinkedList;
class linkedlist6 {
    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<String>();
        obj.add("anamika");
        obj.add("pooja");
        System.out.println(obj);
        obj.add("pranali");
        System.out.println(obj);
        obj.addFirst("Vaishali");
        System.out.println(obj);
        obj.add("Rani");
        System.out.println(obj);
        obj.addLast("Sonam");
        System.out.println(obj);
        obj.add(3,"Suhani");
        System.out.println(obj);
        obj.remove(2);
        System.out.println(obj);
        obj.removeLast();
        System.out.println(obj);
        obj.clear();
        System.out.println(obj);

    }
}
