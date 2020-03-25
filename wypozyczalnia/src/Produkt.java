import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Produkt {
	
	private int id;
	private String data_wydania;
	private String autor;
	private String wydawnictwo;
	private String tytul;
	private double cena;
	private int dlugosc_wypozyczenia;
	private Klient wPosiadaniu;
	private Date data_wypozyczenia;
	
	public Produkt(int id, String data_wydania,String autor,String wydawnictwo,String tytul, double cena) {
		this.id=id;
		this.data_wydania=data_wydania;
		this.autor=autor;
		this.wydawnictwo=wydawnictwo;
		this.tytul = tytul;
		this.cena=cena;		
	}
	
	public void wypozyczProdukt(Klient klient, int dlugosc_wypozyczenia){
		
		if(wPosiadaniu==null) { // sprawdzenie czy jest wypozyczone przez jakegos klienta
			if(klient.getKara()==0) {  //sprawdzenie czy klient nie ma kary
				if(!klient.getCzyWypozyczone()) { // sprawdzenie czy klient ma wypozyczony produkt
					if(dlugosc_wypozyczenia<=14) { // czy klient stara sie wypozyczyc produkt na wiecej niz 14 dni
						
						this.dlugosc_wypozyczenia=dlugosc_wypozyczenia;
						data_wypozyczenia = new Date(); // jak klient wypozycza to pobiera date z systemu i zapisuje
						wPosiadaniu = klient;
						klient.setCzyWypozyczone(this); // ustawia w obiekcie klient ze ma wypozyczony taki obiekt
						System.out.println("Wypozyczono Produkt: "+tytul);	
						
					}else {
						System.out.println("Nie mo�na wyporzyczyc na wiecej niz 2 tygodnie");
					}
				}
				else {
					System.out.println("Uzytkownik ma juz wypozyczony produkt !");
				}
			}
			else {
				System.out.println("Uzytkownik ma nieoplacona kare !");
			}	 
		}
		else {
			System.out.println("Produkt: "+tytul+" jest juz wypozyczona");
		}	
	}
	
	public void oddajProdukt() {
		if(wPosiadaniu!=null) { //  jeżeli produkt jest wypożyczony
			data_wypozyczenia=null;
			dlugosc_wypozyczenia=0;
			wPosiadaniu.setCzyWypozyczone(null); //zerowanie wypozyczenia u klienta
			wPosiadaniu=null;	// zerowanie wypozyczenia- produktu
			
			System.out.println("Oddano produkt: "+tytul);
		}else {
			System.out.println("Produkt: "+tytul+" nie jest wypozyczony");
		}
	}
	
	public void przedluz(int dni) {
		if(wPosiadaniu!=null) {
			int przedlozenie = dni * 86400000; // <-------tyle milisekund ma doba
			data_wypozyczenia.setTime(data_wypozyczenia.getTime()+przedlozenie);
		}
		else {
			System.out.println("Produkt: "+tytul+" nie jest wypozyczony");
		}
	}

	//GETTERS SETTERS
	public int getId() {
		return id;
	}
	public void setId(int id){ this.id=id;}
	
	public String getData_wydania() {
		return data_wydania;
	}
	public void setData_wydania(String data_wydania) {
		this.data_wydania=data_wydania;
	}

	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor=autor;
	}
	
	public String getWydawnictwo() {
		return wydawnictwo;
	}
	public void setWydawnictwo(String wydawnictwo) {
		this.wydawnictwo=wydawnictwo;
	}
	
	public String getTytul() {
		return tytul;
	}
	public void setTytul(String tytul) {
		this.tytul=tytul;
	}
	
	public double getCena() {
		return cena;
	}
	public void setCena(float cena) {
		this.cena=cena;
	}
	
	public Date getData_wypozyczenia() {
		return data_wypozyczenia;
	}
	public void setData_wypozyczenia(Date data_wypozyczenia){ this.data_wypozyczenia=data_wypozyczenia; }
	
	public int getDlugosc_wypozyczenia() {
		return dlugosc_wypozyczenia;
	}
	public void setDlugosc_wypozyczenia(int dlugosc_wypozyczenia) {
		this.dlugosc_wypozyczenia=dlugosc_wypozyczenia;
	}
}
