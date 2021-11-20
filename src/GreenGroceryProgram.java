import java.util.Scanner;

public class GreenGroceryProgram {

	public static void main(String[] args) {
		double Armut = 2.14;
		double Elma = 3.67;
		double Domates = 1.11;
		double Muz = 0.95;
		double Patlýcan = 5.00;
		double kgValue;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Armut Kaç Kilo ? ");
		kgValue = input.nextDouble();		
		double armutValue = (kgValue*Armut);
		
		System.out.print("Elma Kaç Kilo ? ");
		kgValue = input.nextDouble();
		double elmaValue = (kgValue*Elma);
		
		System.out.print("Domates Kaç Kilo ? ");
		kgValue = input.nextDouble();
		double domatesValue = (kgValue*Domates);
		
		System.out.print("Muz Kaç Kilo ? ");
		kgValue = input.nextDouble();
		double muzValue = (kgValue*Muz);
		
		System.out.print("Patlýcan Kaç Kilo ? ");
		kgValue = input.nextDouble();
		double patlýcanValue = (kgValue*Patlýcan);
		
		
		double totalValue = (elmaValue+armutValue+domatesValue+muzValue+patlýcanValue);
		System.out.println(totalValue);
		
	}

}