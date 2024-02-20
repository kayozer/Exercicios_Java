package lista_condicional;
import java.util.Scanner;

/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class E01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1;
        System.out.println("digite um numero inteiro: ");
        n1= sc.nextInt();

        if (n1 > 0) {
            System.out.println("este numero é positivo");

         }
         else if (n1 == 0) {

            System.out.println("este numero é zero");
         }

         else{
            System.out.println("este numero é negativo");
         } 
         

    sc.close();

        
    }
}
