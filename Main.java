public class Main {
    public static void main(String[] args) {

        int[][] colors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];
        int[][] rotatedColors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];

        while (true) {
            System.out.println("Приветствую Вас! Я создала числовую матрицу размером 8х8 ячеек, заполненную случайными числами. Она перед вами:\n");

            Matrix.fillMatrix(colors, Matrix.random);
            Matrix.printMatrix(colors);

            int usersChoise = Menu.printMenu(Menu.scanner);

            switch (usersChoise) {
                case 4:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println();
                    Matrix.rotate90(colors,rotatedColors);
                    Matrix.printMatrix(rotatedColors);
                    break;
                case 2:
                    System.out.println();
                    Matrix.rotate180(colors, rotatedColors);
                    Matrix.printMatrix(rotatedColors);
                    break;
                case 3:
                    System.out.println();
                    Matrix.rotate270(colors, rotatedColors);
                    Matrix.printMatrix(rotatedColors);
                    break;
                default:
                    System.out.println("\nНекорректный вариант ввода!\n");
            }
        }
    }
}
