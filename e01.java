package exercicios_inicio;

import java.util.Scanner;

public class e01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("digite o primeiro numero: ");
        num1 = sc.nextInt();
        
        System.out.println(("digite o segundo numero"));
        num2 = sc.nextInt();
        soma = num1 + num2;
        System.out.print("a soma dos valores é " + soma);

        sc.close();

    }
    
}
