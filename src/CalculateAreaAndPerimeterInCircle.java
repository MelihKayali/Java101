
import java.util.Scanner;

public class CalculateAreaAndPerimeterInCircle {

	public static void main(String[] args) {
		double pi = 3.14;
		int r;
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.print("�lk De�eri Giriniz : ");
		r = input.nextInt();
		System.out.print("Merkez A��s�n� Giriniz : ");
		a = input.nextInt();
		
		double circleArea = pi*r*r;
		System.out.println("Dairenin Alan� : " + circleArea);
		
		double circlePerimeter = 2*pi*r;
		System.out.println("Dairenin �evresi : " + circlePerimeter);
		
		double areaOfTheCircleSegment = (pi*(r*r)*a)/360;
		System.out.println("Daire Diliminin Alan� : " + areaOfTheCircleSegment);
	}

}