import javax.swing.*;

public class Main{

    public static void main(String[] args){

        int numA = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1 da Primeira Matriz"));
        int numB = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2 da Primeira Matriz"));
        int numC = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3 da Primeira Matriz"));
        int numD = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 4 da Primeira Matriz"));
        int numE = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 5 da Primeira Matriz"));
        int numF = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 6 da Primeira Matriz"));
        int numG = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 1 da Segunda Matriz"));
        int numH = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 2 da Segunda Matriz"));
        int numI = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 3 da Segunda Matriz"));
        int numJ = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 4 da Segunda Matriz"));
        int numK = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 5 da Segunda Matriz"));
        int numL = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero 6 da Segunda Matriz"));
        String fina = "";

        int [][] A = {

                {numA, numB, numC},
                {numD, numE, numF}
        };

        int [][] B = {

                {numG, numH},
                {numI, numJ},
                {numK, numL}
        };

        int [][] C = new int[2][2];

        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 2; j++){

                for(int k = 0; k < 3; k++){

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        JOptionPane.showMessageDialog(null,"Matriz A");
        for(int i = 0; i < 2; i++){

            fina += "[ ";

            for(int j = 0; j < 3; j++){

                fina += String.format("%6d", A[i][j]);
            }
            fina += " ]\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz A" + "\n" + fina );

        fina = "";

        JOptionPane.showMessageDialog(null,"Matriz B");
        for(int i = 0; i < 3; i++){

            fina += "[ ";

            for(int j = 0; j < 2; j++){


                fina += String.format("%6d", B[i][j]);
            }
            fina += " ]\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz B" + "\n" + fina );

        fina = "";

        JOptionPane.showMessageDialog(null,"Matriz C");
        for(int i = 0; i < 2; i++){

            fina += "[ ";

            for(int j = 0; j < 2; j++){


                fina += String.format("%6d", C[i][j]);
            }
            fina += " ]\n";
        }
        JOptionPane.showMessageDialog(null, "Matriz C" + "\n" + fina );
    }
}