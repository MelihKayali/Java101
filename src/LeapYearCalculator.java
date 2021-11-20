import java.util.Scanner;

public class LeapYearCalculator {

	public static void main(String[] args) {
		int year;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Yıl Giriniz : ");
		year = input.nextInt();
		double remaining = year%4;
		
		if(remaining>0) {
			System.out.println(year+ " artık yıl değildir");
		}else {
			System.out.println(year + " artık yıldır");
		}

	}

}
