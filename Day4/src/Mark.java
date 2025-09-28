import java.util.Scanner;

public class Mark {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] subjectName = new String[9];
        int[] subjectMarks = new int[3];

        for(int i=0; i<9; i++){
            System.out.print("Enter your subject " +(i+1) +" name : ");
            subjectName[i] = scan.next();

            System.out.print("Enter your subject " +(i+1) +" mark : ");
            subjectMarks[i] = scan.nextInt();
        }

        String maxSubjectName = subjectName[0];
        int maxSubjectMark = subjectMarks[0];
        for(int i=1; i<9; i++){
            if(maxSubjectMark < subjectMarks[i]){
                maxSubjectMark = subjectMarks[i];
                maxSubjectName = subjectName[i];
            }
        }
        System.out.println("Max marked subject name is " +maxSubjectName);


        double totalMark=0;
        for (int i =0; i<9; i++){
            totalMark += subjectMarks[i];
        }
        System.out.println("Average mark of the student is : " +(totalMark/9));

    }
}
