/* İki sayının en büyüğünü ve üç sayının en büyüğünü
bulan metotları overloading yapacak şekilde Java kodunu
yazınız.*/

import java.util.Scanner;

public class ornek_2 {
	public static int en_buyuk(int sayi1, int sayi2, int sayi3) {
		if(sayi1 > sayi2 && sayi1>sayi3) {
			return sayi1;
		}
		else if(sayi2>sayi1 && sayi2>sayi3){
			return sayi2;
		}
		else {
			return sayi3;
		}
	}
	public static int en_buyuk(int sayi1, int sayi2) {
		if(sayi1>sayi2) {
			return sayi1;
		}
		else {
			return sayi2;
		}
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int buyuk;
		System.out.printf("Kaç sayi giriceksiniz (2 ya da 3");
		int sayac = input.nextInt();
		if (sayac == 2) {
			System.out.printf("1. sayiyi giriniz: ");
			int sayi1 = input.nextInt();
			
			System.out.printf("2. sayiyi giriniz: ");
			int sayi2 = input.nextInt();
			buyuk = en_buyuk(sayi1,sayi2);
		}
		else if(sayac == 3) {
			System.out.printf("1. sayiyi giriniz: ");
			int sayi1 = input.nextInt();
			
			System.out.printf("2. sayiyi giriniz: ");
			int sayi2 = input.nextInt();
			
			System.out.printf("3. sayiyi giriniz: ");
			int sayi3 = input.nextInt();
			
			buyuk = en_buyuk(sayi1,sayi2,sayi3);
		}
		else {
			System.out.printf("2 ya da 3 sayı girebilirsiniz.");
			buyuk = 0;
		}
		System.out.printf("en buyuk sayi : %d", buyuk);
	}
}
