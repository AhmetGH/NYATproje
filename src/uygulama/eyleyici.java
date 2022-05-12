package uygulama;

public class eyleyici {
	
	private int sogutucudurumu=1;

	public int	sogutucuAc(int sicaklik){
		try {
			Thread.sleep(200);
			System.out.println("Sogutucu Aciliyor...");
			Thread.sleep(500);
			System.out.println("Sogutucu Acildi.");
			Thread.sleep(500);
			sogutucudurumu=0;;
		} catch (InterruptedException e) {e.printStackTrace();}
		return sicaklik-5;
	}
	
	public void sogutucuKapat(){
		try {
			Thread.sleep(200);
			if(sogutucudurumu==0)
			{			 
				System.out.println("Sogutucu kapatiliyor...");
				Thread.sleep(500);
				System.out.println("Sogutucu kapatildi.");
				Thread.sleep(500);
			}
			else {
				System.out.println("Sogutucu zaten kapali !");
			}
		}catch (InterruptedException e) {e.printStackTrace();}
		sogutucudurumu=1;
	}
	
}
