
import java.util.Scanner; 
public class uygulama {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("1 ile 5 arası bir sayı giriniz:");
		int sayi = input.nextInt();
		
		for (int i = 0; i<= sayi; i++) {
			for(int j = 0; j<= sayi; j++) {
				if (i==j) {
					System.out.printf("Diagonal");
					
				}
				else if(i>j) {
					System.out.printf("Alt");
				
				}
				else {
					System.out.printf("Üst");
				}
			}
			System.out.println();
		}
		
	}
}
