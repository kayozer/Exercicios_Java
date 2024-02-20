/*Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.*/

package exercicios_inicio;
import java.util.Scanner;

public class e05 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int cod1, numPeca1, cod2, numPeca2;
    double valorUnitario1, valorUnitario2;
    double valorTotal;

//peça 1
    System.out.println("digite o codigo da primeira peça: ");
    cod1 = sc.nextInt();

    System.out.println("digite a quantidade de peças que você quer levar: ");
    numPeca1 = sc.nextInt();
    
    System.out.println("qual o valor da peça?: ");
    valorUnitario1 = sc.nextDouble();

   //peca2
    System.out.println("Digite o codigo da segunda peça: ");

    cod2 = sc.nextInt();
    
    System.out.println("digite a quantidade de peças que você quer levar: ");
     
    numPeca2 = sc.nextInt();

    System.out.println("qual o valor da peça? ");
    valorUnitario2 = sc.nextDouble();

    valorTotal = (numPeca1 * valorUnitario1) + (numPeca2 * valorUnitario2);

    System.out.printf(" o valor total da sua compra é de: %.2f%n", valorTotal);

    sc.close();
    
}    
}
