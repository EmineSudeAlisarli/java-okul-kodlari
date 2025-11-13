/*SmartPhone
sınıfını tanımlayıp aşağıdaki
nesneleri sınıftan üretiniz.
Nesne1’i tanımlayarak Nesne2 ve
Nesne3’ün bilgilerini kullanıcıdan
alınız.*/
package SmartPhone;
import java.util.Scanner;
public class PhoneUser{

	public static void main(String[] args) {
		SmartPhone phone1 = new SmartPhone("Samsung","S23","Beyaz",128,2.0);
		Scanner input = new Scanner(System.in);
		phone1.bilgileriYazdir();
		phone1.hafizaDegerlendir();
		
		System.out.printf("Telefon markası giriniz:");
		String marka = input.next();
		System.out.printf("Telefon modeli giriniz:");
		String model = input.next();
		System.out.printf("Telefon rengi giriniz:");
		String renk = input.next();
		System.out.printf("Telefon hafızası giriniz:");
		int hafıza = input.nextInt();
		System.out.printf("Telefon hızı giriniz:");
		double hız = input.nextDouble();
		SmartPhone p2 = new SmartPhone(marka,model,renk,hafıza,hız);
		p2.bilgileriYazdir();
		p2.hafizaDegerlendir();

	}
}
