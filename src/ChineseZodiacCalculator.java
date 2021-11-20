import java.util.Scanner;

public class ChineseZodiacCalculator {

	public static void main(String[] args) {
		int birthYear;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen Doðum Yýlýnýzý Giriniz : ");
		birthYear = input.nextInt();
		
		double chineseZodiac = birthYear/12;
		int remaining = birthYear % 12;
		if(remaining==0) {
			System.out.println("Çin Zodyaðýnýz : Maymun");
		}else if(remaining==1) {
			System.out.println("Çin Zodyaðýnýz : Horoz");
		}else if(remaining==2) {
			System.out.println("Çin Zodyaðýnýz : Köpek");
		}else if(remaining==3) {
			System.out.println("Çin Zodyaðýnýz : Domuz");
		}else if(remaining ==4) {
			System.out.println("Çin Zodyaðýnýz : Fare");
		}else if(remaining==5) {
			System.out.println("Çin Zodyaðýnýz : Öküz");
		}else if(remaining==6) {
			System.out.println("Çin Zodyaðýnýz : Kaplan");
		}else if(remaining==7) {
			System.out.println("Çin Zodyaðýnýz : Tavþan");
		}else if(remaining==8) {
			System.out.println("Çin Zodyaðýnýz : Ejderha");
		}else if(remaining==9) {
			System.out.println("Çin Zodyaðýnýz : Yýlan");
		}else if(remaining==10) {
			System.out.println("Çin Zodyaðýnýz : At");
		}else if(remaining==11) {
			System.out.println("Çin Zodyaðýnýz : Koyun");
		}
		
	}

}