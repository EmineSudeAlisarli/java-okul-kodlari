import java.util.Scanner;

public class ornek_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayi giriniz: ");
		int sayi = input.nextInt();
		
		for (int i = 1; i<= sayi; i++) {
			if ((sayi % i) == 0) {
				System.out.printf("%d ",i);
			}
			else {
				continue;
			}
		}

	}

}
