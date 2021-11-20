import java.util.Scanner;

public class LoginSimulator {

	public static void main(String[] args) {
		String userName;
		String passWord;
		String question;

		Scanner input = new Scanner(System.in);

		System.out.print("Kullanýcý Adýnýz : ");
		userName = input.next();

		System.out.print("Þifreniz : ");
		passWord = input.next();

		if (userName.equals("Melih") && passWord.equals("test123")) {
			System.out.println("Giriþ Baþarýlý !!");
		} else {
			System.out.println("Giriþ Baþarýsýz");
			System.out.print("Þifreyi sýfýrlamak ister misiniz? ");
			question = input.next();

			switch (question) {
			case "evet":
				System.out.println("Girdiðiniz Ýlk Þifre Deðeri Hatalýdýr");
				System.out.print("Lütfen Yeni Þifrenizi Giriniz : ");
				passWord = input.next();
				if (passWord.equals("test123")) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz.");
				} else {
					System.out.println("Þifre Baþarýyla Kaydedildi : " + passWord);
				}

				break;
			}

		}

	}

}