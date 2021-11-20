import java.util.Scanner;

public class VATCalculator {

	public static void main(String[] args) {
		int moneyValue ;
		Double VATValue = 1.18;
		Double VATValue2 = 0.8;
		String message = "Lütfen Para Miktarýný Giriniz : ";
		String VATMessage1 = "KDV'siz Para Miktarýnýz : ";
		String VATMessage2 = "KDV'li Para Miktarýnýz : ";
		String VATMessage3 = "KDV oraný : ";
		
		Scanner input = new Scanner(System.in);
		System.out.print(message);
		moneyValue = input.nextInt();
		
		if(moneyValue <= 1000 && moneyValue > 0) {
			double VATAmount = moneyValue * VATValue;
		System.out.println( VATMessage1 + moneyValue);
		System.out.println( VATMessage2 + VATAmount);
		System.out.println( VATMessage3 + VATValue);
		}else if(moneyValue > 1000) {
			double VATAomunt2 = moneyValue * VATValue2;
			System.out.println(VATMessage1 + moneyValue);
			System.out.println(VATMessage2 + VATAomunt2);
			System.out.println(VATMessage3 + VATValue2);
		}
					
	}

}