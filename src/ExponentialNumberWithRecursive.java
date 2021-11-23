import java.util.Scanner;

public class ExponentialNumberWithRecursive {

	 static int number(int num , int exp) {
		 if(exp==1) {
			 return num;
		 }
		 return num*number(num, exp-1);
	}
	
	public static void main(String[] args) {
		int a , b;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Taban deðeri giriniz : ");
		a=scan.nextInt();
		
		System.out.println("Üs deðerini giriniz");
		b=scan.nextInt();
		
		System.out.println("Sonuç : " + number(a, b));
		

	}

}
