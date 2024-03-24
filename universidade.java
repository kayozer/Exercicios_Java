public class Estudante {

    private String nome;
    private int matricula;
    private Curso curso;
    private List<Disciplina> disciplinas;

    }

public class Professor {
        private String nome;
        private List<Disciplina> disciplinas;
        private int matricula;

    }

public class Curso {

    private int Id;
    private String nome;
    private Estudante estudante;


    
}

public class Disciplina {

    private String nome;
    private Int Id;
    private Professor professor;
    private Professor trocaProfessor; 


    
}
