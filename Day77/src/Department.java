import java.util.Scanner;

public class Department {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] departmentName = new String[2];
        double[][] employeeSalery = new double[2][3];

        for(int i=0; i<2; i++){
            System.out.print("Enter department " +(i+1) +" name : ");
            departmentName[i] = scan.next();
            for(int j=0; j<3; j++){
                System.out.print("Enter " +departmentName[i] +" department employee " +(j+1) +" salery : ");
                employeeSalery[i][j] = scan.nextDouble();
            }
        }

        for(int i=0; i<2; i++){
            double totalSalery = 0;
            for(int j=0; j<2; j++){
                totalSalery += employeeSalery[i][j];
            }
            System.out.println("Average salery of " +departmentName[i] +" department : " +(totalSalery/ employeeSalery.length));
        }

        double maxAverageSalery = 0;
        String maxAverageSaleryDepartment = departmentName[0];
        for(int i=0; i<2; i++){
            double totalSalery = 0;
            for(int j=0; j<2; j++){
                totalSalery += employeeSalery[i][j];
            }
            if(maxAverageSalery < (totalSalery/ employeeSalery.length)){
                maxAverageSalery = totalSalery/ employeeSalery.length;
                maxAverageSaleryDepartment = departmentName[i];
            }
        }
        System.out.println("Highest average salery department is : " +maxAverageSaleryDepartment);
    }
}
