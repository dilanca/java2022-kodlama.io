package week1;

public class StringsDemo {

	public static void main(String[] args) {

		String mesaj = "Bug�n hava �ok g�zel";
		System.out.println(mesaj);
		
		
		System.out.println("Eleman say�s�:" + mesaj.length());
									// eleman say�s�n� verir.
		
		System.out.println("5.eleman: " +mesaj.charAt(4));
									// se�ilen say�daki char� bulur.
		
		System.out.println(mesaj.concat(" Ya�as�n!"));
									// se�ilen yer ve yaz�lan� birle�tirir.
		
		System.out.println(mesaj.startsWith("A"));
									//hangi karakterle ba�lad���na boolean yan�t verir.
		
		System.out.println(mesaj.endsWith("."));
									//hangi karakterle bitti�ine boolean yan�t verir.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);		
		System.out.println(karakterler);
									//char array atamaya yarar.
		
		System.out.println(mesaj.indexOf('a'));
									//bu karakterin mesaj�n i�inde ka��nc� eleman oldu�unu bulmaya yarar.
		System.out.println(mesaj.indexOf("g�n"));
									//bu metnin mesaj�n i�inde " " " " " .	
		System.out.println(mesaj.lastIndexOf("a"));
		                            //ka��nc� eleman oldu�unu bulmaya sa�dan ba�lar.
	
	
        //---------------------------------------------------------
	
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
									//ilk karakter yerine ikinci karakteri verir
		System.out.println(mesaj.substring(2));
									// metnin i�inden bu karakterden sonras�n� al�r
		System.out.println(mesaj.substring(2, 5));
									// metnin i�inden bu karakterler aras�n� al�r
		
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
									//se�ilen yerlerden b�lerek dizi olarak verir
		
		System.out.println(mesaj.toLowerCase());
									//mesaj� k���k harfe �evirir
		System.out.println(mesaj.toUpperCase());
		 						    //mesaj� b�y�k harfe �evirir

		System.out.println(mesaj.trim());
									//ba��nda ve sonundaki bo�luklar� atar
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
