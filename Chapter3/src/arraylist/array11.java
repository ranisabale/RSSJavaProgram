package arraylist;//package chapter_3;
import java.util.*;
class arraylist11 {
    public static void main(String args[]){
        //Vector

        Vector vec = new Vector<>();
        //adding elements
        vec.add("Pooja");
        //Adding elements
        vec.addElement("Varsh");

        System.out.println(vec);

        vec.remove(1);

        System.out.println(vec);
    }
}
