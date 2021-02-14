/**
 * 1_exercicio
 */
/*Написать программу, получающую на вход в качестве аргумента два параметра
- числа x и y. Если сумма этих чисел больше 20, то вычислить утроенный квадрат
первого числа, в противном случае куб второго числа. Вывести результат на экран. */

/*Escreva um programa que tenha dois parâmetros como argumento
- números x e y. Se a soma desses números for maior que 20, calcule o quadrado triplo
o primeiro número, caso contrário, o cubo do segundo número. Exibe o resultado na tela. */
import static java.lang.Math.pow;
import java.util.Scanner;
/* import static java.lang.Math.*; */
public class exercicio_1_ {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, sum, quad, cub;
        
        System.out.print("Vvedite Tchisla n1 ");//para digitar o primeiro numero
        n1 = entrada.nextInt();
         System.out.print("Vvedite Tchisla n2 ");// para digitares o segundo numero
        n2 = entrada.nextInt();
        
        sum = n1+n2;
        System.out.println(" the sum radvnou :"+ sum);//o resultado da suma 
        
        if(sum>20){
            quad = n1*n1;
             cub = (int) pow(n2,3);
          System.out.println(" the quadr :"+ quad);//o valor do primeiro ao quadrado
           System.out.println(" the cub :"+cub);// valor do  segundo ao cubo
    }
    
        }
}