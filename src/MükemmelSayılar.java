import java.util.Scanner;

public class MükemmelSayýlar {

	public static void main(String[] args) {
		int number;
		int total = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a number : ");
		number = scan.nextInt();
		
		for(int i = 1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}

	}
		if(total==number) {
			System.out.println(number+" Mükemmel sayýdýr");
		}else {
			System.out.println(number+"mükemmel sayý deðildir");
		}
	}

}
