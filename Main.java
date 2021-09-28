import java.util.Random;

public class Main {
    public static final int FIELD_SIZE = 8;

    public static int[][] fillMatrix(int[][] colors, Random random) {
        for (int c = 0; c < FIELD_SIZE; c++) {
            for (int r = 0; r < FIELD_SIZE; r++) {
                colors[c][r] = random.nextInt(256);
            }
        }
        return colors;
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


    public static void main(String[] args) {
        Random random = new Random();

        int[][] colors = new int[FIELD_SIZE][FIELD_SIZE];
        int[][] rotatedColors = new int[FIELD_SIZE][FIELD_SIZE];


        fillMatrix(colors, random);
        printMatrix(colors);
        rotate90(colors,rotatedColors);
        printMatrix(rotatedColors);
        rotate180(colors, rotatedColors);
        printMatrix(rotatedColors);
        rotate270(colors, rotatedColors);
        printMatrix(rotatedColors);
    }
}
