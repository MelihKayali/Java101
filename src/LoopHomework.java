import java.util.Scanner;
public class LoopHomework {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int k;
			
		System.out.print("Sayi Giriniz : ");
		int inputNumber= input.nextInt();
		
		int sum=0;
		int providedNumberCounter = 0;
		for(int i = 0;i<=inputNumber;i++) {
			if(i%3==0 && i%4==0) {
				sum+=i;
				providedNumberCounter++;
			}
		}
		var averageOfProvidedNumbers = sum/providedNumberCounter;
		System.out.println(averageOfProvidedNumbers);

	}

}
