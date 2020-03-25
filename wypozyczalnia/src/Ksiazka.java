
public class Ksiazka extends Produkt {
	private int strony;
	private String typ_okladki;
	
	
	public Ksiazka(int id, String data_wydania, String autor, String wydawnictwo,String tytul, double cena, int strony, String typ_okladki) {
		super(id, data_wydania, autor, wydawnictwo, tytul, cena);
		this.strony=strony;
		this.typ_okladki=typ_okladki;
	}
//GETTERS SETTERS
		public int getStrony() {return strony; }
		public void setStrony(int strony) {
		this.strony=strony;
	}

		public String getTyp_okladki() { return typ_okladki; }
		public void setTyp_okladki(String typ_okladki) {
		this.typ_okladki=typ_okladki;
	}

}
