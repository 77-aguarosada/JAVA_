

import static java.lang.Math.pow;
import java.util.Scanner;
import static java.lang.Math.*;

public class variant_7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, sum, max, min;
        double d;
        System.out.print("Vvedite Tchisla a ");//digitar o primeiro numero
        n1 = entrada.nextInt();
         System.out.print("Vvedite Tchisla b ");//digitar o segundo numero
        n2 = entrada.nextInt();

        if(n1>n2){
            max = n1;
            min = n2;
        }
        else{
            max= n2;
            min = n1;
        }

        d= ( ((5*max)-(4*min)))/(8.3+(max/min));

        System.out.print("\nd ravnou : "+d);
        
    }
}
