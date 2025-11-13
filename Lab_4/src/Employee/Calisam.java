package Employee;

public class Calisam {
	int ID;
	String isim_soyisim;
	int yas;
	int c_sayisi=0;
	double maas;
	
	private static int sayac = 100;
	
	public void setID() {
		sayac++;
		this.ID = sayac;
	}
	public int getID() {
		return this.ID;
	}
	public void setisim_soyisim(String isim_soyisim) {
		this.isim_soyisim = isim_soyisim;
	}
	public String getisim_soyisim() {
		return this.isim_soyisim;
	}
	public void setyas(int yas) {
		this.yas = yas;
	}
	public int getyas() {
		return this.yas;
	}
	public void setc_sayisi(int c_sayisi) {
		this.c_sayisi = c_sayisi;
	}
	public int getc_sayisi() {
		return this.c_sayisi;
	}
	public void setmaas(int maas) {
		this.maas = maas;
	}
	public double getmaas() {
		return this.maas;
	}
	
	
	Calisam(String isim_soyisim,int yas){
		this.isim_soyisim = isim_soyisim;
		this.yas = yas;		
	}
	Calisam(String isim_soyisim,int yas, int c_sayisi){
		this.isim_soyisim = isim_soyisim;
		this.yas = yas;
		this.c_sayisi = c_sayisi;
	}
	
	void BilgileriYazdir() {
		System.out.println("CalisanID:"+this.ID);
		System.out.println("Calisan adi:"+this.isim_soyisim);
		System.out.println("Calisan yas:"+this.yas);
		System.out.println("Calisan cocuk sayisi:"+this.c_sayisi);
		System.out.println("Calisan maas:"+this.maas);
	}
	void YeniMaasHesapla() {
		double yeni_maas = this.maas;
		int cocuk_sayisi = this.c_sayisi;
		int yas = this.yas;
		if(yeni_maas < 20000) {
			yeni_maas= yeni_maas+ yeni_maas*0.05;
		}
		else {
			if(cocuk_sayisi > 0) {
				yeni_maas = yeni_maas + cocuk_sayisi*0.015;
			}
			else {
				if(yas>40) {
					yeni_maas = yeni_maas + yeni_maas*0.035;
				}
				else {
					yeni_maas = yeni_maas + yeni_maas*0.025;
				}
			}
		}
		this.maas = yeni_maas;
		System.out.println("Yeni maas: "+yeni_maas);
	}

}
