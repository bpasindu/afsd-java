import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your salery : ");
        double salery = scan.nextDouble();

        System.out.print("Enter your salery advance : ");
        double advanced_salery = scan.nextDouble();

        System.out.print("Enter your medical fees : ");
        double medical_fees = scan.nextDouble();

        double gross_salery = salery - ( ((salery*8)/100) + advanced_salery + medical_fees );
        System.out.println("Your gross salery : " + gross_salery);
    }
}
