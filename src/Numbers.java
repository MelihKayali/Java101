import java.util.Scanner;
public class Numbers {
        public static void main(String[] args) {
                    Scanner input =new Scanner(System.in);
                    int number;
                    int min=0;
                    int max=0;
                    int total;
                System.out.print("Kaç adet sayý girilicek : ");
                total=input.nextInt();
                for (int i=1; i<=total;i++){
                        System.out.print(i+". Sayýyý giriniz: ");
                        number=input.nextInt();
                        if (i==1){
                                max=number;
                                min=number;
                        }
                        if (number>max){
                                max=number;
                        }
                        if(number<min){
                        min=number;
                        }
                }
                System.out.println("max : "+max);
                System.out.println("min : "+min);
        }
        }
