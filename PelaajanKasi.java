/*3.	Toteuta luokka PelaajanKasi, jolla on ArrayList<Kortti>-tyyppinen atribuutti kortit.
Toteuta luokkaan metodi otaKortti, joka lisää kortit-listaan parametrina saamansa kortin.
Toteuta luokkaan lisäksi metodi selvitäSumma, joka selvittää pelaajan käden summan seuraavin säännöin:

kortin arvo 2-10:	käden summaan lisätään kortin numeroa vastaava arvo(2 lisätään 2, 3 lisätään 3.)
kortin arvo 11-13:	käden summaan lisätään 10
kortin arvo 1 (ässä):	käden summaan lisätään 11

Mikäli korttein yhteissummaksi tuli yli 21, niin vähennetään summasta 10.
Tässä tilanteessa on saatu kaksi ässää, jolloin toisen ässän tulkitaan olevan arvoltaan 1.
*/


package blackjack;

import java.util.ArrayList;

/**
 *
 * @author s1700280
 */
public class PelaajanKasi {
         private String kortit;
       ArrayList<Kortti> pelaajankortit = new ArrayList<Kortti>();


        

        

        
}