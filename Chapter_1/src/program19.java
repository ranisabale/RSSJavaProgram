
public class program19 {
    public static void main(String args[]){
        Main19 obj1 = new Main19("java");
        Main19 obj2 = new Main19("c++");
        Main19 obj3 = new Main19("Python");
        Main19 obj4 = new Main19("javascript");
    }
}

class Main19{
    String language;
    Main19(String lan){
        language = lan;
        System.out.println(language+" programming language");
    }
}

