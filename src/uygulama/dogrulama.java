package uygulama;

public class dogrulama implements Idogrulama{
	
	private final Iveritabanibaglanti veritabani;
	
		public dogrulama() {
			veritabani = new veritabanibaglanti();
		}
		
		
	public boolean kullanici_dogrula(String kullaniciadi)throws InterruptedException {
        Thread.sleep(100);
        if (this.veritabani.kullaniciadi_dogrula(kullaniciadi)) 
        {
        	System.out.println("Kullanici adi dogrulandi.");
        	return true;
        } 
        else {
        	System.out.println("Kullaniciadi veritabaninda bulunamadi .");
        	return false;}
    }
	
	
	public boolean girisYap(String sifre) throws InterruptedException {
        Thread.sleep(1200);

        if(this.veritabani.sifre_dogrula(sifre)) {
        	return true;
        }else {return false;}
    } 
}
