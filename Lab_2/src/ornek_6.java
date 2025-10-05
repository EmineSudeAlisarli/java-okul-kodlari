import java.util.Scanner;

public class ornek_6 {
	public static void main(String[] args) {
		Scanner var = new Scanner(System.in);
		int basamak = 0;
		int sayac = 0;
		int basamak_t = 0;
		
		System.out.printf("Bir sayi giriniz:");
		int sayi = var.nextInt();
		while(sayi != 0) {
			basamak = sayi %10;
			sayi = sayi - basamak;
			sayi = sayi / 10;
			basamak_t = basamak_t + basamak;
			sayac ++;
		}
		System.out.printf("Basamak toplami %d, basamak sayisi: %d", basamak_t, sayac);
		
	}
}
