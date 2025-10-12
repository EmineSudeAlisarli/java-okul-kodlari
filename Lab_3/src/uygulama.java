
import java.util.Scanner;

public class uygulama {

    public static double ortalama(double[] notlar) {
        double ort = 0;
        for (int j = 0; j < 3; j++) {
            ort += notlar[j];
        }
        ort = ort / 3;
        return ort;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç öğrenci olacak: ");
        int sayi = input.nextInt();

        double[][] not = new double[sayi][3];
        double[] ort = new double[sayi];
        String[] ad = new String[sayi];

        for (int i = 0; i < sayi; i++) {
            System.out.print("Öğrenci adı: ");
            ad[i] = input.next();

            System.out.println(ad[i] + " isimli öğrencinin notları:");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d. sınav notu: ", (j + 1));
                not[i][j] = input.nextDouble();
            }

            ort[i] = ortalama(not[i]); 
        }

        System.out.println("\n--- Sonuçlar ---");
        for (int k = 0; k < sayi; k++) {
            System.out.printf("%s adlı öğrencinin ortalaması: %.2f -> ", ad[k], ort[k]);
            System.out.printf("notlari");
            for (int j = 0; j < 3; j++) {
                System.out.printf("%.2f ", not[k][j]);
            }
            if (ort[k] >= 50) {
                System.out.println("Geçti");}
            else {
                System.out.println("Kaldı");}
      
        }
    }
}