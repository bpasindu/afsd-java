import java.util.Scanner;

public class DefinedArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] ar2 = {12, 78, 45, 65, 98, 56};

        System.out.print("Enter a number to check : ");
        System.out.println(findAvailability(ar2 , scan.nextInt()));
    }

    public static boolean findAvailability(int[] numberArray , int checkNumber){
        for(int i=0; i < numberArray.length ; i++){
            if(numberArray[i] == checkNumber){
                return true;
            }
        }
        return false;
    }
}
