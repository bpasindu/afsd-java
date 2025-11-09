package Day11_M;

public interface StudentService {
    void saveStudent(String name);
    void deleteStudent();
    void updateStudents();

    //maker interfaces
    //functional interfaces
    //concrete methods --> static / default

    static void getStuName(){
        System.out.println("concrete methods......");
    }

}


