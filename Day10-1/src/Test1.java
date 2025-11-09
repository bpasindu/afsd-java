import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vehicle[] vehicles = new Vehicle[10];

        while(true){
            System.out.println("1. Enter a car details");
            System.out.println("2. Enter a van details");
            System.out.println("3. Enter a bus details");
            System.out.println("4. Run horns");
            System.out.println("5. Exit");
            System.out.print("Enter what you want to do : ");
            int choice = scan.nextInt();
            int arrayNumber = 0;

            switch(choice){
                case 1:
                    Car car = new Car();
                    vehicles[arrayNumber] = car;
                    System.out.print("Enter brand of the car : ");
                    String brand = scan.next();
                    car.setBrand(brand);
                    System.out.print("Enter model of the car : ");
                    String model = scan.next();
                    car.setModel(model);
                    System.out.print("Enter color of the car : ");
                    String color = scan.next();
                    car.setColor(color);
                    System.out.print("Enter number of gear of the car : ");
                    int noOfgear = scan.nextInt();
                    car.setNoOfGears(noOfgear);
                    arrayNumber++;
                    break;
                case 2:
                    Van van = new Van();
                    vehicles[arrayNumber] = van;
                    System.out.print("Enter brand of the van : ");
                    brand = scan.next();
                    van.setBrand(brand);
                    System.out.print("Enter model of the van : ");
                    model = scan.next();
                    van.setModel(model);
                    System.out.print("Is van has power mirror : ");
                    boolean isHavePowerMirror = scan.nextBoolean();
                    van.setHavePowerMirror(isHavePowerMirror);
                    System.out.print("Enter price of the van : ");
                    double price = scan.nextInt();
                    van.setPrice(price);
                    arrayNumber++;
                    break;
                case 3:
                    Bus bus = new Bus();
                    vehicles[arrayNumber] = bus;
                    System.out.print("Enter brand of the bus : ");
                    brand = scan.next();
                    bus.setBrand(brand);
                    System.out.print("Enter model of the bus : ");
                    model = scan.next();
                    bus.setModel(model);
                    System.out.print("Is bus has sensor : ");
                    boolean isHaveSensor = scan.nextBoolean();
                    bus.setSensor(isHaveSensor);
                    System.out.print("Enter number of seats in the bus : ");
                    int noOfSeats = scan.nextInt();
                    bus.setNoOfSeats(noOfSeats);
                    arrayNumber++;
                    break;
                case 4:
                    for(Vehicle vehicle : vehicles){
                        vehicle.horning();
                    }
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Enter valid number!!!");
            }
        }
    }
}
