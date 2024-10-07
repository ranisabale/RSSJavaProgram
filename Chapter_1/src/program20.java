
public class program20 {
    public static void main(String[] args){
        Main21 obj1 = new Main21("rani", 4212,20);
        Main21 obj2 = new Main21("sakshi",4213);
    
        obj1.display();
        obj2.display();
    }
    }
    
    class Main21{
        int rollNo;
        String name;
        int age;
    
        Main21(String name, int rollNo){
            this.name = name;
            this.rollNo = rollNo;
        }
    
        Main21(String name, int rollNo, int age){
            this.name = name;
            this.rollNo = rollNo;
            this.age = age;  
        }
    
        void display(){
            System.out.print("Name: "+name+"\n"+"Roll No: "+rollNo+"Age: "+age);
        }
    }
    
