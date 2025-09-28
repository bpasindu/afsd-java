import java.util.scanner;

class Demo6{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = scan.next();
		
		System.out.print("Enter your salery : ");
		double salery = scan.nextDouble();
		
		system.out.print("Enter your other income : ");
		double other_income = scan.nextDouble();
		
		double total = salery + other_income;
		double average = total / 2;
		
		 
		}
	}
