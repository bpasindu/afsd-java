import java.util.Scanner;

public class Match {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String userName = scan.next();

        System.out.print("Enter your age : ");
        int ageUser = scan.nextInt();

        for(int i=1; i<=10; i++){
            System.out.print("Enter partner " +i +" name : ");
            String namePartner = scan.next();

            System.out.print("Enter partner " +i +" age : ");
            int agePartner = scan.nextInt();

            if( ( (int)userName.charAt(0) >= (int)namePartner.charAt(0)) && (ageUser >= agePartner) ){
                System.out.print("Your matching partner is " +namePartner);
                break;
            } else if(i == 10){
                System.out.println("You have no matching partner!");
            }
        }
    }
}
