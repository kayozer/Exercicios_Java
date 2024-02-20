package lista_condicional;
import java.util.Scanner;
/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/
public class E02 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        int n1;

        System.out.println("Digite um numero inteiro");
         n1 = sc.nextInt();

        if (n1%2 ==0) {

            System.out.println(" par");
            
        }

        else if (n1 == 0) {
            System.out.println("par");

            
        }
        else{
            System.out.println("impar");
        }


        
        sc.close();

    }
    
}
