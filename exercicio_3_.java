/*Наиболее рационально вычислить Yи F. Использовать составной оператор. */
/*É mais racional calcular Y e F. Use um operador composto. */
import static java.lang.Math.pow;
import java.util.Scanner;
import static java.lang.Math.*;

public class exercicio_3_ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y , F , d;
        final double e = 2.71;
            System.out.print("Vvedite Tchisla   y ");
        x = entrada.nextInt();
         System.out.print("Vvedite Tchisla F ");
        d = entrada.nextInt();
        
        
        if(x<=1){
          y = (int) (pow(x, 5) + (cos(8*x)/sin(8*x)))  ;
           System.out.println(" the value Y :"+y);
        }
        if(x>0 && x<=3){
            
             y = (int) (1+ pow(3, x));
             System.out.println(" the value Y :"+ y); 
        }
        
        if(x>3){
            
            y = (int) (cos(2*x+1)/sin(2*x+1));
            System.out.println(" the value Y :"+ y);
            
        }
        if(d<=1){
            F = (int) pow(e,((sin(d)/cos(d))+1))  ;
             System.out.println(" the value F :"+F);
          }
          if(d>1 && d<=2){
              
               F = (int) (pow(x,4)-(sin(4*d)/cos(4*d)));
                System.out.println(" the value F :"+F);
               
          }
          
          if(d>2){
              
              F = (int) pow(x,2/5);
               System.out.println(" the value F :"+F);
          }
          
          
         
         
    }
}
