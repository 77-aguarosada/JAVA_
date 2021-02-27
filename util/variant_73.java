

import static java.lang.Math.pow;
import java.util.Scanner;
import static java.lang.Math.*;

public class variant_73 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x , d,a,b;
        final double e = 2.71;
        double y, F;
            System.out.print("Vvedite Tchisla   Y ");
        x = entrada.nextInt();
        System.out.print("Vvedite Tchisla   a ");
        a = entrada.nextInt();
        System.out.print("Vvedite Tchisla   b ");
        b = entrada.nextInt();
         System.out.print("Vvedite Tchisla F ");
        d = entrada.nextInt();
      
        if(x<=0){
            y = (int) (a-pow(b, x+1) )  ;
             System.out.println(" the value Y :"+y);
          }
          if(x>0 && x<=3){
              
               y = (int) (1+ pow(3, x*a));
               System.out.println(" the value Y :"+ y); 
          }
          
          if(x>3){
              
              y = (int) (cos(a*x+1)/sin(a*x+1));
              System.out.println(" the value Y :"+ y);
              
          }
          if(d<=0){
              F = (int) pow(e,(sin(a*x+1)/cos(a*x+1)))  ;
               System.out.println(" the value F :"+F);
            }
            if(d>0 && d<=3){
                
                 F = (int) (pow(x,a)-(pow(sin(x),b)));
                  System.out.println(" the value F :"+F);
                 
            }
            
            if(d>3){
                
                F = (int) pow(x,2/5);
                 System.out.println(" the value F :"+F);
            }
            
            
    }
}
