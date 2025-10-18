import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ageEmployee = new int[21];

        for(int i=0; i<21; i++){
            System.out.print("Enter employee " +(i+1) +" age : ");
            ageEmployee[i] = scan.nextInt();
        }

        System.out.print("Enter age limit to check : ");
        int ageLimit = scan.nextInt();

        checkLimit (ageEmployee , ageLimit);
    }

    public static void checkLimit(int[] ageArray, int ageLimitt){
        int count = 0;
        for(int i=0; i<ageArray.length; i++){
            if(ageArray[i]==ageLimitt){
                count++;
            }
        }
        System.out.println("Employees who more than age " +ageLimitt +" : " +count);
    }
}
