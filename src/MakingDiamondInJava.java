import java.util.Scanner;

public class MakingDiamondInJava {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter number of digits : ");
		int n = scan.nextInt();
		
		for(int i =1;i<=n;i++) 
		{
			for(int y=1;y<=(n-i);y++) {
				System.out.print(" ");
			}for(int k=1;k<=(2*i)-1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		
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