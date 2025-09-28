import java.util.Scanner;

public class Sim {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbUserName = "admin";
        String dbPassword = "ad123";
        boolean loginSucess = false;
        do{
            System.out.print("Enter user name : ");
            String userName = scan.next();

            System.out.print("Enter password : ");
            String password = scan.next();

            if (userName.equals(dbUserName) && password.equals(dbPassword)) {
                System.out.println("Login sucess!");
                loginSucess = true;
            } else {
                System.out.println("Login failed! Retry");
            }
        } while (loginSucess == false);

        if (loginSucess) {
            System.out.print("How many users do you expect to meet : ");
            int noOfUsers = scan.nextInt();

            int dialogSims = 0;
            int mobitelSims = 0;
            int hutchSims = 0;
            for (int i = 1; i <= noOfUsers; i++) {
                System.out.print("Enter user " + i + " , number of sim : ");
                int noOfSim = scan.nextInt();

                for (int j = 1; j <= noOfSim; j++) {
                    System.out.print("Enter your " + j + " sim type : ");
                    String simName = scan.next();

                    switch (simName) {
                        case "Dialog":
                            dialogSims++;
                            break;
                        case "Mobitel":
                            mobitelSims++;
                            break;
                        case "Hutch":
                            hutchSims++;
                            break;
                        default:
                            noOfSim++;
                            System.out.println("Enter valid sim name");
                    }
                }
            }

            String popularSim = null;

            if (dialogSims == mobitelSims && mobitelSims == hutchSims) {
                popularSim = "Dialog, Mobitel, Hutch.";
            } else if (dialogSims > mobitelSims && dialogSims > hutchSims) {
                popularSim = "Dialog";
            } else if (mobitelSims > dialogSims && mobitelSims > hutchSims) {
                popularSim = "Mobitel";
            } else if (hutchSims > dialogSims && hutchSims > mobitelSims) {
                popularSim = "Hutch";
            } else if (dialogSims == mobitelSims && dialogSims > hutchSims) {
                popularSim = "Dialog & Mobitel";
            } else if (dialogSims == hutchSims && dialogSims > mobitelSims) {
                popularSim = "Dialog & Hutch";
            } else if (mobitelSims == hutchSims && mobitelSims > dialogSims) {
                popularSim = "Mobitel & Hutch";
            }

            System.out.println("Most popular sim is/are " + popularSim);
        }
    }
}

