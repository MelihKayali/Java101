import java.util.Scanner;

public class ChineseZodiacCalculator {

	public static void main(String[] args) {
		int birthYear;
		
		Scanner input = new Scanner(System.in);
		System.out.print("L�tfen Do�um Y�l�n�z� Giriniz : ");
		birthYear = input.nextInt();
		
		double chineseZodiac = birthYear/12;
		int remaining = birthYear % 12;
		if(remaining==0) {
			System.out.println("�in Zodya��n�z : Maymun");
		}else if(remaining==1) {
			System.out.println("�in Zodya��n�z : Horoz");
		}else if(remaining==2) {
			System.out.println("�in Zodya��n�z : K�pek");
		}else if(remaining==3) {
			System.out.println("�in Zodya��n�z : Domuz");
		}else if(remaining ==4) {
			System.out.println("�in Zodya��n�z : Fare");
		}else if(remaining==5) {
			System.out.println("�in Zodya��n�z : �k�z");
		}else if(remaining==6) {
			System.out.println("�in Zodya��n�z : Kaplan");
		}else if(remaining==7) {
			System.out.println("�in Zodya��n�z : Tav�an");
		}else if(remaining==8) {
			System.out.println("�in Zodya��n�z : Ejderha");
		}else if(remaining==9) {
			System.out.println("�in Zodya��n�z : Y�lan");
		}else if(remaining==10) {
			System.out.println("�in Zodya��n�z : At");
		}else if(remaining==11) {
			System.out.println("�in Zodya��n�z : Koyun");
		}
		
	}

}