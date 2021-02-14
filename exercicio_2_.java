/*Дано а,b,. Найти наибольшее max и наименьшее min . Найти d:
 */
/*Dado a, b,. Encontre o maior máximo e o menor mínimo. Encontre d: */
import static java.lang.Math.pow;
import java.util.Scanner;
import static java.lang.Math.*;
public class exercicio_2_ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
                int n1, n2, sum, max, min, d;
                
                System.out.print("Vvedite Tchisla n1 ");//digitar o primeiro numero
                n1 = entrada.nextInt();
                 System.out.print("Vvedite Tchisla n2 ");//digitar o segundo numero
                n2 = entrada.nextInt();
                
                
                if(n1>n2){
                    max = n1*2;
                    min = n2+4;
                }
                else{
                    max= n2*2;
                    min = n1+4;
                }
                 
                d = ((int) (max-10*sqrt(min)+4.2*min))/(1+ (max/min));
    }
}
