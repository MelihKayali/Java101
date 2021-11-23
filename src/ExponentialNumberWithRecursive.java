import java.util.Scanner;

public class ExponentialNumberWithRecursive {
	
	static boolean isPrime(int n, int temp) {
        if(temp == 1) {
            return true;
        }
        if(n % temp == 0 && n != temp) {
            return false;
        }
        return isPrime(n, temp - 1);
    }
		

	
	public static void main(String[] args) {
		int n;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bir Sayý Giriniz : ");
		n = scan.nextInt();
		
		System.out.println(n + " sayýsý ASAL" + (isPrime(n, n) ? "DIR" : " deðildir") + " !");
		
	}

}
