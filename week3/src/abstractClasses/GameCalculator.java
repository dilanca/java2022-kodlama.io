package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();		 //abstract yazdýðýn zaman herkes kendi hesaplamasýný
										 //kendi classýndan override eder.
										 // abstract sýnýflar main classta new'le çaðrýlamaz
	public void gameOver() {
		System.out.println("Oyun Bitti");
	}
}
