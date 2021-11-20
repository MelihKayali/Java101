import java.util.Scanner;

public class SuggestingEventsBasedOnAirTemperature {

	public static void main(String[] args) {
		int heat;
		Scanner input = new Scanner(System.in);
		System.out.print("Hava Kaç Derece ? ");
		heat = input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak Yapabilirsin!");
		}else if(heat>5 && heat<15) {
			System.out.println("Sinemaya Gidebilirsin!");
		}else if(heat>15 && heat<25) {
			System.out.println("Piknik Yapabilirsin!");
		}else if(heat>25) {
			System.out.println("Denizde veya Havuzda yüzebilirsin!");
		}
		

	}

}