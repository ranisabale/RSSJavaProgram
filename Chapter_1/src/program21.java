
public class program21 {
    public static void main(String[] args){
        Main22 obj1 = new Main22("rani",20);
        Main22 obj2 = new Main22(obj1);
        obj1.display();
        System.out.println();
        obj2.display();
    }    
}

class Main22{
    int age;
    String name;

    Main22(String name, int age){
        this.name = name;
        this.age = age;
    }

    Main22(Main22 s){
        this.name = s.name;
        this.age = s.age;
    }

    void display(){
        System.out.print("name: "+name+"\t"+"age: "+age);
    }
}

