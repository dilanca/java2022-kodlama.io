package week1;

public class RecapDemo1 {

	public static void main(String[] args) {

		/* BU BENİM DENEMEMDİ:
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;
		String message = " En büyük sayı:";
		
		if (number1 > number2 && number1 > number3) {
			System.out.println(message + number1);
		}
		else if (number2 > number1 && number2 > number3) {
			System.out.println(message + number2);
		}
		else  {
			System.out.println(message + number3);
		}
		*/
		
		
		int number1 = 20;
		int number2 = 25;
		int number3 = 2;
		int enBüyük = number1;
		
		if (enBüyük < number2) {
			enBüyük = number2;
		}
		if (enBüyük < number3) {
			enBüyük = number3;
		}
		System.out.println("En büyük : " + enBüyük);
		
		
		
		
		
		
		
		
		
		
		
	}

}
