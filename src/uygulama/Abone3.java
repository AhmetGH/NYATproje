package uygulama;

public class Abone3 implements IObserver {
	public void update(String mesaj) {
		System.out.println("Abone3 bilgilendirme = "+ mesaj);
	}
}
