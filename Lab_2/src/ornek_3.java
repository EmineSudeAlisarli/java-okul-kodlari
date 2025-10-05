import java.util.Scanner;

public class ornek_3 {
	public static void main(String[] args) {
		Scanner al = new Scanner(System.in);
	
		System.out.print("Vize notunuzu giriniz: ");
		double vize = al.nextDouble();
		
		System.out.print("Final notunuzu giriniz: ");
		double fnal = al.nextDouble();
		
		double g_notu = (vize+fnal)/2;
		
		String not;
		
		if (g_notu >= 90) {
			not = "AA";
		} else if(g_notu >= 85) {
			not = "BA";
		}else if(g_notu >= 75) {
			not = "BB";
		}else if(g_notu >= 70) {
			not = "CB";
		}else if(g_notu >= 60) {
			not = "CC";
		}else if(g_notu >= 55) {
			not = "DC";
		}else if(g_notu >= 50) {
			not = "DD";
		}else if(g_notu >= 40) {
			not = "FD";
		}else {
			not = "FF";
		}
		System.out.println("Ortalmanız: "+g_notu+"\nDers notunuz: "+not);
		
	}
}
