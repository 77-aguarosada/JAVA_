

package Heranca;

/**
 * Innerprincipal
 */
public class principal {
        public static void main(String[] args) {
             
        komonata  tuffy = new komonata("AD",4,3,55);
        System.out.println(tuffy.toString());
        
        komonataLucks  komo = new komonataLucks("MDK",4,3,55,5, 6);
        System.out.println(komo.toString());

        KomonataPolu  polu = new  KomonataPolu("A6",5,6,55);
        System.out.println(polu.toString());

        }
    
}