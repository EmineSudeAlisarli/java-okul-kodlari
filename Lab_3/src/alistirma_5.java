/*4x3’lük bir matrisin transpozunu bulan Java uygulamasının kodunu yazınız.*/
public class alistirma_5 {

	public static void main(String[] args) {
		int[][] dizi = {{1,2,3},{2,3,4},{3,4,5},{4,5,6}};
		 int[][] transpoz = new int[3][4];
		for (int i = 0; i<4;i++) {
			for(int j= 0; j<3;j++) {
				transpoz[j][i] = dizi[i][j];
			}
		}
		System.out.println("\nMatrisin Transpozu:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpoz[i][j] + "\t");
            }
            System.out.println();
        }

	}

}
