
import java.util.Scanner;

public class ClassPassStatus {

	public static void main(String[] args) {
		int Matematik, Fizik, Kimya, Türkçe, Müzik;
		String message = " notunuzu giriniz : ";

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik" + message);
		Matematik = input.nextInt();

		System.out.print("Fizik" + message);
		Fizik = input.nextInt();

		System.out.print("Kimya" + message);
		Kimya = input.nextInt();

		System.out.print("Türkçe" + message);
		Türkçe = input.nextInt();

		System.out.print("Müzik" + message);
		Müzik = input.nextInt();

		
		int newValues = (Matematik + Fizik + Kimya + Türkçe  + Müzik);
		if(newValues<=600 && newValues>=0) {
		int total = (Matematik + Fizik + Kimya + Türkçe  + Müzik);
		Double average = (double) (total / 6);
		System.out.println("Not ortalamanýz : " + average);
		}
		
		int total;
		Double average;
		if (Matematik>100) {
			total = (Fizik + Kimya + Türkçe +  Müzik);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Matematik<0) {
			total = (Fizik + Kimya + Türkçe  + Müzik);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Fizik>100) {
			total = (Matematik+Kimya+Müzik +Türkçe);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Fizik<0) {
			total = (Matematik+Kimya+Müzik +Türkçe);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Kimya>100) {
			total = (Matematik+Fizik+Müzik+Türkçe);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Kimya<0) {
			total = (Matematik+Fizik+Müzik+Türkçe);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Türkçe>100) {
			total = (Matematik+Fizik+Kimya+Müzik);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Türkçe<0) {
			total = (Matematik+Fizik+Kimya+Müzik);
			average = (double) (total / 5);
			System.out.println("Not ortalamanýz : " + average);
		}else if(Müzik>100) {
			total = (Matematik+Fizik+Kimya+Türkçe);
		 average = (double) (total / 5);
		 System.out.println("Not ortalamanýz : " + average);
		} 	
				
		
		if (newValues >= 55) {
			System.out.println("Sýnýfý geçtiniz");
		} else {
			System.out.println("Sýnýfta Kaldýnýz");
		}

	}

}