
public class PalindromeNumber {
	static boolean isPalindrome(int number) {
		int temp = number , reverseNumber=0,lastNumber;
		
		while(temp !=0) {
			System.out.println("*******************");
			System.out.println("Number : " + temp);
			lastNumber = temp % 10;
			System.out.println("Last digit : " + lastNumber);
			reverseNumber= (reverseNumber*10) + lastNumber;
			System.out.println("New number : " + reverseNumber);
			temp/=10;
			System.out.println("New Temp " + temp);
		}
		
		
		return true;
	}
	public static void main(String[] args) {
		isPalindrome(2476);

	}

}
