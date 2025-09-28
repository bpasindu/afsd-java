import java.util.Scanner;

public class Text3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("Enter 1st employee salery: ");
        double salery1 = scan.nextDouble();

        System.out.print("Enter 2nd employee salery: ");
        double salery2 = scan.nextDouble();

        System.out.print("Enter 3rd employee salery: ");
        double salery3 = scan.nextDouble();

        System.out.print("Enter 4th employee salery: ");
        double salery4 = scan.nextDouble();

        System.out.print("Enter 5th employee salery: ");
        double salery5 = scan.nextDouble();

        double total = salery1+salery2+salery3+salery4+salery5;

        double average = total/5;

        System.out.println("Average salery of all " +average);*/

        double total = 0.0;

        for (int j = 0; j < 5; j++)

            for (int i = 0; i < 5; i++) {
                System.out.print("Enter employee salery : ");
                total += scan.nextDouble();
                System.out.println("i before " + i);

                if (total > 10) {
                    i = i + 2;
                    break;
                }

                System.out.println("i after " + i);

            }

        }

}


