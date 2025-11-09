import static java.awt.Color.green;

public class Test2 {
    public static void main(String[] args) {

        StudentNew student1 = new StudentNew();
        student1.setName("Yasindu");
        student1.setAge(27);
        student1.setIsSmoke(false);
        student1.setSalary(30000);

        StudentNew student2 = new StudentNew();
        student2.setName("Pasindu");
        student2.setAge(36);
        student2.setIsSmoke(true);
        student2.setSalary(90000);

        StudentNew student3 = new StudentNew();
        student3.setName("Musha");
        student3.setAge(287);
        student3.setIsSmoke(true);
        student3.setSalary(20000);

        //Inheritance

        //no multiple inheritance in java


        Car car1 = new Car();

        car1.noOfGear = 8;

        //has multilevel inheritance in java

        SparePart sparePart1 = new SparePart();

        sparePart1.color = "Green";

        //method overriding

        //super class references variable

        //Dynamic method dispatch
        Vehicle vehicle1 = new Car();
        vehicle1.engineStart();

    }
}
