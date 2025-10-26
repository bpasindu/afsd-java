
// original common data sheet ---> java class
public class Student {
    //Instance variables
    String name;
    static int age;
    String address;
    boolean isSmoke;
    double salary;

    //static methods
    public static void getName() {
          String myName;
//        getAge();
//        System.out.println(name);
    }

    //non-static methods
    public void getAge(){
        getName();
        System.out.println(age);
        System.out.println(name);
    }
}