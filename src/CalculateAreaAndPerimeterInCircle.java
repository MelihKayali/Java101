
import java.util.Scanner;

public class CalculateAreaAndPerimeterInCircle {

	public static void main(String[] args) {
		double pi = 3.14;
		int r;
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ýlk Deðeri Giriniz : ");
		r = input.nextInt();
		System.out.print("Merkez Açýsýný Giriniz : ");
		a = input.nextInt();
		
		double circleArea = pi*r*r;
		System.out.println("Dairenin Alaný : " + circleArea);
		
		double circlePerimeter = 2*pi*r;
		System.out.println("Dairenin Çevresi : " + circlePerimeter);
		
		double areaOfTheCircleSegment = (pi*(r*r)*a)/360;
		System.out.println("Daire Diliminin Alaný : " + areaOfTheCircleSegment);
	}

}