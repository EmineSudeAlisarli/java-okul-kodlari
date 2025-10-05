import java.util.Scanner;

public class alistirma_6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int basamak = 0;
		int yeni_sayi = 0;
		double üs;
		
		System.out.printf("bir sayi giriniz:");
		int sayi = input.nextInt();
		
		while (sayi != 0) {
			basamak = sayi%10;
			sayi -= basamak;
			sayi /= 10;
			yeni_sayi = yeni_sayi*10 +basamak;
		}
		System.out.printf("sayinin tersi = %d", yeni_sayi);
	}
}
