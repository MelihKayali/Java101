
import java.util.Scanner;
public class ExponentialNumber {

	public static void main(String[] args) {
	int n;
	int k;
	int total=1;
	Scanner scan = new Scanner(System.in);
	System.out.print("�ss� al�nacak say� : ");
	n= scan.nextInt();
	System.out.print("Taban Say� : ");
	k=scan.nextInt();
		
	for(int i=1;i<=k;i++) {
		total*=n;
	 }
	System.out.println("Cevap : " + total);
	}

}

