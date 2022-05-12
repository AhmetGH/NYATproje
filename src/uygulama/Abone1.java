package uygulama;

public class Abone1 implements IObserver {
	public void update(String mesaj) {
		System.out.println("Abone1 bilgilendirme = "+ mesaj);
	}
}
