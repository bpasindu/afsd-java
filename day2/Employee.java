import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] salery = new int[3];

        for(int i=0; i<3; i++){
            System.out.print("Enter salery of employee " +(i+1) +" : ");
            salery[i] = scan.nextInt();
        }

        int[] newSalery = new int[3];
        for(int i=0; i<3; i++){
            if(salery[i]>130000){
                newSalery[i] = salery[i] + (salery[i]*12)/100;
            }else{
                newSalery[i] = salery[i];
            }
        }

        double costForIncrement = 0;
        for(int i=0; i<3; i++){
            if(newSalery[i]>salery[i]){
                costForIncrement =+ (newSalery[i]-salery[i]);
            }
        }

        System.out.println("Cost for salery increment : " +costForIncrement);
    }
}
