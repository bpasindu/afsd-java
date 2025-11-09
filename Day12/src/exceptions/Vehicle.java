package exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = scan.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 = scan.nextInt();



        try{
            int answer = num1/num2;
            System.out.println("Answer is " +answer);
        }catch(ArithmeticException ex){
            System.out.println("Do not divide by zero...");
        }


        int[] ages = new int[12];
        try{
            ages[14] = 45;
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Enter correct index to store");
        }

        String studentAge = "Yasindu";
        try{
            int age = Integer.parseInt(studentAge);
        }catch(NumberFormatException ex){
            System.out.println("Enter valid age");
        }

        File file = new File("digudesa.mp3");
        try{
            FileReader reader = new FileReader(file);
        }catch(FileNotFoundException ex){
            System.out.println("digudesa not found..");
        }

        System.out.println("End of the progem....");
    }
}
