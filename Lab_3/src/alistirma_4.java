/*String elemanlardan oluşan iki dizi arasındaki ortak olan elemanları
ArrayList’e ekleyen Java programını yazınız. */
import java.util.ArrayList;
public class alistirma_4 {

	public static void main(String[] args) {
		ArrayList<String> liste = new ArrayList<>();
		String[] dizi_1 = {"elma","armut","portakal","kiraz","kavun"};
		String[] dizi_2 = {"vişne","armut","mango","kiraz","kavun"};
		
		for (String kelime: dizi_1) {
			for(String word: dizi_2) {
				if(kelime.equals(word)) {
					liste.add(kelime);
				}
			}
		}
		System.out.println(liste);
	}

}
