import java.util.Scanner;

class Demo4{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("User's current age : ");
		int age = scan.nextInt();
		age = age + 7;
		System.out.println("Your age after 7 years :" + age);
		
		/*decimal --> nextDouble();*/
		
		System.out.print("Enter your math,s marks : ");
		double mathsMark = scan.nextDouble();
		
		System.out.print("Enter your science mark : ");
		double scienceMark = scan.nextDouble();
		
		System.out.print("Enter your English mark : ");
		double englishMark = scan.nextDouble();
		
		double total = mathsMark + scienceMark + englishMark;
		double average = total / 3;
		
		System.out.println("Your total mark is : " + total);
		System.out.println("Your average mark is : " + average);
		
		
		}
	}
