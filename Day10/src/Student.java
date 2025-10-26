public class Student {
    String name;
    String address;
    boolean isSmoke;
    static int age;

    //static block --> initialize default values to static variables
    static {
        System.out.println("Static block");
        age = 22;
    }

    //instance block --> initialize default values to instance variables
    {
        System.out.println("instance block");
        name = null;
        address = null;
        isSmoke = false;
    }

    //constructor --> default constructor
    public Student(){
        System.out.println("no parameter.");
    }

    //constructor overloading
    public Student(String name){
        System.out.println("1 parameters");
    }


    public Student(String name, String address,boolean isSmoke){
        System.out.println("4 parameters");

        this.name = name;  // this key word eka danna adala object ekata, construcor ekan pass wenna value ekata nema,
        // this key word eka nati wunahama conflict ekak athi wenawa moketa mokak assign wenna onedha kiyala
        this.address = address;
        this.isSmoke = isSmoke;
    }
}
