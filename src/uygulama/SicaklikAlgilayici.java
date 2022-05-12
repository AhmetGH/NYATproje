package uygulama;

import java.util.Random;

public class SicaklikAlgilayici {
	private int sicaklik;
	private ISubject publisher;
	private static SicaklikAlgilayici durum;
	
	private SicaklikAlgilayici(ISubject publisher){
		Random rand =new Random();
		sicaklik=rand.nextInt(60);
		this.publisher=publisher;
	}
	
	public static SicaklikAlgilayici getInstance(ISubject publisher){
        if(durum==null){
        	durum=new SicaklikAlgilayici(publisher);
        }
        return durum;
    }
	
	public int sicaklikolc(){
		return sicaklik;
	}
	
	public void aboneEkle(IObserver abone){
        publisher.attach(abone);
    }
	public void sicaklikOku(int sonraki_sicaklik){
		try {
			Thread.sleep(200);
			System.out.println("Sicaklik olculuyor ...");
			Thread.sleep(500);
			System.out.println("Sicaklik = "+ sonraki_sicaklik + " C");
			Thread.sleep(500);
			if(sonraki_sicaklik>50) {publisher.notify("Sıcaklık 50C derecenin üzerine çıktı !");}
			if(sonraki_sicaklik<-10) {publisher.notify("Sıcaklık -10C derecenin altına düştü !");}
	            
		}catch (InterruptedException e) {e.printStackTrace();}
	}
}
