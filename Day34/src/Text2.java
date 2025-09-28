import java.util.Scanner;

public class Text2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //Get user input

        System.out.print("Enter your name : ");
        String name = scan.next();

        System.out.print("Enter ypur age : ");
        int age = scan.nextInt();

        //check age is enough
        if(age<=18){
            System.out.println("You are not eligible. Age is not enough");
        }else{

            //check ascii value greater or equal to 70 and married

            System.out.print("Are you married or not(married=true / not=false) : ");
            boolean isMarried = scan.nextBoolean();


            int asciiOfFirstLetter = (int)name.charAt(0);

            if(asciiOfFirstLetter>=70 && isMarried){
                System.out.println("You are eligible for interview!");
            }else{
                System.out.println("You are not eligible for interview!");
            }
        }
    }
}
