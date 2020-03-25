public class Ebook extends Produkt {


    private int strony;
    private double rozmiar_w_mb;

    public Ebook(int id, String data_wydania, String autor, String wydawnictwo, String tytul, double cena, int strony, double rozmiar_w_mb) {
        super(id, data_wydania, autor, wydawnictwo, tytul, cena);
        this.strony = strony;
        this.rozmiar_w_mb = rozmiar_w_mb;
    }
//GETTERS SETTERS
   public double getRozmiar_w_mb() {return rozmiar_w_mb;}
    public void setRozmiar_w_mb(double rozmiar_w_mb) {
        this.rozmiar_w_mb=rozmiar_w_mb;
    }

   public int getStrony()
   {
       return strony;
   }
    public void setStrony(int strony) {
        this.strony=strony;
    }

}
