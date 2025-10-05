import java.util.Scanner;

public class alistirma_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("dereceyi giriniz:");
		double derece = input.nextDouble();
		double fahrenheite = (1.8*derece) + 32;
		System.out.println(derece+" Santigrat derece sıcaklık = "+ fahrenheite+" fahrenheite derece.");
	}
}