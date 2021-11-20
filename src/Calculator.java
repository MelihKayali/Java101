import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		int number1;
		int number2;
		String steps;

		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk sayýyý giriniz : ");
		number1 = input.nextInt();
		System.out.print("Ýkinci sayýyý giriniz : ");
		number2 = input.nextInt();

		System.out.print("Hangi iþlemi yapmak istersiniz? (toplama-çýkarma-bölme-çarpma)");
		steps = input.next();

		switch (steps) {

		case "toplama":
			System.out.println(number1 + number2);
			break;

		case "çýkarma":
			System.out.println(number1 - number2);
			break;

		case "bölme":
			System.out.println(number1 / number2);
			break;

		case "çarpma":
			System.out.println(number1 * number2);
			break;
		default :
			System.out.println("Geçersiz adým girdiniz");
		}

	}

}