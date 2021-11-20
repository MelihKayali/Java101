
import java.util.Scanner;
public class ExponentialNumber {

	public static void main(String[] args) {
	int n;
	int k;
	int total=1;
	Scanner scan = new Scanner(System.in);
	System.out.print("Üssü alýnacak sayý : ");
	n= scan.nextInt();
	System.out.print("Taban Sayý : ");
	k=scan.nextInt();
		
	for(int i=1;i<=k;i++) {
		total*=n;
	 }
	System.out.println("Cevap : " + total);
	}

}

