package week1;

public class ArraysDemo {

	public static void main(String[] args) {

		String[] ogrenciler = new String[3];
		ogrenciler[0] = "Engin";
		ogrenciler[1] = "Derin";
		ogrenciler[2] = "Ahmet";
		
		System.out.println("");
		
	/* bu ve alttaki d�ng� ayn�, alttaki daha �ok kullan�l�r.
	 
	  	for (int i =0; i<ogrenciler.length; i++ ) {
			System.out.println(ogrenciler[i]);
		}
	*/	
		
		
		for (String ogrenci : ogrenciler) {
			System.out.println(ogrenci);
		}
		
		
		
	}

}
