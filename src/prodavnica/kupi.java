package prodavnica;

import java.util.Scanner;
public class kupi {
 
    int pro_rb;
    int kolicina;
    double kolicina_gramovi;
    Scanner s=new Scanner(System.in);

    public kupi(int pro_rb, int kolicina) {
        this.pro_rb = pro_rb;
        this.kolicina = kolicina;
    }

    public kupi(int pro_rb, double kolicina_gramovi) {
        this.pro_rb = pro_rb;
        this.kolicina_gramovi = kolicina_gramovi;
    }
    
    public  kupi vnesi(){
        
        System.out.println("Reden broj na proizvod: ");
        pro_rb=s.nextInt();
        System.out.println("Kolicina: ");
        kolicina=s.nextInt();
        return vnesi();
    }
    public  kupi vnesig(){
        
        System.out.println("Reden broj na proizvod: ");
        pro_rb=s.nextInt();
        System.out.println("Kolicina vo gramovi: ");
        kolicina_gramovi=s.nextDouble();
        return vnesig();
    }

    public int getPro_rb() {
        return pro_rb;
    }

    public int getKolicina() {
        return kolicina;
    }

    public double getKolicina_gramovi() {
        return kolicina_gramovi;
    }
    
}
