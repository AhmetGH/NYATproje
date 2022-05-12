package uygulama;

import java.sql.*;

public class veritabanibaglanti implements Iveritabanibaglanti{

	private Connection conn;
	
	private Connection baglan() {

	       Connection conn = null;

	       try {
	           conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/kullanicidogrulama",
	                   "postgres", "123456");
	           if (conn != null)
	               System.out.println("Veritabanına bağlandı!");
	           else
	               System.out.println("Bağlantı girişimi başarısız!");
	       } catch (Exception e) {
	           e.printStackTrace();
	       }
	       return conn;
	   }
	 
	 public boolean kullaniciadi_dogrula(String kullanici_adi) {
	 		
	 	try {
	 		boolean	giris;
	 		conn = this.baglan();
	        String sql = "SELECT *  FROM \"kullanicilar\" WHERE \"kullaniciadi\"='" + kullanici_adi + "'";
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);
	           
	        if(rs.next()) {
	        	giris=true;
	        }
		    else {
		        giris =false;
		    }
	        return giris;
	        } catch (Exception e) {
		        e.printStackTrace();
		        return false;
		    }
	 }
	 public boolean sifre_dogrula(String sifre) {
	       
	    try {
	    	boolean giris;
	        String sql = "SELECT *  FROM \"kullanicilar\" WHERE \"sifre\"='" + sifre + "'";
	        Thread.sleep(500);
	        Statement stmt = conn.createStatement();
		    ResultSet rs = stmt.executeQuery(sql);
	        if (!rs.next()) {//resultset
	        	System.out.println("Sifre Hatali");
	            giris = false;
	            conn.close();
	        } else {
	            System.out.println("Giriş başarılı...");
	            giris = true;
	           	conn.close();
	          }
	        rs.close();
	        stmt.close();
	        return giris;
	    } catch (Exception e) {
	           e.printStackTrace();
	           return false;
	       }
	   }
}

