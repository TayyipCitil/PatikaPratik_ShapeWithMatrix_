public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 1, 1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 2, 0, 2, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 3, 3, 3, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 1, 1, 1, 1, 1, 0}
        };
        for (int[] row : matrix) {
            for (int col : row) {
                switch (col) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 1:
                        System.out.print("|");
                        break;
                    case 2:
                        System.out.print("$");
                        break;
                    case 3:
                        System.out.print("_");
                        break;
                }
            }
            System.out.println();
        }
    }
}
