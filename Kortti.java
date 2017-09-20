/*1. Toteuta luokka Kortti, jolla on atribuutit arvo (int) ja maa (String).
Toteuta luokkaan parametrillinen konstruktori, get- ja set- metodit ja toString-metodi.
*/
package blackjack;

public class Kortti {
    
    private int arvo;
    private String maa;
    
    //konstruktori
    public Kortti(int arvo, String maa){
        this.arvo=arvo;
        this.maa=maa;
    }
    
        public void setArvo(int arvo){
        this.arvo=arvo;
    }
    
    public int getArvo(){
        return arvo;
    }
    
        public void setMaa(String maa){
        this.maa=maa;
    }
    
    public String getMaa(){
        return maa;
    }
    
    @Override
    public String toString(){
        return "Arvo: "+this.arvo+" Maa: "+this.maa;
    }
}