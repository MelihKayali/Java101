import java.util.Scanner;
public class FindHypotenuseInTriangle {

	public static void main(String[] args) {
		int a;
		int b;
		double hypotenuse;
		String message = "deðeri giriniz : ";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ýlk " + message);
		a = input.nextInt();
		System.out.print("Ýkinci " + message);
		b = input.nextInt();
	
		int area = a*b/2;
		System.out.println("Üçgenin Alaný = "+area);
		
		hypotenuse = Math.sqrt(a*a + b*b);
		System.out.println("Üçgenin Hipotenüsü = "+hypotenuse);
		
		double circumference = a+b+hypotenuse;
		System.out.println("Üçgenin Çevresi = " + circumference);
		
	}

}