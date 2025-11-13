
//23100011035 Emine Sude Alisarli
package uygulama;

public class ogrenci {
    private int ID;
    private String isimSoyisim;
    private double vizeNot;
    private double finalNot;
    private static int sayac = 100;
    
    public void setID() {
    	sayac ++;
    	this.ID = sayac;
    }
    public int getID() {
    	return this.ID;
    }
    public void setisimSoyisim(String isimSoyisim) {
    	this.isimSoyisim = isimSoyisim;
    }
    public String getisimSoyisim() {
    	return this.isimSoyisim;
    }
    public void setvizeNot(double vizeNot) {
    	this.vizeNot = vizeNot;
    }
    public double getvizeNot() {
    	return this.vizeNot;
    }
    public void setfinalNot(double fizeNot) {
    	this.finalNot = fizeNot;
    }
    public double getfinalNot() {
    	return this.finalNot;
    }
    
    public void BilgileriYazdir() {
        System.out.println("ID: " + ID);
        System.out.println("İsim Soyisim: " + isimSoyisim);
        System.out.println("Vize Notu: " + vizeNot);
        System.out.println("Final Notu: " + finalNot);
        System.out.println();
    }
    public double GecmeNotuHesapla(double vizeNot, double finalNot) {
    	double ortalama;
    	ortalama = (vizeNot * 0.4) + (finalNot * 0.6);
    	return ortalama;
    }

    public String HarfHesapla() {
        double gecmeNotu = 0;
        gecmeNotu = GecmeNotuHesapla(vizeNot,finalNot);

        if (gecmeNotu >= 90) {
        	return "AA";
        }
        else if (gecmeNotu >= 80) {
        	return "BA";
        }
        else if (gecmeNotu >= 70) {
        	return "BB";
        }
        else if (gecmeNotu >= 60) {
        	return "CB";
        }
        else if (gecmeNotu >= 50) {
        	return "CC";
        }
        else {
        	return "FF";
        }
    }
}
