import java.util.Scanner;
public class alistirma_3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. sayiyi giriniz:");
		int sayi_1 = input.nextInt();
		System.out.print("2. sayiyi giriniz:");
		int sayi_2 = input.nextInt();
		
		if(sayi_2 > sayi_1) {
			//Böylelikle sayi_1 her daim buyuk oldu.
			int temp = sayi_1;
			sayi_1 = sayi_2;
			sayi_2 = temp;
		}
		int toplam = sayi_1 + sayi_2;
		int fark = sayi_1 - sayi_2;
		double bolum = sayi_1/sayi_2;
		int carpim = sayi_1*sayi_2;
		int us_1 = 1;//sayi_1 taban
		int us_2 = 1;//sayi_2 taban
		
		int sayac = 0;
		while(sayac != sayi_2) {
			us_1 *= sayi_1;
			sayac ++;
		}
		
		sayac = 0;
		while(sayac != sayi_1) {
			us_2 *= sayi_2;
			sayac ++;
		}
		
		int mod_1 = sayi_1%sayi_2;
		int mod_2 = sayi_2%sayi_1;
		
		System.out.println(sayi_1+" > "+sayi_2);
		System.out.println("Toplamlari: "+toplam);
		System.out.println("Farklari: "+ fark);
		System.out.println("Bolumleri: "+ bolum);
		System.out.println("Carpimleri: "+carpim);
		System.out.println(sayi_1+"^"+sayi_2+" = "+us_1);
		System.out.println(sayi_2+"^"+sayi_1+" = "+us_2);
		System.out.println(sayi_1+" mod "+sayi_2+" = "+mod_1);
		System.out.println(sayi_2+" mod "+sayi_1+" = "+mod_2);
	}

}
