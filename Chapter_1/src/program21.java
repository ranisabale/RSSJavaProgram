
public class program21 {
    public static void main(String[] args){
        Main obj1 = new Main("rani",20);
        Main obj2 = new Main(obj1);
        obj1.display();
        System.out.println();
        obj2.display();
    }    
}

class Main{
    int age;
    String name;

    Main(String name, int age){
        this.name = name;
        this.age = age;
    }

    Main(Main s){
        this.name = s.name;
        this.age = s.age;
    }

    void display(){
        System.out.print("name: "+name+"\t"+"age: "+age);
    }
}

