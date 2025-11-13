package SmartPhone;

public class SmartPhone {
	String Marka;
	String Model;
	String Renk;
	int Hafiza;
	double Hiz;
	
	public SmartPhone(String Marka, String Model, String Renk, int Hafiza, double Hiz){
		this.Marka = Marka;
		this.Model = Model;
		this.Renk = Renk;
		this.Hafiza = Hafiza;
		this.Hiz = Hiz;
	}
	
	public void bilgileriYazdir(){
		System.out.println("Marka:"+Marka);
		System.out.println("Model:"+Model);
		System.out.println("Renk:"+Renk);
		System.out.println("Hafiza:"+Hafiza);
		System.out.println("Hiz:"+Hiz);
		
	}
	public void hafizaDegerlendir() {
		if(Hafiza<256) {
			System.out.println("\nHafiza yeterli degildir.");
		}
		else {
			System.out.println("\nHafiza yeterlidir.");
		}
	}
}
