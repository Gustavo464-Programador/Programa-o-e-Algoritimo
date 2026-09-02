//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int num = 5;

        int [][] A = {

                {1, 2, 3},
                {4, 5, 6}
        };

        int [][] C = new int[3][3];
        for (int i = 0; i < 2; i++){

            for (int j = 0; j < 3; j++){

                C[i][j] = num * A[i][j];
            }
        }

        System.out.println("Matriz C");
        for (int i = 0; i < 2; i++){

            for(int j = 0; j < 3; j++){

                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}