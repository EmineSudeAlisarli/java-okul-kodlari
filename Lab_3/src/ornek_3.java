/*Bir hava durumu uygulamasında, 3 farklı şehir için
7 günlük sıcaklık verileri kaydedilmek istenmektedir. Her
şehir için haftalık ortalama sıcaklıkları metot ile hesaplayan
ve ekrana yazdıran bir Java programı yazınız.*/
import java.util.Scanner;
public class ornek_3 {
	public static void ortalama(double[][] sicaklik, String[] sehirler) {
		double ortalama;
		for (int i=0;i<=2;i++) {
			ortalama = 0;
			System.out.println();
			System.out.println(sehirler[i]+" icin 7 gunluk sıcaklık ortalamasi: ");
			for (int j=0;j<=6;j++) {
				ortalama += sicaklik[i][j];
			}
			System.out.println(ortalama/7);
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] sehirler = {"istanbul", "ankara", "izmir"};
		double[][] sicakliklar = new double[3][7];
		for (int i=0;i<3;i++) {
			System.out.println(sehirler[i]+" icin 7 gunluk sıcaklık degerlerini giriniz: ");
			for (int j=0;j<7;j++) {
				System.out.println((j+1)+ ". gunu giriniz: ");
				sicakliklar[i][j] = input.nextDouble();
			}
		}
		ortalama(sicakliklar, sehirler);

	}

}
