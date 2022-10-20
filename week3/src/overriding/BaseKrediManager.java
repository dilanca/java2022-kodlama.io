package overriding;

public class BaseKrediManager {

	public double hesapla(double tutar) {
		return tutar * 1.18;
		
		//"public  final double hesapla" olarak yazarsan overriding gerçekleşmez.
	}

}
