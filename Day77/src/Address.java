import java.util.Scanner;

public class Address {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] ar1 = new int[7];
        System.out.println(ar1);

        int[] ar2 = ar1;
        System.out.println(ar2);

        int[][] studentMarks = new int[2][3];

        for(int i=0; i<2; i++){
            System.out.println("Enter student number : ");
            for(int j=0; j<3; j++){
                System.out.print("Enter student " +(i+1) +" subject" +(j+1) +" marks : ");
                studentMarks[i][j] = scan.nextInt();
            }
        }

    }
}


