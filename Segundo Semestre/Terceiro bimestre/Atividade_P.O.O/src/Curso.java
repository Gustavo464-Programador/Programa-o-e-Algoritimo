public class Curso {

        public int codigo;
        public String nome;
        public int duracao;

        public Curso(int codigo, String nome, int duracao) {
            this.codigo = codigo;
            this.nome = nome;
            this.duracao = duracao;
        }

        public void exibirDados() {
            System.out.println("Codigo: " + codigo);
            System.out.println("Nome do curso: " + nome);
            System.out.println("Duracao: " + duracao + " anos");
        }

}
