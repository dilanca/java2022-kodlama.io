package week1;

public class StringsDemo {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		
		
		System.out.println("Eleman sayýsý:" + mesaj.length());
									// eleman sayýsýný verir.
		
		System.out.println("5.eleman: " +mesaj.charAt(4));
									// seçilen sayýdaki charý bulur.
		
		System.out.println(mesaj.concat(" Yaþasýn!"));
									// seçilen yer ve yazýlaný birleþtirir.
		
		System.out.println(mesaj.startsWith("A"));
									//hangi karakterle baþladýðýna boolean yanýt verir.
		
		System.out.println(mesaj.endsWith("."));
									//hangi karakterle bittiðine boolean yanýt verir.
		
		char[] karakterler = new char[5];
		mesaj.getChars(0,5,karakterler,0);		
		System.out.println(karakterler);
									//char array atamaya yarar.
		
		System.out.println(mesaj.indexOf('a'));
									//bu karakterin mesajýn içinde kaçýncý eleman olduðunu bulmaya yarar.
		System.out.println(mesaj.indexOf("gün"));
									//bu metnin mesajýn içinde " " " " " .	
		System.out.println(mesaj.lastIndexOf("a"));
		                            //kaçýncý eleman olduðunu bulmaya saðdan baþlar.
	
	
        //---------------------------------------------------------
	
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
									//ilk karakter yerine ikinci karakteri verir
		System.out.println(mesaj.substring(2));
									// metnin içinden bu karakterden sonrasýný alýr
		System.out.println(mesaj.substring(2, 5));
									// metnin içinden bu karakterler arasýný alýr
		
		
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
									//seçilen yerlerden bölerek dizi olarak verir
		
		System.out.println(mesaj.toLowerCase());
									//mesajý küçük harfe çevirir
		System.out.println(mesaj.toUpperCase());
		 						    //mesajý büyük harfe çevirir

		System.out.println(mesaj.trim());
									//baþýnda ve sonundaki boþluklarý atar
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
