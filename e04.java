/*Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais.*/

package exercicios_inicio;
import java.util.Scanner;
public class e04 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

int numFuncionario;
double horasTrabalhadas;
double valorHora;
double salario;

System.out.println("Numero do funcionario: ");
numFuncionario = sc.nextInt();

System.out.println(" Quantidade de horas trabalhadas: ");
horasTrabalhadas = sc.nextDouble();

System.out.println("Digite o valor por hora: ");
valorHora = sc.nextDouble();

salario = valorHora * horasTrabalhadas;

System.out.printf("Olá funcionario numero %d o valor do seu salário será de R$ %.2f%n", numFuncionario, salario);


sc.close();

}


    
}
