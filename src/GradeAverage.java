import java.util.Scanner;

public class GradeAverage {

	public static void main(String[] args) {
		int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;		
		String message = " notunuzu giriniz : ";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik" + message );
		Matematik = input.nextInt();
		
		System.out.print("Fizik" + message );
		Fizik = input.nextInt();
		
		System.out.print("Kimya" + message );
		Kimya = input.nextInt();
		
		System.out.print("Türkçe" + message );
		Türkçe = input.nextInt();
		
		System.out.print("Tarih" + message );
		Tarih = input.nextInt();
		
		System.out.print("Müzik" + message );
		Müzik = input.nextInt();
		
		int total = (Matematik + Fizik + Kimya + Türkçe + Tarih + Müzik);
		Double average = (double) (total / 6);
		
		System.out.println("Not ortalamanýz : " + average);
		
		if(average >=60) {
			System.out.println("Sýnýfý geçtiniz");
		}else {
			System.out.println("Sýnýfta Kaldýnýz");
		}
				
	}

}