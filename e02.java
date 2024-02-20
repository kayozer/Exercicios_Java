/*Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159
 */
package exercicios_inicio;
import java.util.Scanner;

public class e02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        double raio;
        double pi;
        double area;

        System.out.print("digite o valor do raio do circulo: ");
        raio = sc.nextDouble();
        pi = 3.14159;
        area = pi* (raio *raio);

        System.out.printf("Valor da area eh de: %.4f%n", area);

        sc.close();
    }
    
}
