public class Main{

    public static void main(String[] args){

        int [][] A = {

                {2, 4, 6, 8, 10},
                {12, 14, 16, 18, 20},
                {22, 24, 26, 28, 30},
                {32, 34, 36, 38, 40},
                {42, 44, 46, 48, 50}
        };

        int [][] B = {

                {1, 3, 5, 7, 9},
                {11, 13, 15, 17, 19},
                {21, 23, 25, 27, 29},
                {31, 33, 35, 37, 39},
                {41, 43, 45, 47, 49}
        };

        int [][] C = new int[5][5];
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){

                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz A");
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz B");
        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Matriz C");
        for(int i = 0; i <  5; i++){

            for(int j = 0; j < 5; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}