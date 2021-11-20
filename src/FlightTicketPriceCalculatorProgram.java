import java.util.Scanner;

public class FlightTicketPriceCalculatorProgram {

	public static void main(String[] args) {
		double km;
		int age;
		String travelType;
		double constantValue = 0.10;
		String errorMessage = "Hatal� Veri Girdiniz !";

		Scanner input = new Scanner(System.in);

		System.out.print("Ka� Kilometre Yol Gideceksiniz ? ");
		km = input.nextDouble();

		System.out.print("L�tfen Ya��n�z� Giriniz : ");
		age = input.nextInt();

		System.out.print("L�tfen Yolculuk tipini giriniz ( Tek Y�n, Gidi� D�n�� ):");
		travelType = input.next();

		if (km < 0) {
			System.out.println(errorMessage);
		} else if (age < 0) {
			System.out.println(errorMessage);
		} else if(age<12) {
			Double totalPrice = km * constantValue/2;
			System.out.println("Toplam Fiyat : " + totalPrice);
		} else if(age>12 && age<24) {
			Double totalPrice = km * constantValue - (constantValue* 10/100);
			System.out.println("Toplam Fiyat : " + totalPrice);
		} else if(age>65) {
			Double totalPrice = km * constantValue - (constantValue * 30/100);
			System.out.println("Toplam Fiyat : " + totalPrice);
		} else if(travelType.equals("Gidi� D�n��")) {
			Double totalPrice = km * constantValue -(constantValue * 20/100);
			System.out.println("Toplam Fiyat : " + totalPrice);
		}
	}

}