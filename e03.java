/*Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D). */
package exercicios_inicio;
import java.util.Scanner;
public class e03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in );
        
        int a, b, c, d;
        int diferenca;
         System.out.println("digite o primeiro numero: ");
         a = sc.nextInt();

         System.out.println(" Digite o segundo numero: ");
         b = sc.nextInt();

        System.out.println("digite o terceiro numero: ");
        c = sc.nextInt();

        System.out.println("digite o quarto numero: ");
        d = sc.nextInt();

        diferenca = (a *b )- ( c *d);

        System.out.println("o valor da diferença é de: " + diferenca);

        sc.close();


    }
}
