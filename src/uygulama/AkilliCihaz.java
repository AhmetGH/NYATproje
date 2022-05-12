package uygulama;

import java.util.Scanner;

public class AkilliCihaz {
	
	private IAgArayuzu agArayuzu;
	
	private static final int SOGUTUCU_AC=1;
    private static final int SOGUTUCU_KAPAT=2;
    private static final int SICAKLIK_OLC=3;
    private static final int CIK=4;
    private Scanner scan;
	
	 public AkilliCihaz(){
	        agArayuzu=new AgArayuzu();
	    }
	 
	public void dogrula() throws InterruptedException {
		
		scan =new Scanner(System.in);
		dogrulama dogrula =new dogrulama();
		
		String kullaniciadi,sifre;
		
		System.out.print("Kullanıcı Adınızı Giriniz: ");
		kullaniciadi =scan.nextLine();
		
		
		if(dogrula.kullanici_dogrula(kullaniciadi)) {
			System.out.print("Şifrenizi Giriniz: ");
		 	sifre = scan.nextLine();
	     
	     	if(dogrula.girisYap(sifre)) {
	    	 	this.menu();
	    	 	this.islemSec();
	     	}
		}
		
	}
	private void islemSec() throws InterruptedException {
		int sec;
		do {
			sec=Integer.parseInt(scan.nextLine());
            switch (sec){
                case SOGUTUCU_AC:
                        agArayuzu.istekGonder(SOGUTUCU_AC);
                    break;
                case SOGUTUCU_KAPAT:
                        agArayuzu.istekGonder(SOGUTUCU_KAPAT);
                    break;
                case SICAKLIK_OLC:
                        agArayuzu.sicaklikOku();
                    break;
                case CIK:
                	agArayuzu.mesajGoruntule("Çıkış yapılıyor...");
                	Thread.sleep(1000);
                	agArayuzu.mesajGoruntule("Çıkış yapildi.");
                    break;
                default:
                	agArayuzu.mesajGoruntule("[1-4] arasında değer girmelisiniz..");
                    break;
            }
	        if(sec!=4) {this.menu();}
        }while(sec!=4);
	}
	
	private void menu(){

        agArayuzu.mesajGoruntule("---------------------");
        agArayuzu.mesajGoruntule("1-Soğutucuyu Aç");
        agArayuzu.mesajGoruntule("2-Soğutucuyu Kapat");
        agArayuzu.mesajGoruntule("3-Sıcaklığı Oku");
        agArayuzu.mesajGoruntule("4-Çıkış");
        agArayuzu.mesajGoruntule("---------------------");

    }
}
