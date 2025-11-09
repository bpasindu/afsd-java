package Question1;
import java.util.Scanner;

public class School {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Teacher[] teacherList = new Teacher[3];

        for(int i=0; i<3; i++){
            Teacher teacher = new Teacher();
            System.out.print("Enter teacher's name : ");
            teacher.setName(scan.next());
            System.out.print("Enter teaching subject : ");
            teacher.setSubject(scan.next());
            System.out.print("Enter number of teaching experience years : ");
            teacher.setServicePeriod(scan.nextInt());
            teacherList[i] = teacher;
        }

        for(int i=0; i<3; i++){
            teacherList[i].displayTeacher(teacherList[i]);
        }
    }
}
