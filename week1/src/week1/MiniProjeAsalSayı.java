package week1;

public class MiniProjeAsalSay� {

	public static void main(String[] args) {

		int number = 26;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if (number==1) {
			System.out.println("Say� asal de�ildir.");
		return; //��kt� verisyorsa gerisine bakmaz
		}

		if (number<1) {
			System.out.println("Ge�ersiz say�");
		}
		
		
		for( int i=2; i<number; i++) {
			if (number % i ==0) {
				isPrime = false;
			}
		}
				
			if(isPrime) {
				System.out.println("Asal say�d�r.");
			}else {
				
				System.out.println("Asal say� de�ildir.");
			}
	
			
			
		}

}
