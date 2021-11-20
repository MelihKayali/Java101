
import java.util.Scanner;
public class TaximeterProgram {

	public static void main(String[] args) {
		int openingValue = 10;
		double valuePerKM = 2.20;
		double KM;
		Scanner input = new Scanner(System.in);
		System.out.print("Lütfen kaç kilometre gideceðinizi söyleyin : ");
		KM = input.nextDouble();
		System.out.println("Gidilen KM : " + KM);
		System.out.println("Taksimetre açýlýþ fiyatý : " + openingValue + "TL");
		double totalValue = KM*valuePerKM+openingValue;
		if(totalValue<=20) {
			System.out.println("Ödeyeceðiniz Para : 20 TL" );
		}else {
			System.out.println("Ödeyeceðiniz para : " + totalValue);
		}
		
	}

}