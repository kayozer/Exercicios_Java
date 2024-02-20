package lista_condicional;
import java.util.Scanner;
public class E03 {
/*Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int a, b;

        System.out.println("digite o primeiro numero");
        a = sc.nextInt();
        System.out.println("dkgite o segundo numero: ");
        b = sc.nextInt();

        if (a % b == 0) {

        System.out.println("sao mutiplos");
            
        }
        else {
            System.out.println("nao são mutiplos");
        }
        sc.close();
    }
    
}
