import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter student mark : ");
        double mark = scan.nextDouble();

        if(mark>=75){
            System.out.println("Student grade = A ");
        }else if(mark>=65){
            System.out.println("Student grade = B ");
        }else if(mark>=55){
            System.out.println("Student grade = C ");
        }else{
            System.out.println("Student grade = F ");
        }
    }
}
