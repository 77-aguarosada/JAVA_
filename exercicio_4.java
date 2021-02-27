import java.util.Scanner;

public class exercicio_4 {
    
    public static void main(String[] args) {
         /*int[] arr_a  = new int[100];
        int[] arr_b = new int[100];
        int[] arr_c = new int[100];
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
        System.out.println("\nmassiv razreshennyh");
        for(int i=0; i<a; i++){
            for(int j=0; j<b; j++){
                if(arr_a[i] == arr_b[j]){
                        t=t+1;
                     
                       arr_c[t]= arr_b[j] ; 
                        System.out.println(arr_c[t]);
                }
            }
        }
        System.out.println("\nKolichestvo razreshennyh = "+t);
          System.out.println("\n\n\n");
*/
        
int[] arr_b = new int[100];
int[] arr_c = new int[100];

  int a, b,r,n,k=0;
  Scanner numero = new Scanner(System.in);
  Scanner entrada = new Scanner(System.in);
  System.out.println("\nrazmer masiva b : ");
  a = numero.nextInt();

    for(int i = 0;i<a; i++ ){
        System.out.print((i+1)+" -Vvedite  MASSIV B: ");
        arr_b[i] = entrada.nextInt();
        
      
    }


    for(int i = 0;i<a; i++ ){
   
    
        if(arr_b[i]<0){
          k = k+1;

          arr_c[k]= arr_b[i]*4;
          System.out.println(arr_c[k]);
         
        }

    }

    n = arr_c.length;
     System.out.println("\n\n\n");
     for(int i=0; i<n-1; i++ ){
         int min_idx = i;
       for(int j=i+1; j<n; j++){

        if(arr_c[j]>arr_c[min_idx]){
            min_idx = j;
            r =arr_c[min_idx];
            arr_c[min_idx] = arr_c[i];
            arr_c[i]=r;
        }
              
                 
           
      }

     }
 
    for(int i=0; i<n; i++ ){
        System.out.println(arr_c[i]);
            
    }


 
 
  
    }
}
