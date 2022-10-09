package week1;

public class SwitchDemo {

	public static void main(String[] args) {

		
		//burada char karakterini sen belirledin! (char grade = 'A';)
		
		char grade = 'B';
		
		switch (grade) {
			case 'A':
				System.out.println("Mükemmel : Geçtiniz");
				break;
			case 'B':
				System.out.println("Çok Ýyi : Geçtiniz");
				break;	
			case 'C':
				System.out.println("Ýyi : Geçtiniz");
				break;	
			case 'D':
				System.out.println("Orta : Geçtiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kaldýnýz");
				break;	
				default:
					System.out.println("Geçersiz not girdiniz.");
		}
		

		
		
		
		
		
		
		
		
	}

}
