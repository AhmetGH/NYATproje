package uygulama;

public class Abone2 implements IObserver {
	public void update(String mesaj) {
		System.out.println("Abone2 bilgilendirme = "+ mesaj);
	}
}