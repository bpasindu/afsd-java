import java.util.Scanner;

public class Methodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello");
        printHello();
        //oddOrEven();
        System.out.print("Enter a number : ");;
        oddOrEven2(scan.nextInt());
    }

    public static void printHello(){
        System.out.println("Hello Hello");
    }

    public static void oddOrEven(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scan.nextInt();

        if((number%2) == 0){
            System.out.println(number +" is a even number.");
        }else{
            System.out.println(number +" is a odd number.");
        }
    }

    ///// parametarized methods

    public static void oddOrEven2(int number){
        if((number%2) == 0){
            System.out.println(number +" is a even number.");
        }else{
            System.out.println(number +" is a odd number.");
        }
    }
}
