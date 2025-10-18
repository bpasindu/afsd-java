import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int accountCount = 0;
        Patient[] patientsDataBase = new Patient[50];
        while(true){
            System.out.println("======================");
            System.out.println("ABC Hospital");
            System.out.println("======================");

            System.out.println("1. Add a patient");
            System.out.println("2. See number of patients");
            System.out.println("3. Exit");

            System.out.print("Enter choice to proceed : ");
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    patientsDataBase[accountCount] = new Patient();
                    System.out.print("Enter name : ");
                    patientsDataBase[accountCount].patientName = scan.next();
                    System.out.print("Enter age : ");
                    patientsDataBase[accountCount].patientAge = scan.nextInt();
                    System.out.print("Enter addres : ");
                    patientsDataBase[accountCount].patientAddress = scan.next();
                    accountCount++;
                    break;
                case 2:
                    seeNumberOfPatients(accountCount);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Enter valid Number");
            }
            if(choice==3){
                break;
            }
        }
    }

    public static void seeNumberOfPatients(int count){
        System.out.println("Number of registered persons are : " +count);
    }

}
