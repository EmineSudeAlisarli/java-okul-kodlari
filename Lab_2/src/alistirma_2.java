import java.util.Scanner;

public class alistirma_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("alani ve cevresi hesaplanacak dairenin yaricapını giriniz: ");
		double yaricap = input.nextDouble();
		
		double pi = Math.PI;
		double alan = pi*yaricap*yaricap;
		double cevre = 2*pi*yaricap;
		
		System.out.printf("Yaricapi %.2f olan dairenin, \nAlani: %.2f \nCevresi: %.2f" ,yaricap, alan, cevre);
	}
}
