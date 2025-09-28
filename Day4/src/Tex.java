import java.util.Scanner;

public class Tex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalTex = 0.0;

        for(int i=1; i<= 3; i++){
            System.out.print("Enter employee " +i +" salery : ");
            double salery = scan.nextDouble();
            if(salery>130000){
                totalTex += (salery*14)/100;
            }
        }
        System.out.println("Amount of overall tex to government is " +totalTex);
    }
}
