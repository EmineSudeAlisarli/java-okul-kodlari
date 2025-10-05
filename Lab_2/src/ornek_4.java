import java.util.Scanner;

public class ornek_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. sayiyi giriniz: ");
		int sayi1 = input.nextInt();
		System.out.print("2. sayiyi giriniz: ");
		int sayi2 = input.nextInt();
		System.out.print("3. sayiyi giriniz: ");
		int sayi3 = input.nextInt();
		
		if(sayi1<sayi2 && sayi1<sayi3) {
			System.out.println(sayi1);
			if(sayi2<sayi3) {
				System.out.println(sayi2);
				System.out.println(sayi3);
			}
			else {
				System.out.println(sayi3);
				System.out.println(sayi2);
			}
		}
		else if(sayi2<sayi1 && sayi2<sayi3) {
			System.out.println(sayi2);
			if(sayi1<sayi3) {
				System.out.println(sayi1);
				System.out.println(sayi3);
			}
			else {
				System.out.println(sayi3);
				System.out.println(sayi1);
			}
		}
		else {
			System.out.println(sayi3);
			if(sayi1<sayi2) {
				System.out.println(sayi1);
				System.out.println(sayi2);
			}
			else {
				System.out.println(sayi2);
				System.out.println(sayi1);
			}
		}
	}
}
