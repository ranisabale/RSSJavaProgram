package arraylist;

//package chapter_3;
import java.util.*;
public class arraylist2 {
    //ArrayList
    public static void main(String args[]){

        ArrayList<String> nameList = new ArrayList<>(); //store only String type of elements
        //adding elements
        nameList.add("rani");
        nameList.add("sakshi");
        nameList.add("neha");
        nameList.add(1,"pooja");

        //print list
        System.out.println(nameList);
    }
}
