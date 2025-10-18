import java.util.Scanner;

public class Methodes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello");
        printHello();
        //oddOrEven();
        System.out.print("Enter a number : ");;
        oddOrEven2(scan.nextInt());

        getSum("Pasindu" , 23,45,234);

        //for each loop

        int[] ar2 = {1,2,3,4,5,6};

        for(int data : ar2){
            System.out.println(data);
            System.out.println(data);
        }
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

    //variable arguments ---> varargs
    public static void getSum(String name, int... data){

    }

    // method overloading

    public static void createAccount(){
        // By changing parameter count
    }

    public static void createAccount(int x){
        //By changing parameter type
    }

    public static void createAccount(String x){

    }

    public static void createAccount(String x, int[] num){

    }
}
