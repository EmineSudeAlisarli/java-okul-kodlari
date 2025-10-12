/*Kullanıcıdan 10’luk tabanda alınan sayının 2’lik, 8’lik ve 16’lık tabandaki
karşılıklarını metot kullanarak ekrana yazdıran Java kodunu yazınız.*/
import java.util.Scanner;
public class alistirma_1 {
	
	//10'luk tabandaki sayiyi 2'lik tabanda yazdirma.
	public static void ikilik(int sayi) {
		int kalan[] = new int[35];
		int i = 0;
		while(sayi!=0) {
			kalan[i] = sayi % 2;
			sayi = sayi /2;
			i++;
		}
		for(int j = i-1; j>=0 ; j--) {
			System.out.print(kalan[j]);
		}
		System.out.println();
	}
	
	//10'luk tabandaki sayiyi 8'lik tabanda yazdirma
	public static void sekizlik(int sayi) {
		int kalan[] = new int[35];
		int i = 0;
		while(sayi!=0) {
			kalan[i] = sayi % 8;
			sayi = sayi /8;
			i++;
		}
		for(int j = i-1; j>=0 ; j--) {
			System.out.print(kalan[j]);
		}
		System.out.println();
	}
	//10'luk tabandaki sayiyi 16'lik tabanda yazdirma
	public static void onaltılık(int sayi) {
		char kalan[] = new char[35];
		int i = 0;
		while(sayi!=0) {
			int mod = sayi%16;
			if(mod < 10) {
				kalan[i] = (char)(mod+'0');
			}
			else if(mod == 10) {
				kalan[i]='A';
			}
			else if(mod == 11) {
				kalan[i]='B';
			}
			else if(mod == 12) {
				kalan[i]='C';
			}
			else if(mod == 13) {
				kalan[i]='D';
			}
			else if(mod == 14) {
				kalan[i]='E';
			}
			else if(mod == 15) {
				kalan[i]='F';
			}
			
			sayi = sayi /16;
			i++;
		}
		for(int j = i-1; j>=0 ; j--) {
			System.out.print(kalan[j]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("10'luk tabanda bir sayi giriniz: ");
		int sayi = input.nextInt();
		ikilik(sayi);
		sekizlik(sayi);
		onaltılık(sayi);
	}

}
