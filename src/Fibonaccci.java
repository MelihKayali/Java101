import java.util.Scanner;

public class Fibonaccci {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("How many fibonacci numbers do you want to see?");
		int number = scan.nextInt();
		int num1=0;
		int num2=1;
		int num3=num1+num2;
		

		
		System.out.println("Fibonacci Numbers : ");
		System.out.print(num1 + " " + num2 + " ");
		
		while(number>0) {
			System.out.print(num3+" ");
			number--;
			num1=num2;
			num2=num3;
			num3=num1+num2;
		}
	}

}
