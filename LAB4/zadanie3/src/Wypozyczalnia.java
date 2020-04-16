import java.util.Scanner;

public class Wypozyczalnia {
	static boolean running = false;
	
	public static void main(String[] okon) {
			running = true;
			Scanner in = new Scanner(System.in);
			Klient klient = new Klient(1,"Adam","Nowrka","1 Maja, Katowice",22);
			Ksiazka ksiazka = new Ksiazka(1, "2019", "Norwa ", "Okon","Na basenie", 69.69, 120,"twarda", new Klient(1,"Adam","Nowrka","1 Maja, Katowice",22));
			Ksiazka ksiazka1 = new Ksiazka(2, "2222", "Haha ", "nice","Stajnia", 999, 240,"miekka",null);
			Ebook ebook = new Ebook( 3, "2010", "Adam Parkitny", "HOHAL","Okon", 44, 410,30.2, null);
			Ebook ebook1 = new Ebook(4, "2011", "Jan Dzban", "Gucio","Corona outbreak", 49.99, 320,20.5,null);
			Audiobook audiobook = new Audiobook(5, "2015", "Hubert Nowak", "Madri","Javafun", 95.55,20.5, 45.56,null);
			Audiobook audiobook1 = new Audiobook(6, "2019", "Norbert Wow", "Elmo","Basenowo", 100.01, 10.55,20.5,null);
			Film film = new Film(7, "2020", "Newt Goldman", "Warner Boras.","Corona Zombies", 35.55, 123,null);
			Film film1 = new Film(8, "2020", "Jan Patejko", "Warner Boras.","NICZY", 45.55, 145,null);
			Plyta plyta = new Plyta(9, "2008", "Rise Against", "Griffin Records.","Appeal to Reason", 15.99, 13,null);
			Plyta plyta1 = new Plyta(10, "2017", "Rise Against", "Virgin Records.","Wolves", 25.98, 11,null);

			while(running) {
			System.out.println(">>");
			int wejscie = in.nextInt();
			switch(wejscie){
				case 1 : {
					ksiazka.wypozyczProdukt(klient,0); // (klient, czas wypozyczenia w dniach)
					break;
				}
					
				case 2 : {
					ksiazka1.wypozyczProdukt(klient,1);
					break;
				}
				case 3 : {
					ksiazka.oddajProdukt();
					break;
				}
				
				case 4 : {
					ksiazka1.oddajProdukt();
					break;
				}
				
				case 5 : {
					klient.przyznajKare();
					break;
				}
				case 7 : {
					System.out.println("Kara: "+klient.getKara());
					System.out.println("Wypozyczone: " +klient.getCzyWypozyczone());
					break;
				}
		
				case 8 : {
					klient.zmniejszKare(klient.getKara());
					break;
				}

				default:{
					System.out.println("Nie znaleziono takiej opcji");
					break;
				}
			}
		}
		
		
		
	}

}
