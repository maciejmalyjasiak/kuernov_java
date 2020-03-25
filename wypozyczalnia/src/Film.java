
public class Film extends Produkt{
	private int dlugosc_w_min;
	public Film(int id, String data_wydania, String autor, String wydawnictwo, String tytul, double cena, int dlugosc_w_min) {
		super(id, data_wydania, autor, wydawnictwo, tytul, cena);
		this.dlugosc_w_min=dlugosc_w_min;
	}
	//GETTERS SETTERS
	public int getDlugosc_w_min() { return dlugosc_w_min; }
	public void setDlugosc_w_min(int dlugosc_w_min) {
		this.dlugosc_w_min=dlugosc_w_min;
	}
	
	
}
