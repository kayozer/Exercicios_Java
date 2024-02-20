/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.
 */

package exercicios_inicio;
import java.util.Scanner;

public class e06 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c;

        System.out.println("primeiro numero: ");
        a = sc.nextDouble();
        System.out.println("segundo numero: ");
        b = sc.nextDouble();
        System.out.println("terceiro numero: ");
        c = sc.nextDouble();


        double areaTriangulo, baseTriangulo, alturaTriangulo;
        baseTriangulo = a;
        alturaTriangulo = c;
        areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.printf("a área triangulo é de  %.3f%n ", areaTriangulo);

        double areaCirculo, raioCirculo = c, pi = 3.14159;

        areaCirculo = pi * (raioCirculo * raioCirculo); 
         System.out.printf("a área do circulo é de %.3f%n", areaCirculo);

         double areaTrapezio, baseMaior= a, baseMenor = b, alturaTrapezio = c;

         // ((baseMaior + baseMenor) * altura) / 2;
         
         areaTrapezio = ((baseMaior + baseMenor) * alturaTrapezio) / 2;

         System.out.printf("a área do trapezio é de %.3f%n", areaTrapezio);

         double areaQuadrado, lado = b;
         
         areaQuadrado =  lado * lado;

         System.out.printf("a area do quadrado é de %.3f%n", areaQuadrado);

        double areaRetangulo, comprimento = a, largura = b;
        //area= Comprimento × Largura
        areaRetangulo = comprimento * largura;
        System.out.printf("a area do retangulo é de: %.3f%n", areaRetangulo);

        sc.close();

    }
}
