
package prodavnica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prodavnica {

    public static void main(String[] args) {
        
        int izbor;
        Scanner s=new Scanner(System.in);
        List<proizvod> hrana=new ArrayList<proizvod>();
        List<proizvod> ovosje_zelencuk=new ArrayList<proizvod>();
        List<proizvod> cigari_sokovi=new ArrayList<proizvod>();
        List<kupi> smetki=new ArrayList<kupi>();
        
        proizvod h1=new proizvod(1,"Leb",100,40);
        proizvod h2=new proizvod(2,"Majonez",200,140);
        proizvod h3=new proizvod(3,"Sirenje",150,240);
        proizvod h4=new proizvod(4,"Kechap",100,40);
        proizvod h5=new proizvod(5,"Kashkaval",100,400);
        proizvod o1=new proizvod(6,"Domat",1000.0,40);
        proizvod o2=new proizvod(7,"Krastavica",1000.,60);
        proizvod o3=new proizvod(8,"Grozje",500.,140);
        proizvod o4=new proizvod(9,"Praska",150.,120);
        proizvod o5=new proizvod(10,"Limon",100,240);
        proizvod c1=new proizvod(11,"Marlboro",100,180);
        proizvod c2=new proizvod(12,"Winston",200,140);
        proizvod c3=new proizvod(13,"Rodeo",500,110);
        proizvod c4=new proizvod(14,"Coca Cola",190,70);
        proizvod c5=new proizvod(15,"Gust sok",200,80);
        hrana.add(h1); hrana.add(h2); hrana.add(h3); hrana.add(h4); hrana.add(h5);
        ovosje_zelencuk.add(o1); ovosje_zelencuk.add(o2); ovosje_zelencuk.add(o3); ovosje_zelencuk.add(o4); ovosje_zelencuk.add(o5);
        cigari_sokovi.add(c1); cigari_sokovi.add(c2); cigari_sokovi.add(c3); cigari_sokovi.add(c4); cigari_sokovi.add(c5);
        
        
        
        do{
        System.out.println("==========**********==========");
        System.out.println("========DOBRODOJDOVTE=========");
        System.out.println("==========**********==========");
        System.out.println("Odberete usluga: "+
                "\n1. Lista na proizvodi "+
                "\n2. Pazari "+
                "\n3. Smetki "+
                "\n4. Vkupen promet "+
                "\n5. Nabavki");
        izbor=s.nextInt();
        switch(izbor){
                case 1:
                    System.out.println("Hrana: ");
                    for(proizvod h:hrana)
                        System.out.println(h.toString());
                    System.out.println("Ovoshje i zelencuk: ");
                    for(proizvod o:ovosje_zelencuk)
                        System.out.println(o.toString());
                    System.out.println("Cigari i sokovi: ");
                    for(proizvod c:cigari_sokovi)
                        System.out.println(c.toString());
                break;
                
                case 2:
                    
                break;
                
                case 3:
                break;
                
                case 4:
                break;
                
                case 5:
                break;
        }
    }while(izbor!=0);}
    
}
