package uygulama;

public interface IAgArayuzu {
	public void mesajGoruntule(String mesaj);
	public void istekGonder(int emir) throws InterruptedException ;
	public void sicaklikOku() throws InterruptedException ;
	
}
