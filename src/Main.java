import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please write a number : ");
		n= scan.nextInt();
		double result = 0.0;
		
		int i=1;
		do {
			result +=(1.0/i);
			i++;
		}while(i<=n);
		
		System.out.println("Harmonic number is : "+result);
	
	}

}
