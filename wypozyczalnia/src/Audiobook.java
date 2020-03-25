public class Audiobook extends Produkt {


    private double dlugosc_w_min;
    private double rozmiar_w_mb;

    public Audiobook(int id, String data_wydania, String autor, String wydawnictwo, String tytul, double cena, double rozmiar_w_mb, double dlugosc_w_min) {
        super(id, data_wydania, autor, wydawnictwo, tytul, cena);
        this.dlugosc_w_min = dlugosc_w_min;
        this.rozmiar_w_mb = rozmiar_w_mb;
    }
//GETTERS & SETTERS
    public double getRozmiar_w_mb() { return rozmiar_w_mb; }
    public void setRozmiar_w_mb(double rozmiar_w_mb) {
        this.rozmiar_w_mb=rozmiar_w_mb;
    }

    public double getDlugosc_w_min()
    {
        return dlugosc_w_min;
    }
    public void setDlugosc_w_min(double dlugosc_w_min) {
        this.dlugosc_w_min=dlugosc_w_min;
    }


}