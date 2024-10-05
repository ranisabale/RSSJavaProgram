

//package chapter_3;
import java.util.*;

class Student{
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age)
    {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}

class arraylist5 {
    public static void main(String args[]){
        //class object
        Student s1 = new Student(4212, "rani sabale", 21);
        Student s2 = new Student(4211, "Pari chavan", 22);
        Student s3 = new Student(4213, "Nikita wagh", 21);
        Student s4 = new Student(4214, "Tushar shinde", 22);

        //ArrayList with Student constractor
        ArrayList<Student> list = new ArrayList<Student>();

        //adding student class objj
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //getting iterator
        Iterator itr = list.iterator();

        //traversing elements

        while(itr.hasNext())
        {
            Student st =(Student)itr.next();
            System.out.println(st.name+" "+st.rollno+" "+st.age+" ");
        }
    }
}
