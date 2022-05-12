package uygulama;

public class AgArayuzu implements IAgArayuzu{
	
	private static AgArayuzu instance;
	private eyleyici eyle;
	private SicaklikAlgilayici algila;
	private int sicaklik;
	
	public AgArayuzu() {
		eyle=new eyleyici();
		algila =SicaklikAlgilayici.getInstance(new Publisher());
		sicaklik = algila.sicaklikolc();
		algila.aboneEkle(new Abone1());
		algila.aboneEkle(new Abone2());
		algila.aboneEkle(new Abone3());
	}
	public static AgArayuzu getInstance(){
        if(instance==null){
            instance=new AgArayuzu();
        }
        return instance;
    }
	
	public void mesajGoruntule(String mesaj) {
		System.out.println(mesaj);
	}
	
	public void istekGonder(int istek) {
		if(istek==1) {sogutucuac();}
		if(istek==2) {sogutucukapat();}
	}
	
	private void sogutucuac() {
		sicaklik=eyle.sogutucuAc(sicaklik);
	}
	
	private void sogutucukapat() {
		eyle.sogutucuKapat();
	}
	public void sicaklikOku() {
		algila.sicaklikOku(sicaklik);
	}
	

}
