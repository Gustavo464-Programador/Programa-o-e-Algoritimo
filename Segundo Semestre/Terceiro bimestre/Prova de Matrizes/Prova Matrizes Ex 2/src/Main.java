//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int [][] A = {

                {1, 2, 5, 6},
                {3, 4, 7, 8},
                {2, 1, 5, 6},
                {5, 4, 3, 9}
        };

        int [][] B = {

                {5, 6, 1, 3},
                {7, 8, 4, 5},
                {3, 2, 6, 7},
                {1, 3, 5, 9}
        };

        int[][] C = new int[4][4];
        for(int i = 0; i < 4; i++){

            for(int j = 0; j < 4; j++ ){

                for(int k = 0; k < 4; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz A");
        for(int i = 0; i < 4; i ++){

            for(int j = 0; j < 4; j++){

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B");
        for(int i = 0; i < 4; i ++){

            for(int j = 0; j < 4; j++){

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz C");
        for(int i = 0; i < 4; i ++){

            for(int j = 0; j < 4; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}