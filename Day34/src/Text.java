import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scan.next();

        System.out.print("Enter your maths mark: ");
        double mathsMark = scan.nextDouble();

        System.out.print("Enter your chemistry mark: ");
        double chemistryMark = scan.nextDouble();

        System.out.print("Enter your physics mark: ");
        double physicsMark = scan.nextDouble();

        double averageMark = (mathsMark + chemistryMark + physicsMark)/3;

        System.out.println(name + "'s average is : " +averageMark);
    }
}


