import java.util.Scanner;

public class Form {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = scan.next();

        System.out.print("Enter your age : ");
        int age = scan.nextInt();

        while(age>100){
            System.out.println("Your age in not possible age. Please enter your correct age!");

            System.out.print("Enter your age : ");
            age = scan.nextInt();
        }

        System.out.print("Enter your address : ");
        String address = scan.next();

        System.out.print("Enter your tel no : ");
        int telNo = scan.nextInt();

    }
}
