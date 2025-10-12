/*Bir dizide, toplamları belirtilen sayıya eşit olan tüm eleman çiftlerini bulan
Java programını yazınız.*/
public class alistirma_6 {
	public static void main(String[] args) {
		int[] dizi = {0,1,2,3,4,5,6,7,8,9};
		int hedef = 10;
		for (int i = 0; i<dizi.length-1;i++) {
			for(int j = 0; j<dizi.length-1;j++) {
				if(dizi[i]+dizi[j] == hedef) {
					System.out.println("("+dizi[i]+","+dizi[j]+")");
				}
			}
		}
	}
}
