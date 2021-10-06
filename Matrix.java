import java.util.Random;

public class Matrix {
    public static final int FIELD_SIZE = 8;
    static Random random = new Random();


    public static void fillMatrix(int[][] colors, Random random) {
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                colors[c][r] = random.nextInt(256);
            }
        }
    }

    public static void printMatrix(int[][] colors) {
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                System.out.format("%4d", colors[c][r]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] rotate90(int[][] colors) {
        int[][] rotatedColors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                rotatedColors[c][r] = colors[FIELD_SIZE - 1 - r][c];
            }
        }
        return rotatedColors;
    }

    public static int[][] rotate180(int[][] colors) {
        int[][] rotatedColors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];
        int delta = FIELD_SIZE - 1;
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                rotatedColors[c][r] = colors[delta][FIELD_SIZE - 1 - r];
            }
            delta = delta - 1;
        }
        return rotatedColors;
    }

    public static int[][] rotate270(int[][] colors) {
        int[][] rotatedColors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                rotatedColors[c][r] = colors[r][FIELD_SIZE - 1 - c];
            }
        }
        return rotatedColors;
    }
}
