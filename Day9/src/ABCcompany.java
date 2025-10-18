import java.util.Scanner;

public class ABCcompany {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee[] employeesArr = new Employee[30];
        int count = 0;

        while(true){
            System.out.println("======================");
            System.out.println("ABC Company");
            System.out.println("======================");

            System.out.println("1. Add a employee");
            System.out.println("2. Get count more than 75000");
            System.out.println("3. Max salaried employee");
            System.out.println("4. Find a employee via NIC");
            System.out.println("5. Increment salary");
            System.out.println("6. Increment employee list");
            System.out.println("7. Exit");
            System.out.println("======================");

            System.out.print("Enter choice to proceed : ");
            int choice = scan.nextInt();

            switch(choice){
                case 1:
                    employeesArr[count] = new Employee();
                    System.out.print("Enter empoyee NIC : ");
                    employeesArr[count].nic = scan.next();
                    System.out.print("Enter empoyee name : ");
                    employeesArr[count].employeeName = scan.next();
                    System.out.print("Enter empoyee age : ");
                    employeesArr[count].employeeAge = scan.nextInt();
                    System.out.print("Enter empoyee address : ");
                    employeesArr[count].employeeAddress = scan.next();
                    System.out.print("Enter empoyee salary : ");
                    employeesArr[count].employeeSalary = scan.nextDouble();
                    count++;
                    break;
                case 2:
                    int count1 = getCount(employeesArr);
                    System.out.println("Count of employee that has salary more than 75000 is " +count1);
                    break;
                case 3:
                    String maxSalaryEmployee = checkMax(employeesArr);
                    System.out.println("Max salaried person is : " +maxSalaryEmployee);
                    break;
                case 4:
                    System.out.print("Enter finder employee NIC : ");
                    String finderNIC = scan.next();
                    Employee employee = findEmployee(employeesArr,finderNIC);
                    System.out.println("Employee Name : " +employee.employeeName);
                    System.out.println("Employee age : " +employee.employeeAge);
                    System.out.println("Employee address : " +employee.employeeAddress);
                    System.out.println("Employee salary : " +employee.employeeSalary);
                    break;
                case 5:
                    System.out.print("Enter increment precentage (%) : ");
                    int precentage = scan.nextInt();
                    employeesArr = incrementSalery(employeesArr,precentage);
                    for(Employee employee1:employeesArr){
                        System.out.println(employee1.employeeName +" " +employee1.employeeSalary);
                    }
                case 6:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Enter valid Number");
            }
            if(choice==6){
                break;
            }
        }

    }

    public static int getCount(Employee[] employeeArrr){
        int count=0;
        for(Employee employee: employeeArrr){
            if(employee != null && employee.employeeSalary > 75000.00){
                count++;
            }
        }
        return count;
    }

    public static String checkMax(Employee[] employeesArrr){
        double maxSalery = 0;
        String maxSalaryEmployee = "";
        for(Employee employee:employeesArrr){
            if(employee != null && employee.employeeSalary > maxSalery){
                maxSalery = employee.employeeSalary;
                maxSalaryEmployee = employee.employeeName;
            }
        }
        return maxSalaryEmployee;
    }

    public static Employee findEmployee(Employee[] employeesArrr, String finderNIC){
        Employee foundEmployee = employeesArrr[0];
        for(int i=0; i< employeesArrr.length;i++){
            Employee employee = employeesArrr[i];
            if(employee != null && (employee.nic).equals(finderNIC)){
                foundEmployee = employeesArrr[i];
            }
        }
        return foundEmployee;
    }

    public static Employee[] incrementSalery(Employee[] employeesArrr, int precentage){
        for(int i=0; i< employeesArrr.length;i++){
            Employee employee = employeesArrr[i];
            if(employee != null) {
                employee.employeeSalary += (employee.employeeSalary * precentage) / 100;
                employeesArrr[i].employeeSalary = employee.employeeSalary;
            }
        }
        return employeesArrr;
    }
}
