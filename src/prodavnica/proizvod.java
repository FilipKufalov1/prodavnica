package prodavnica;

public class proizvod {
 
    int redenbroj;
    String naziv;
    int kolicina;
    double kolicina_kila;
    int cena;
    double cena1;

    public proizvod(int redenbroj, String naziv, int kolicina, int cena) {
        this.redenbroj = redenbroj;
        this.naziv = naziv;
        this.kolicina = kolicina;
        this.cena = cena;
    }

    @Override
    public String toString() {
        return  "redenbroj " + redenbroj + "\nNaziv " + naziv + "\nKolicina " + kolicina + "\nCena za parce " + cena ;
    }

    public proizvod(int redenbroj, String naziv, double kolicina_kila, int cena) {
        this.redenbroj = redenbroj;
        this.naziv = naziv;
        this.kolicina_kila = kolicina_kila;
        this.cena = cena;
    }
    
   
    
    
}
