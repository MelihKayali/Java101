import java.util.Scanner;

public class MethodRecursive {
	
	static int cýkarma(int k,int n) {
		System.out.print(k+" ");
		
		if(k==0 || k<0) {
			return toplama(k+5, n)+k;
		}
		return cýkarma(k-5,n)+k;
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
		System.out.print("N Sayýsý : ");
		n=scan.nextInt();
		
		System.out.print("Çýktýsý : ");
		cýkarma(n,n);


		
	}

}
