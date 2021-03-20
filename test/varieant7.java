

/**
 * varieant7
 */
import java.util.Scanner;
public class varieant7 {

    public static void main(String[] args) {
        
        int[][] arr = new int[][] { {3, 4, 1, 8},
                                    {1, 4, 9, 11},  
                                    {76, 34, 21,1}, 
                                    {2, 1, 4, 5 }}; 
        int [] arr_b = new int [100];
        Scanner entrada = new Scanner(System.in);                    
        System.out.println("\nmassiv");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
               
                        System.out.print(arr[i][j]+" ");
                
            }
            System.out.print("\n\n");
        } 
        int k=0;
          System.out.print("Vvedite k \n");
        k  = entrada.nextInt();
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
               
                if(arr[i][j]<k){
                   arr_b[i] =arr[i][i];
                }
                
            }
         
        }                 
        System.out.print("\n\n");
         System.out.print("\nmasiv stroke");
        for(int i=0; i<arr.length; i++){
          
                
            System.out.println(arr_b[i]);
                
            
           
        }                 
   
   
  

    }
}