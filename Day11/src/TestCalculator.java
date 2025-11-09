import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Calculator calculator = new CalculatorImpl();

        System.out.println("==Addition==");
        System.out.println(calculator.getSum(34,60));

        System.out.println("==Subtraction==");
        System.out.println(calculator.getSubtract(100,60));

        System.out.println("==Multiplication==");
        System.out.println(calculator.getMultiply(3,6));

        System.out.println("==Division==");
        System.out.println(calculator.getDivision(81,9));

        ///// compile time polymorphism
        CompileTime compileTime = new CompileTime();
        compileTime.play(45);

        //runtime polymorphism
        //A a = new B();
        // a.dance();

        //inheritance
        B b = new B(54);

        //Records
        Animal animal = new Animal("Lion",4,"Meal");
        System.out.println(animal);


    }
}
