//23100011035 Emine Sude Alisarli
package uygulama;

public class main {

	public static void main(String[] args) {
		ogrenci ogrenci1 = new ogrenci();
		ogrenci1.setisimSoyisim("emine Sude");
		ogrenci1.setID();
		ogrenci1.setvizeNot(95);
		ogrenci1.setfinalNot(100);
		
		ogrenci1.BilgileriYazdir();
		
		System.out.println("Ortalama:"+ogrenci1.GecmeNotuHesapla(95,100));
		System.out.println("Gecme notu:"+ogrenci1.HarfHesapla());
		System.out.println();
		
		ogrenci ogrenci2 = new ogrenci();
		ogrenci2.setisimSoyisim("rezzak");
		ogrenci2.setID();
		ogrenci2.setvizeNot(14);
		ogrenci2.setfinalNot(32);
		
		ogrenci2.BilgileriYazdir();
		
		System.out.println("Ortalama:"+ogrenci2.GecmeNotuHesapla(14,32));
		System.out.println("Gecme notu:"+ogrenci2.HarfHesapla());
		
	}

}
