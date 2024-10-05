//stack
import java.util.*;
public class arraylist13 {
    public static void main(String args[]){
        //stack
        Stack<String> st = new Stack<>();
        //adding elements
        st.push("pooja");
        st.push("Padmini");
        st.push("Tushara");
        st.push("vrashali");

        System.out.println("Elements in stack: "+st);
        //removing elements vrashali
        st.pop();

        System.out.println(st);

        System.out.println(st.peek());//returns element on top
    }
}
