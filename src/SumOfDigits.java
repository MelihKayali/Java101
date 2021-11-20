import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		int number;
		int a = 0;
		int total=0;
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Please write a number : ");
        
         number = reader.nextInt();
 
        while(number != 0)
        {
           total=(number%10)+total;
           number /= 10;
            ++a;
        }
 
        System.out.println("Digit total : " + total);
		
	}

}