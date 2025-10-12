/*Integer değerlerden oluşan bir diziyi tersine çeviren Java programını
yazınız.*/
public class alistirma_2 {

	public static void main(String[] args) {
		int[] dizi = {1, 5, 49, 62, 3};
		int swap;
		int j = dizi.length -1 ;
		System.out.println("Dizinin baslangic hali:");
		for (int i = 0; i< dizi.length; i++) {
			System.out.println(dizi[i]);
		}
		System.out.println();
		//swap islemi
		for (int i = 0; i< dizi.length; i++) {
			if(i == j) {
				break;
			}
			swap = dizi [i];
			dizi[i] = dizi[j];
			dizi[j] = swap;
			j--;
		}
		System.out.println("Dizinin ters hali:");
		for (int num:dizi) {
			System.out.println(num);
		}
	}
}
