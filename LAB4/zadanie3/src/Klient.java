import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Klient {
	private int ID;
	private String imie;
	private String nazwisko;
	private String adres;
	private int wiek;	
	private Date DataDolaczenia;
	private double kara=0;
	private Produkt wypozyczone;
	
	public Klient(int ID,String imie,String nazwisko,String adres, int wiek){
		this.ID=ID;
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.adres=adres;
		this.wiek=wiek;
		
		DataDolaczenia= new Date();
	}
	
	public double getKara() {
		return kara;
	}
	
	public void przyznajKare() {
		if(wypozyczone!=null) { //sprawdzenie czy klient ma cos wypozyczonego
			Date teraz = new Date(); // pobieranie aktualnej daty z systemu
			int minelo = checkHowManyDaysPassed(wypozyczone.getData_wypozyczenia(),teraz); // roznica w dniach miedzy dwiema datami
			if(minelo>=wypozyczone.getDlugosc_wypozyczenia()) { // jezeli roznica w dniach jest wieksza od dlugosci wypozyczenia
				kara+=wypozyczone.getCena()*0.05;	
				System.out.println("Przyznano kare w wysokosci: " + wypozyczone.getCena()*0.05);
			}else {
				System.out.println("Uzytkownik ma jeszcze czas na oddanie ksiazki "+wypozyczone.getTytul());
			}
		}else {
			System.out.println("Klient "+imie+" "+nazwisko+" nie ma wypozyczonej zadnej ksiazki");
		}
	}
	
	public void zmniejszKare(double kwota){
		if(kara<kwota) { //kara nie moze byc ujemna
			System.out.println("Kwota jest za duza ");
		}else {
			this.kara-=kara;
			System.out.println("Zmniejszono kare o:"+kwota);
		}
		
	}
	//GETTERS SETTERS
	public int getID(){
		return ID;
	}
	public void setID(int ID) {
		this.ID=ID;
	}
	
	public String getImie(){
		return imie;
	}
	public void setImie(String imie) {
		this.imie=imie;
	}
	
	public String getNazwisko(){
		return nazwisko;
	}
	public void setNazwisko(String nazwisko) {
		this.nazwisko=nazwisko;
	}

	public boolean getCzyWypozyczone() {	
		if(wypozyczone != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public void setCzyWypozyczone(Produkt produkt) {	
			wypozyczone = produkt;
	} // <---- ustawia produkt w posiadaniu klienta
	
	public int checkHowManyDaysPassed(Date date1,Date date2) {
		long diff = date1.getTime() - date2.getTime();
		int days = (int) TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		return days;
	}
	
	
}
