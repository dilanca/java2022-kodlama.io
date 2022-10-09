package week1;

public class MiniProjeAsalSayý {

	public static void main(String[] args) {

		int number = 26;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if (number==1) {
			System.out.println("Sayý asal deðildir.");
		return; //çýktý verisyorsa gerisine bakmaz
		}

		if (number<1) {
			System.out.println("Geçersiz sayý");
		}
		
		
		for( int i=2; i<number; i++) {
			if (number % i ==0) {
				isPrime = false;
			}
		}
				
			if(isPrime) {
				System.out.println("Asal sayýdýr.");
			}else {
				
				System.out.println("Asal sayý deðildir.");
			}
	
			
			
		}

}
