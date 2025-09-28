import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scan.nextInt();

        while(number>0){

            System.out.print(number%10 + ", ");
            number = number/10;

        }
    }
}
