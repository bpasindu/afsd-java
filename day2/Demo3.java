//pluged scanner
import java.util.Scanner;

class Demo3{
	public static void main(String[] args){
		//setup scanner
		Scanner scan = new Scanner(System.in);
		
		//The usage
		System.out.print("enter number 1 : ");
		int  num1 = scan.nextInt();
		System.out.print("enter number 2 : ");
		int num2 = scan.nextInt();
		
		int answer = num1 + num2;
		System.out.println("Answer is " +answer);
		
		//////////////////
		
		}
	}
