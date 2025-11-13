package sinema;

public class main {

	public static void main(String[] args) {
		Film f1 = new Film("Inception","Christopher Nolan");
		f1.setID();
		f1.puanGuncelle(5.4);
		f1.filmBilgisi();
		
		Film f2 = new Film("Inception","Christofrsgrher Nolan");
		f2.setID();
		f2.puanGuncelle(5.4);
		f2.filmBilgisi();
	}

}
