
import java.util.Scanner;

public class ClassPassStatus {

	public static void main(String[] args) {
		int Matematik, Fizik, Kimya, T�rk�e, M�zik;
		String message = " notunuzu giriniz : ";

		Scanner input = new Scanner(System.in);

		System.out.print("Matematik" + message);
		Matematik = input.nextInt();

		System.out.print("Fizik" + message);
		Fizik = input.nextInt();

		System.out.print("Kimya" + message);
		Kimya = input.nextInt();

		System.out.print("T�rk�e" + message);
		T�rk�e = input.nextInt();

		System.out.print("M�zik" + message);
		M�zik = input.nextInt();

		
		int newValues = (Matematik + Fizik + Kimya + T�rk�e  + M�zik);
		if(newValues<=600 && newValues>=0) {
		int total = (Matematik + Fizik + Kimya + T�rk�e  + M�zik);
		Double average = (double) (total / 6);
		System.out.println("Not ortalaman�z : " + average);
		}
		
		int total;
		Double average;
		if (Matematik>100) {
			total = (Fizik + Kimya + T�rk�e +  M�zik);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(Matematik<0) {
			total = (Fizik + Kimya + T�rk�e  + M�zik);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(Fizik>100) {
			total = (Matematik+Kimya+M�zik +T�rk�e);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(Fizik<0) {
			total = (Matematik+Kimya+M�zik +T�rk�e);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(Kimya>100) {
			total = (Matematik+Fizik+M�zik+T�rk�e);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(Kimya<0) {
			total = (Matematik+Fizik+M�zik+T�rk�e);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(T�rk�e>100) {
			total = (Matematik+Fizik+Kimya+M�zik);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(T�rk�e<0) {
			total = (Matematik+Fizik+Kimya+M�zik);
			average = (double) (total / 5);
			System.out.println("Not ortalaman�z : " + average);
		}else if(M�zik>100) {
			total = (Matematik+Fizik+Kimya+T�rk�e);
		 average = (double) (total / 5);
		 System.out.println("Not ortalaman�z : " + average);
		} 	
				
		
		if (newValues >= 55) {
			System.out.println("S�n�f� ge�tiniz");
		} else {
			System.out.println("S�n�fta Kald�n�z");
		}

	}

}