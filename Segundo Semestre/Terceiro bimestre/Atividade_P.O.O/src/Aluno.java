public class Aluno {

    public int matricula;
    public String nome;
    public int idade;
    public Curso curso;

    public Aluno(int matricula, String nome, int idade, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
    }

    public void exibirDados() {
        System.out.println("Matricula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Curso: " + curso.nome);
    }
}