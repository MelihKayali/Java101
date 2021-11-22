import java.util.Scanner;

public class AdvancedCalculator {
	
	static int sum(int a,int b) {
		int result = a+b;
		System.out.println("Sonu� : " + result); 	
		return result;
	}
	
	static int minus(int a, int b) {
		int result = a-b;
		System.out.println("Sonu� : "+ result);
		return result;
	}
	
	static int times(int a , int b) {
		int result = a*b;
		System.out.println("Sonu� : "+ result);
		return result;
	}
	
	static int divided(int a , int b) {
		int result = a/b;
		if(b==0) {
			System.out.println("0 dan farkl� bir say� giriniz");
			return 0;
		}
		System.out.println("Sonu� : " + result);
		return result ;
	}
	
	static int power(int a , int b) {
		int total=1;
			for(int i=1;i<=b;i++) {
				total *= a;
		}
			System.out.println("Sonu� : "+total);
		return total;
	}
	
	static int factorial(int a , int b) {
		int result = 1;
		for(int i =1;i<=a;i++) {
			result *= i;
		}
		System.out.println("Sonu� : " + result);
		return result;
	}
	
	static int mod(int a , int b) {
		int result = a%b;
		System.out.println("Sonu� : " + result);
		return result;
	}
	
	static void rectangle(int a ,int b) {
		//alan = a*b
		//�evre = 2*(a+b)
		System.out.println("Alan� : " + a*b);
		System.out.println("�evresi : " + 2*(a+b));
	
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int select;
		
        String menu = "1- Toplama ��lemi\n"
                + "2- ��karma ��lemi\n"
                + "3- �arpma ��lemi\n"
                + "4- B�lme i�lemi\n"
                + "5- �sl� Say� Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikd�rtgen Alan ve �evre Hesab�\n"
                + "0- ��k�� Yap";
        
        while(true) {
        	System.out.println(menu);
        	System.out.print("Bir i�lem se�iniz : ");
        	
        	select=scan.nextInt();
        	if(select==0) {
        		break;
        	}
        	System.out.println("�lk De�eri Giriniz : ");
        	int a = scan.nextInt();
        	System.out.println("�kinci De�eri Giriniz : ");
        	int b = scan.nextInt();
        	switch(select) {
        	case 1:
        		sum(a,b);
        		break;
        	case 2:
        		minus(a,b);
        		break;
        	case 3:
        		times(a, b);
        		break;
        	case 4 :
        		divided(a, b);
        		break;
        	case 5 :
        		power(a, b);
        		break;
        	case 6 : 
        		factorial(a,b);
        		break;
        	case 7 :
        		mod(a, b);
        		break;
        	case 8 :
        		rectangle(a, b);
        		break;
        	}
        }
        	
        

	}

}
