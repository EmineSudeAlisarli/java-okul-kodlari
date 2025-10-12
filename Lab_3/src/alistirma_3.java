/*Boyutu kullanıcıdan alınan NxN boyutundaki bir matrisin köşegenlerinin
toplamını ayrı ayrı ekrana yazdıran Java programını yazınız.*/
import java.util.Scanner;
import java.util.Random;
public class alistirma_3 {
	public static void main(String[] args) {
		Random random = new Random();
		int random_sayi ;
		Scanner input = new Scanner(System.in);
		
		System.out.printf("kare boyutu giriniz: ");
		int sayi = input.nextInt();
		int kosegen_1 = 0;
		int kosegen_2 = 0;
		
		int[][] matris = new int[sayi][sayi];
		for(int a = 0; a<= sayi-1;a++) {
			for(int b = 0;b<=sayi-1;b++) {
				
				matris[a][b] = random.nextInt(10);//rastgele
			}
		}
		for(int a = 0; a<= sayi-1;a++) {
			for(int b = 0;b<=sayi-1;b++) {
				
				System.out.print(matris[a][b]);
			}
			System.out.println();
		}
		for(int i = 0; i <= sayi-1; i++) {
			for(int j = 0; j<= sayi-1;j++) {
				if(i == j) {
					kosegen_1 += matris[i][j];
				}
				if(i + j == sayi-1) {
					kosegen_2 += matris[i][j];
				}
			}
		}
		System.out.println("Birinci kosegen:"+kosegen_1+"\nikinci kosegen:"+kosegen_2);
	}
}
