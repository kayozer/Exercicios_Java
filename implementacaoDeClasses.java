//Implemente a classe Funcionario com nome, salario e os métodos
addAumento(double valor), ganhoAnual() e exibeDados() - imprime os valores do funcionário.
a. crie a classe Assistente, que também é um funcionário, e que possui um número de
matrícula (faça os métodos GET e SET). Sobrescreva o método exibeDados().
b. sabendo que os Assistentes Técnicos possuem um bônus salarial e que os Assistentes
Administrativos possuem um turno (dia ou noite) e um adicional noturno, crie as classes
Tecnico e Administrativo e sobrescreva o método ganhoAnual() de ambas as classes
(Administrativo e Tecnico).


public class Funcionario {


private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void addAumento(double valor) {
        salario += valor;
    }

    public double ganhoAnual() {
        return salario * 12;
    }

    public void exibeDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
}

public class Assistente extends Funcionario {
    private int numeroMatricula;

    public Assistente(String nome, double salario, int numeroMatricula) {
        super(nome, salario);
        this.numeroMatricula = numeroMatricula;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    @Override
    public void exibeDados() {
        super.exibeDados();
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }
}


public class Tecnico extends Assistente {
    private double bonus;

    public Tecnico(String nome, double salario, int numeroMatricula, double bonus) {
        super(nome, salario, numeroMatricula);
        this.bonus = bonus;
    }

    @Override
    public double ganhoAnual() {
        return super.ganhoAnual() + bonus;
    }
}

public class Administrativo extends Assistente {
    private String turno;
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, int numeroMatricula, String turno, double adicionalNoturno) {
        super(nome, salario, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double salarioAnual = super.ganhoAnual();
        if (turno.equals("noite")) {
            salarioAnual += adicionalNoturno * 12;
        }
        return salarioAnual;
    }
}
