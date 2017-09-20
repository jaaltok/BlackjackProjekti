/*2.	Toteuta luokka Korttipakka, jolla on ArrayList<Kortti>-tyyppinen atribuutti pakka.
Luokan oletuskonstruktori sijoittaa pakka-atribuuttiin halutun määrän 52 korttisia korttipakkoja
numero- ja maajärjestyksessä. Toteuta luokkaan metodi sekoita, joka sekoittaa atribuutin pakka korttien
järjestyksen.
Toteuta lisäksi metodi jaaKortti, joka palauttaa pakan ensimmäisen kortin ja poistaa sen pakasta.*/


package blackjack;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Korttipakka {

   ArrayList<Kortti> pakka = new ArrayList<Kortti>();
   
   public Korttipakka () {

    pakka = new ArrayList<Kortti>();
   
    pakka.add(new Kortti (2, "Hertta"));
    pakka.add(new Kortti (3, "Hertta"));
    pakka.add(new Kortti (4, "Hertta"));
    pakka.add(new Kortti (5, "Hertta"));
    pakka.add(new Kortti (6, "Hertta"));
    pakka.add(new Kortti (7, "Hertta"));
    pakka.add(new Kortti (8, "Hertta"));
    pakka.add(new Kortti (9, "Hertta"));
    pakka.add(new Kortti (10, "Hertta"));
    pakka.add(new Kortti (11, "Hertta"));
    pakka.add(new Kortti (12, "Hertta"));
    pakka.add(new Kortti (13, "Hertta"));
    pakka.add(new Kortti (1, "Hertta"));
    
    pakka.add(new Kortti (2, "Ruutu"));
    pakka.add(new Kortti (3, "Ruutu"));
    pakka.add(new Kortti (4, "Ruutu"));
    pakka.add(new Kortti (5, "Ruutu"));
    pakka.add(new Kortti (6, "Ruutu"));
    pakka.add(new Kortti (7, "Ruutu"));
    pakka.add(new Kortti (8, "Ruutu"));
    pakka.add(new Kortti (9, "Ruutu"));
    pakka.add(new Kortti (10, "Ruutu"));
    pakka.add(new Kortti (11, "Ruutu"));
    pakka.add(new Kortti (12, "Ruutu"));
    pakka.add(new Kortti (13, "Ruutu"));
    pakka.add(new Kortti (1, "Ruutu"));
        
    pakka.add(new Kortti (2, "Pata"));
    pakka.add(new Kortti (3, "Pata"));
    pakka.add(new Kortti (4, "Pata"));
    pakka.add(new Kortti (5, "Pata"));
    pakka.add(new Kortti (6, "Pata"));
    pakka.add(new Kortti (7, "Pata"));
    pakka.add(new Kortti (8, "Pata"));
    pakka.add(new Kortti (9, "Pata"));
    pakka.add(new Kortti (10, "Pata"));
    pakka.add(new Kortti (11, "Pata"));
    pakka.add(new Kortti (12, "Pata"));
    pakka.add(new Kortti (13, "Pata"));
    pakka.add(new Kortti (1, "Pata"));
    
    pakka.add(new Kortti (2, "Risti"));
    pakka.add(new Kortti (3, "Risti"));
    pakka.add(new Kortti (4, "Risti"));
    pakka.add(new Kortti (5, "Risti"));
    pakka.add(new Kortti (6, "Risti"));
    pakka.add(new Kortti (7, "Risti"));
    pakka.add(new Kortti (8, "Risti"));
    pakka.add(new Kortti (9, "Risti"));
    pakka.add(new Kortti (10, "Risti"));
    pakka.add(new Kortti (11, "Risti"));
    pakka.add(new Kortti (12, "Risti"));
    pakka.add(new Kortti (13, "Risti"));
    pakka.add(new Kortti (1, "Risti"));
    
   }
   
   public Kortti sekoitajajaa(){
    Kortti one = pakka.get((int) (Math.random() * pakka.size()));
    pakka.remove(one);
    return one;
}
}