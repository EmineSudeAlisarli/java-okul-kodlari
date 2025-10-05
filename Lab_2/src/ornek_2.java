import java.util.Scanner;

public class ornek_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Adınızı giriniz: ");
		String ad = input.next();
		System.out.print("Soyadınızı giriniz: ");
		String soyad = input.next();
		System.out.print("Yasınızı giriniz: ");
		int yas = input.nextInt();
		System.out.print("Boyunuzu giriniz: ");
		int boy = input.nextInt();
		System.out.printf("Ad: %s \nSoyad:%s \nYas:%d \nBoy: %d", ad, soyad, yas, boy);
		
	}
}
