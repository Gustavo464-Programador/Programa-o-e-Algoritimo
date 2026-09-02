//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[][] A = {

                {1, 3, 2},
                {5, 8, 9}
        };

        int[][] B = {

                {5, 10},
                {15, 20},
                {25, 30}
        };

        int [][] C = new int[2][2];
        for(int i = 0; i < 2; ++i) {

            for(int j = 0; j < 2; ++j) {

                for(int k = 0; k < 3; ++k) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz A");

        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B");

        for(int i = 0; i < 3; i++){

            for(int j = 0; j < 2; j++){

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz C");

        for(int i = 0; i < 2; i++){

            for(int j = 0; j < 2; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }


}