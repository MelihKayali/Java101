import java.util.Scanner;

public class MethodRecursive {
	
	static int c�karma(int k,int n) {
		System.out.print(k+" ");
		
		if(k==0 || k<0) {
			return toplama(k+5, n)+k;
		}
		return c�karma(k-5,n)+k;
	}
	
	static int toplama(int k ,int n) {
		System.out.print(k+" ");
		
		if(k==n) {
			return k;
		}
		return toplama(k+5, n)+k;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		System.out.print("N Say�s� : ");
		n=scan.nextInt();
		
		System.out.print("��kt�s� : ");
		c�karma(n,n);


		
	}

}
