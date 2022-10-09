package week1;

public class SayiBulma {

	public static void main(String[] args) {
			int[] numbers = new int[] {1,2,5,7,9,0};
			
			int aranacak = 5;
			
			boolean isThere = false;
			
			for(int number : numbers) {
				if(number == aranacak) {
					isThere = true;
					break;
				}
			}
			
			if(isThere) {
				System.out.println("Sayý mevcuttur");
			}else {
				System.out.println("Sayý mevcut deðildir");
			}
		}

	}

