package week1;

public class LoopDemo {

	public static void main(String[] args) {

	//FOR
		for (int i = 1; i<=10 ; i++) {
			System.out.println(i);
		}
		System.out.println("For Döngüsü Bitti.");
		
	//WHÝLE
		int i=1;
		while (i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While Döngüsü Bitti.");
		
		//ikiþer arttýrmak istediðinde i+=2 yazabilirsin.

	//DO WHÝLE
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
		}while(j<10);
			System.out.println("Do While Döngüsü Bitti.");
		
		
		
	/* while döngüsünden farký þart uymasa döngü çalýþmasa bile
	çalýþýyor, yapýlmak isteneni yapýyor olmasýdýr 
	çünkü do while önce iþi yapýyor.
	*/	
		
	
		
	}

}
