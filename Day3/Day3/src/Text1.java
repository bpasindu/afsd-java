import java.util.Scanner;

public class Text1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = 45;
        short num2 = 30;

        short num3 = (short)num1;

        System.out.println(num3);
        System.out.print("Enter a byte number ");
        byte num4 = scan.nextByte();
        System.out.println(num4);

        if(num4<100){
            System.out.println("You are fail");
        }else{
            System.out.println("You are pass");
        }
    }
}
