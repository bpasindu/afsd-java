import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int choice = 0;
        Employee[] employeeArr = new Employee[13];
        int employeeIndex = 1;
        while(true){
            System.out.println("======================");
            System.out.println("1.Store a Manager");
            System.out.println("2.Store a Engineer");
            System.out.println("3.Store a Servent");
            System.out.println("4.Display duties");
            System.out.println("9.Exit");
            System.out.print("What type of employee do you want to create : ");
            choice = scan.nextInt();

            switch (choice){
                case 1:
                    Manager manager = new Manager(employeeIndex);
                    System.out.print("Enter manager name : ");
                    manager.setName(scan.next());
                    System.out.print("Enter manager age : ");
                    manager.setManagerAge(scan.nextInt());
                    System.out.print("Enter manager qualifications : ");
                    manager.setEduQualification(scan.next());
                    employeeArr[employeeIndex] = manager;
                    employeeIndex++;
                    break;
                case 2:
                    Engineer engineer = new Engineer(employeeIndex);
                    System.out.print("Enter engineer name : ");
                    engineer.setName(scan.next());
                    System.out.print("enter engineer salary : ");
                    engineer.setEngineerSalary(scan.nextDouble());
                    System.out.print("Enter engineer university : ");
                    engineer.setEngineerUniversity(scan.next());
                    employeeArr[employeeIndex] = engineer;
                    employeeIndex++;
                    break;
                case 3:
                    Servent servent = new Servent(employeeIndex);
                    System.out.print("Enter servent name : ");
                    servent.setName(scan.next());
                    System.out.print("Enter servent department : ");
                    servent.setServentDepartment(scan.next());
                    System.out.print("Enter servent address : ");
                    servent.setServentAddress(scan.next());
                    employeeArr[employeeIndex] = servent;
                    employeeIndex++;
                    break;
                case 4:
                    for(int i=0; i<employeeArr.length; i++){
                        Employee employee = employeeArr[i];
                        employee.duty();
                    }
                    break;
                case 9:
                    System.out.println("System going to close");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Enter valid choice and try!!!");
            }
        }
    }
}
