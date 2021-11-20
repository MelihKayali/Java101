import java.util.Scanner;

public class FlightTicketPriceCalculatorProgram {

	public static void main(String[] args) {
		double km;
		int age;
		String travelType;
		double constantValue = 0.10;
		String errorMessage = "Hatalý Veri Girdiniz !";

		Scanner input = new Scanner(System.in);

		System.out.print("Kaç Kilometre Yol Gideceksiniz ? ");
		km = input.nextDouble();

		System.out.print("Lütfen Yaþýnýzý Giriniz : ");
		age = input.nextInt();

		System.out.print("Lütfen Yolculuk tipini giriniz ( Tek Yön, Gidiþ Dönüþ ):");
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
		} else if(travelType.equals("Gidiþ Dönüþ")) {
			Double totalPrice = km * constantValue -(constantValue * 20/100);
			System.out.println("Toplam Fiyat : " + totalPrice);
		}
	}

}