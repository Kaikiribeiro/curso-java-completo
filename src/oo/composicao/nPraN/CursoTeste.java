package oo.composicao.nPraN;

public class CursoTeste {
  static void main(String[] args) {
    Aluno aluno1 = new Aluno("Lorena");
    Aluno aluno2 = new Aluno("Julia");
    Aluno aluno3 = new Aluno("Oscar");

    Curso curso1 = new Curso("Java Completo");
    Curso curso2 = new Curso("Iniciando em C");
    Curso curso3 = new Curso("SQL do zero ao senior");

    curso1.adicionarAlunos(aluno1);
    curso1.adicionarAlunos(aluno2);

    curso2.adicionarAlunos(aluno1);
    curso2.adicionarAlunos(aluno3);

    aluno1.adicionarCurso(curso3);
    aluno2.adicionarCurso(curso3);
    aluno3.adicionarCurso(curso3);

    for (Aluno aluno : curso3.alunos) {
      System.out.println(aluno.nome);
    }

    System.out.println(aluno1.cursos.get(0).alunos);
  }
}
