public class Test {
    public static void main(String[] args) {
        //copy of original data sheet === java object

        System.out.println(Student.age);

        //local variables
        Student std1 = new Student();
        std1.name = "Pasindu";


        //static variables
        std1.age= 22;
        System.out.println(std1.age);

        std1.address = "Gampaha";
        std1.isSmoke = false;
        std1.salary = 75000;

        //copy of original data sheet
        Student std2 = new Student();
        //std2.name = "Maneesha";
        System.out.println(std2.name);

        //std2.age = 24;
        System.out.println(std2.age);

        std2.address = "Ragama";
        std2.isSmoke = true;
        std2.salary = 20000;





        ///////////
        Student.getName();
        Student.age = 7;

        //Student.getAge();



        //Aqua
        Vehicle aqua = new Vehicle();
        aqua.brand = "Toyota";
        aqua.name = "Aqua";
        aqua.engineType = "Hybrid";
        aqua.power = 99;
        aqua.topSpeed = 180;

        //BMW i8
        Vehicle i8 = new Vehicle();
        i8.brand = "BMW";
        i8.name= "i8";
        i8.engineType = "Hybrid";
        i8.power = 370;
        i8.topSpeed = 250;
    }
}
