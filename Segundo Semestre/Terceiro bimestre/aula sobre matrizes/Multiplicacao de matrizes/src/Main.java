public class Main {
    public static void main(String[] args) {

        int[][] A = {

                {2, 4, 6},
                {8, 10, 12}
        };

        int[][] B = {

                {1, 3},
                {5, 7},
                {9, 11}
        };

        int[][] C = new int[2][2];
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                for (int k = 0; k < 3; k++) {

                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matriz A");
        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B");
        for (int i = 0; i < 3; i++){

            for(int j = 0; j < 2; j++){

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Matriz C");
        for (int i = 0; i < 2; i++){

            for(int j = 0; j < 2; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}