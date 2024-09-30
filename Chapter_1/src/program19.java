
public class program19 {
    public static void main(String args[]){
        Main obj1 = new Main("java");
        Main obj2 = new Main("c++");
        Main obj3 = new Main("Python");
        Main obj4 = new Main("javascript");
    }
}

class Main{
    String language;
    Main(String lan){
        language = lan;
        System.out.println(language+" programming language");
    }
}

