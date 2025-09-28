import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] runsScore = new int[11];

        for(int i=0; i<11; i++){
            System.out.print("Enter palyer " +(i+1) +" score : ");
            runsScore[i] = scan.nextInt();
        }

        int totalMarks = 0;
        for(int i=0; i<11; i++){
           totalMarks += runsScore[i];
        }
        System.out.println("Average score of a player is " +(totalMarks/11));

        int highestMark = runsScore[0];
        for(int i=1; i<11; i++){
            if(highestMark < runsScore[i]){
                highestMark = runsScore[i];
            }
        }
        System.out.println("Highest mark is " +highestMark);

        System.out.println("Commit in feat branch");
    }
}
