

import java.util.Scanner;

/**
 * vector
 */
public class vector {

    public static void main(String[] args) {
        int[] arr_a  = new int[100];
        int[] arr_b = new int[100];
        int a, b;
        Scanner numero = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);

        System.out.println("\nrazmer masiva a : ");
        a = numero.nextInt();

        System.out.println("\nrazmer masiva b : ");
        b = numero.nextInt();

        System.out.println("\nVvedite ',n,' elementov massiva A:");
        
        for(int i = 0;i<a; i++ ){
            System.out.print((i+1)+" -Vvedite : ");
            arr_a[i] = entrada.nextInt();

        }
        System.out.println("\n\n\n");
        System.out.println("\nVvedite razreshennyh znachenij B: ");
        
        for(int j = 0;j<b; j++ ){
            System.out.print((j+1)+" -Vvedite : ");
            arr_b[j] = entrada.nextInt();

        }
        System.out.println("\n\n\n");
        int t=0;
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(arr_a[i] == arr_b[j]){
                        t=t+1;

                }
            }
        }
        System.out.println("\nKolichestvo razreshennyh= "+t);

    }
}
