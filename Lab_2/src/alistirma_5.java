import java.util.Scanner;
public class alistirma_5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Sinavda kac soru vardi?: ");
		double soru = input.nextInt();
		
		System.out.printf("Dogru yaptiginiz soru sayisi?: ");
		double dogru = input.nextInt();
		
		System.out.printf("Yanlis yaptıgınız soru sayisi?: ");
		double yanlis = input.nextInt();

		double bos = soru - (dogru + yanlis);
		double net = dogru - (yanlis/4);
		
		System.out.printf("\n\nSınavdaki soru sayisi: %.0f\n", soru);
		System.out.printf("Dogru sayisi: %.0f \nYanlis sayisi: %.0f \nBos sayisi: %.0f \n\nNetiniz: %.2f", dogru, yanlis, bos, net);
		
	}

}
