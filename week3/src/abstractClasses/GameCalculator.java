package abstractClasses;

public abstract class GameCalculator {
	public abstract void hesapla();		 //abstract yazd���n zaman herkes kendi hesaplamas�n�
										 //kendi class�ndan override eder.
										 // abstract s�n�flar main classta new'le �a�r�lamaz
	public void gameOver() {
		System.out.println("Oyun Bitti");
	}
}
