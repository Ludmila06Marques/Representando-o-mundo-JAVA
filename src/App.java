public class App {
    public static void main(String[] args) throws Exception {
        
    Alunos aluno1 = new Alunos();

    aluno1.setNome("Gustavo");

    aluno1.email = "gustavinho@hotmail.com";

    aluno1.telefone = 123456789;

    aluno1.setSenha("masterclass");

    aluno1.idade = 23;

    aluno1.curso.nome = "POO";

    aluno1.curso.tempo = 2;

    aluno1.curso.finalizado = false;

    System.out.println("Nome do aluno: " + aluno1.getNome() + ".");
    
    //ANIVERSARIO DO ALUNO

    aluno1.aniversario();
    
    //PEGANDO A IDADE DO ALUNO

    aluno1.getIdade();

    //STATUS DO CURSO

    aluno1.curso.status();

    //ALTERAR DURACAO DO CURSO

    aluno1.curso.alterarDuracao(3);

    //PEGAR DURACAO DO CURSO

    aluno1.curso.duracaoCurso();

    aluno1.aniversario();

    aluno1.getIdade();



    }
}

