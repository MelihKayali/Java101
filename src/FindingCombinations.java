import java.util.Scanner;
public class FindingCombinations {

	public static void main(String[] args) {
		//C(n,r) = n! / (r! * (n-r)!)
		int n;
		int r;
		int total=1;
		int total2=1;
		int total3 =1;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a first number : ");
		n = scan.nextInt();
		
		System.out.print("Enter a second number : ");
		r= scan.nextInt();
		
		
		
		for(int i = 1;i<=n;i++) {
		total =total* n; 
		}
		
		for(int k =1;k<=r;k++) {
			total2 =total2*r;
		}
		
		int y=n-r;
		for(int l=1;l<=y;l++) {
			total3 =total3*y;
		}
		
		int z = n/(r*y);
		System.out.println(z);
	}

}
