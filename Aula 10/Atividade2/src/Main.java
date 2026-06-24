import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {

        //Declaração das Variaveis.
        int[] notas = new int[7];
        int i = 1;
        int soma = 0;
        int media;

        //Inicialização do laço for e calculo da média da turma.
        for (; i <= 5; i++) {

            notas[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a nota do aluno " + i + ": "));

            soma = soma + notas[i];

        }

        //calculo da média.
        media = soma / 5;
        JOptionPane.showMessageDialog(null, "A média da turma " + media);

        JOptionPane.showMessageDialog(null, "Alunos com notas acima da média: ");

        //Crião de um laço for para verificar quantos alunos ficaram com notas acima da média.
        for (; i <= 6; i++) {

            if (soma > media){

                JOptionPane.showMessageDialog(null,"Aluno " + i + "com nota: " + media);
            }
        }
    }
}