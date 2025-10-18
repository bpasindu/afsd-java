import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] studentNames = new String[3];
        int[][] studentMarks = new int[3][2];

        for(int i=0; i<studentNames.length; i++){
            System.out.print("Enter student " +(i+1) +" name : ");
            studentNames[i] = scan.next();
            for(int j=0; j<studentMarks[i].length; j++){
                System.out.print("Enter student " +studentNames[i] +" subject " +(j+1) +" mark : ");
                studentMarks[i][j] = scan.nextInt();
            }
        }

        int[] totalArr = findTotal(studentMarks);
        for(int i=0; i< totalArr.length; i++){
            System.out.println("Student " +studentNames[i] +" total mark is " +totalArr[i]);
        }

        double[] averageArr = findAverage(totalArr,studentMarks);
        for(int i=0; i< averageArr.length; i++){
            System.out.println("Student " +studentNames[i] +" average mark is " +averageArr[i]);
        }

        System.out.println("Maximum total student name is " +maxStudentName(totalArr,studentNames));

        System.out.println("Eligible count for parent meeting : " +eligibleForMeeting(averageArr));


    }

    public static int[] findTotal(int[][] studentsMark){
        int[] totalarray = new int[studentsMark.length];
        for(int i=0; i< studentsMark.length; i++){
            int total =0;
            for(int j=0; j<studentsMark[i].length; j++){
                total += studentsMark[i][j];
            }
            totalarray[i] = total;
        }
        return totalarray;
    }

    public static double[] findAverage(int[] totalMarkarr, int[][] studentsMark){
        double[] averageArr = new double[totalMarkarr.length];
        for(int i=0; i< totalMarkarr.length; i++){
            averageArr[i] = totalMarkarr[i]/studentsMark[i].length;
        }
        return averageArr;
    }

    public static String maxStudentName(int[] totalArr, String[] studentName){
        String maxName = studentName[0];
        int maxMark = totalArr[0];
        for(int i=0; i<totalArr.length; i++){
            if(totalArr[i] > maxMark){
                maxMark = totalArr[i];
                maxName = studentName[i];
            }
        }
        return maxName;
    }

    public static int eligibleForMeeting(double[] averageArr){
        int count = 0;
        for(int i=0; i< averageArr.length; i++){
            if(averageArr[i]<40){
                count++;
            }
        }
        return count;
    }
}
