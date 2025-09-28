import java.sql.SQLOutput;

public class Demo {
    public static void  main(String[] args){
        //This is single line comment

        /*Difference between
        print and println
         */
        System.out.println("Hello World!. . .");
        System.out.print("Hello Pasindu! . . .");
        System.out.println("Hellow helooow");

        //Variables -- A temperory storage that take from Ram to store data

        // Pasindu 22 500.29 True

        String studentName = "Pasindu";
        String student_name = "Pasindu";
        int studentAge = 22;
        //int --> data type
        //studentAge --> variable name
        //22 --> data

        double accBal = 500.29;
        boolean isSmoke = true;

        System.out.println("Student name is " +studentName);
        System.out.println("student age is " +studentAge);
        System.out.println("Student account balance = "+accBal);
        System.out.println("Is student smoking = " +isSmoke);

    }
}
