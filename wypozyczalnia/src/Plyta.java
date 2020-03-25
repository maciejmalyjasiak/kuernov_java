public class Plyta extends Produkt{
        private int liczba_piosenek;


        public Plyta(int id, String data_wydania, String autor, String wydawnictwo, String tytul, double cena, int liczba_piosenek) {
            super(id, data_wydania, autor, wydawnictwo, tytul, cena);
            this.liczba_piosenek= liczba_piosenek;
        }
//GETTERS SETTERS
        public int getLiczba_piosenek()
        {
            return liczba_piosenek;
        }
        public void setLiczba_piosenek(int liczba_piosenek) {
        this.liczba_piosenek=liczba_piosenek;
    }

    }

