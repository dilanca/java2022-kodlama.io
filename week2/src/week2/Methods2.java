package week2;

public class Methods2 {

	/*
	  public static void main(String[] args) {
	  
	  String yeniMesaj = sehirVer(); System.out.println(yeniMesaj); int sayi =
	  topla(5,7); System.out.println(sayi);
	  
	  }
	  
	  public static int topla(int sayi1, int sayi2) { return sayi1 + sayi2;
	  
	  }
	  
	  
	  
	  public static String sehirVer() { return "Ankara"; }
	  
	  }
	 */

//----------------------------------

	public static void main(String[] args) {

		int toplam = topla2(2, 3, 6, 7, 10);
		System.out.println(toplam);

	}

	public static int topla2(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}

		return toplam;
	}

}
