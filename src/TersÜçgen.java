import java.util.Scanner;

public class TersÜçgen {

	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen Basamak Sayýsýný Giriniz : ");
		n=scan.nextInt();
		
		
		for(int i =n;i>0;i--) 
		{
			for(int y=1;y<=(n-i);y++) {
				System.out.print(" ");
			}for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
	}

}
