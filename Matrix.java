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
//        return colors;
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

    public static void rotate90(int[][] colors, int[][] rotatedColors) {
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                rotatedColors[c][r] = colors[FIELD_SIZE - 1 - r][c];
            }
        }
    }

    public static void rotate180(int[][] colors, int[][] rotatedColors) {
        int delta = FIELD_SIZE - 1;
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                rotatedColors[c][r] = colors[delta][FIELD_SIZE - 1 - r];
            }
            delta = delta - 1;
        }
    }

    public static void rotate270(int[][] colors, int[][] rotatedColors) {
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                rotatedColors[c][r] = colors[r][FIELD_SIZE - 1 - c];
            }
        }
    }
}
