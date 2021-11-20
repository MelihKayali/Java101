import java.util.Scanner;
public class ATMPProject {

	public static void main(String[] args) {
		String userName,password;
		int right = 3;
		int balance =1500;
		int select;
		int price;
		Scanner scan = new Scanner(System.in);
		
		while(right>0) {
			System.out.print("Please Write Your User Name : ");
			userName = scan.nextLine();
			System.out.print("Please Write Your Password :  ");
			password = scan.nextLine();
			
			if(userName.equals("Melo")&& password.equals("12345")) {
				System.out.print("Hello, welcome back to X Bank! ");
				do {
					System.out.println("Please select the action you want to do");
					System.out.println(
							"1)Deposit Money\n"+
							"2)Withdraw Money\n"+
							"3)Balance Inquiry\n"+
							"4)Exit");
					select = scan.nextInt();
					switch(select) 
				    {
					 case 1:
						 System.out.println("Price : ");
							 price = scan.nextInt();
								balance +=price;
								break;
					 case 2:
						 System.out.println("Price : ");
							 price = scan.nextInt();
							if(price>balance) {
								System.out.println("Ýnsufficient Balance");
							}else {
								balance-=price;
							}
							break;
					 case 3:
						 System.out.println("Your Balace : " +balance);
						 break;
						
					}
				}while(select !=4);
				break;
						
			}else {
				--right;
				System.out.println("Wrong Username Or Password Please Try Again");
				if(right==0) {
					System.out.println("Your Account Has Been Blocked");
				}else {
					System.out.println("Your Remaining Rights : " + right);
				}
				
			}
		}

	}

}
