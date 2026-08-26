import javax.swing.*;

public class Main {

    public static void main(String[] args){

        //Declaração das Matrizes
        int [][] A = new int[3][3];
        int [][] B = new int[3][3];

        //for para preencher as matrizes
        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++){

                String entrada = JOptionPane.showInputDialog(null,"Matriz A - Digite o valor na posição [ " + i +" ]" + "[ " + j + " ]");
                A[i][j] = Integer.parseInt(entrada);
            }
        }

        for(int i = 0; i < 3; i++) {

            for(int j = 0; j < 3; j++){

                String entrada = JOptionPane.showInputDialog(null,"Matriz B - Digite o valor na posição [ " + i +" ]" + "[ " + j + " ]");
                B[i][j] = Integer.parseInt(entrada);
            }
        }

        //Declaração das Matrizes para armazenar os resultados
        int [][] C = new int[3][3];

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        int [][] D = new int[3][3];

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                D[i][j] = A[i][j] - B[i][j];
            }
        }

        int [][] E = new int[3][3];

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                E[i][j] = A[i][j] / B[i][j];
            }
        }

        //Exibe as Matrizes através do terminal
        System.out.println("Matriz A");
        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B ");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz C (Soma)");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz D (Subtração)");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(D[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz E (Divisão)");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(E[i][j] + "\t");
            }
            System.out.println();
        }
    }
}