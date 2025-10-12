/*Yarıçapı kullanıcıdan alınan bir kürenin hacmini metot
kullanarak hesaplayan bir Java kodu yazınız.*/
import java.util.Scanner;
public class ornek_1 {
	public static double kure_hacmi(double yari_cap) {
		double pi = Math.PI;
		double hacim;
		
		hacim = (4 * pi * Math.pow(yari_cap,3))/3;
		System.out.println(pi);
		return hacim;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Hacmi hesaplancak kürenin capini giriniz: ");
		double yaricap = input.nextDouble();
		double hacim = kure_hacmi(yaricap);
		System.out.printf("Kurenin hacmi: %.2f", hacim);
	}

}
