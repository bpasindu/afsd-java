import java.util.Scanner;

public class Matching {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] boysNames = new String[3];
        String[] girlsNames = new String[3];

        for(int i=0; i<boysNames.length; i++){
            System.out.print("Enter boy " +(i+1) +" name : ");
            boysNames[i] = scan.next();
        }

        for(int i=0; i<girlsNames.length; i++){
            System.out.print("Enter girl " +(i+1) +" name : ");
            girlsNames[i] = scan.next();
        }

        matchingCouple(boysNames , girlsNames);
    }

    public static void matchingCouple(String[] boyName, String[] girlName){
        int matchingCount =0;
        for(int i=0; i<boyName.length; i++){
            if((int)boyName[i].charAt(0) > (int)girlName[i].charAt(girlName[i].length() -1)){
                matchingCount++;
            }
        }
        System.out.println("Matching couple count is " +matchingCount);
    }
}
