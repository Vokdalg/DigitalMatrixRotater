public class Main {
    public static void main(String[] args) {

        int[][] colors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];
        int[][] rotatedColors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];


        Matrix.fillMatrix(colors, Matrix.random);
        Matrix.printMatrix(colors);
        Matrix.rotate90(colors,rotatedColors);
        Matrix.printMatrix(rotatedColors);
        Matrix.rotate180(colors, rotatedColors);
        Matrix.printMatrix(rotatedColors);
        Matrix.rotate270(colors, rotatedColors);
        Matrix.printMatrix(rotatedColors);
    }
}
