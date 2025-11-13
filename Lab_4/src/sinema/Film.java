package sinema;

public class Film {
	private int ID;
	private String film;
	private String yonetmen;
	private int sure;
	private double puan;
	
	private static int sayac = 0;
	public void setID() {
		sayac ++;
		this.ID = sayac;
	}
	public int getID() {
		return this.ID;
	}
	public void setfilm(String film) {
		this.film = film;
	}
	public String getfilm() {
		return this.film;
	}
	public void setyonetmen(String yonetmen) {
		this.yonetmen = yonetmen;
	}
	public String getyonetmen() {
		return this.yonetmen;
	}
	public void setsure(int sure) {
		this.sure = sure;
	}
	public int getsure() {
		return this.sure;
	}
	public void setpuan(double puan) {
		this.puan = puan;
	}
	public double getpuan() {
		return this.puan;
	}
	Film(String film, String yonetmen, int sure, double puan){
		this.film = film;
		this.yonetmen = yonetmen;
		this.sure = sure;
		this.puan = puan;
	}
	Film(String film, String yonetmen){
		this.film = film;
		this.yonetmen = yonetmen;
	}
	public void puanGuncelle(double puan) {
		
		if(puan<0.0 || puan>10.0) {
			System.out.println("Puanlama yanlistir.");
		}
		else {
			this.puan = puan;
		}
	}	
	public void filmBilgisi() {
		System.out.println(ID);
		System.out.println("Film adi: "+this.film);
		System.out.println("Yonetmen: "+this.yonetmen);
		System.out.println("Sure:"+this.sure);
		System.out.println("Puan:"+this.puan);
	}
}
