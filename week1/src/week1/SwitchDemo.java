package week1;

public class SwitchDemo {

	public static void main(String[] args) {

		
		//burada char karakterini sen belirledin! (char grade = 'A';)
		
		char grade = 'B';
		
		switch (grade) {
			case 'A':
				System.out.println("M�kemmel : Ge�tiniz");
				break;
			case 'B':
				System.out.println("�ok �yi : Ge�tiniz");
				break;	
			case 'C':
				System.out.println("�yi : Ge�tiniz");
				break;	
			case 'D':
				System.out.println("Orta : Ge�tiniz");
				break;
			case 'F':
				System.out.println("Maalesef Kald�n�z");
				break;	
				default:
					System.out.println("Ge�ersiz not girdiniz.");
		}
		

		
		
		
		
		
		
		
		
	}

}
