import java.util.Scanner;

public class BodyMassIndexCalculateProgram {

	public static void main(String[] args) {
		double size ;
		double kg;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		size = input.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		kg = input.nextDouble();
		
		double bodyMassIndex = kg / (size * size);
		System.out.println("Vücut Kitle Ýndeksiniz : " + bodyMassIndex);
	}

}