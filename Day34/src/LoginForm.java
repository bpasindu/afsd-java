import java.sql.SQLOutput;
import java.util.Scanner;

public class LoginForm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String dbEmail = "admin@gmail.com";
        int dbPassword = 12345;

        //get email and password from user

        System.out.print("Email : ");
        String email = scan.next();

        System.out.print("Password : ");
        int password = scan.nextInt();

        //check they are matched with dbemail and dbpassword
        //if matched display login sucess // if not login failed

        if(email.equals(dbEmail) && password == dbPassword){
            System.out.println("Login Sucess!");
        }else{
            System.out.println("Login failed!");
        }

    }
}
