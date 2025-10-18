import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] holderName = new String[3];
        int[] accountNumber = new int[3];
        double[] amount = new double[3];

        for(int i=0; i<3 ; i++){
            System.out.println("---Enter bank holder " +(i+1) +" details---");
            System.out.print("Name : ");
            holderName[i] = scan.next();
            System.out.print("Account Number : ");
            accountNumber[i] = scan.nextInt();
        }

        boolean stop = true;

        while(stop){
            System.out.println("-----------------------------------------------");
            System.out.println("What do you want to do :");
            System.out.println("Press 1 if you want to do deposit");
            System.out.println("Press 2 if you want to do withdraw");
            int task = scan.nextInt();

            System.out.print("Enter your account number correctly : ");
            int currentAccountNumber = scan.nextInt();

            switch(task){
                case 1:

                    System.out.print("Enter deposit amount : ");
                    double currentDepositAmount = scan.nextDouble();

                    for(int i=0; i<3; i++){
                        if(currentAccountNumber == accountNumber[i]){
                            amount[i] += currentDepositAmount;
                            System.out.println("Your new balance is : "+amount[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount : ");
                    double currentWithdrawalAmount = scan.nextDouble();

                    for(int i=0; i<3; i++){
                        if(currentAccountNumber == accountNumber[i]){
                            if(amount[i]>currentWithdrawalAmount){
                                amount[i] -= currentWithdrawalAmount;
                                System.out.println("Your new balance is " +amount[i]);
                            }else{
                                System.out.println("You have not sufficient balance! Please try again with low amount.");
                            }
                        }
                    }
                    break;
            }
        }
    }
}
