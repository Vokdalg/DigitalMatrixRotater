public class Main {
    public static void main(String[] args) {

        int[][] colors = new int[Matrix.FIELD_SIZE][Matrix.FIELD_SIZE];
        int[][] rotatedColors;

        while (true) {
            System.out.println("Приветствую Вас! Я создала числовую матрицу размером 8х8 ячеек, заполненную случайными числами. Она перед вами:\n");

            Matrix.fillMatrix(colors, Matrix.random);
            Matrix.printMatrix(colors);

            int usersChoise = Menu.printMenu(Menu.scanner);

            switch (usersChoise) {
                case 4:
                    return;
                case 1:
                    System.out.println();
                    rotatedColors = Matrix.rotate90(colors);
                    break;
                case 2:
                    System.out.println();
                    rotatedColors = Matrix.rotate180(colors);
                    break;
                case 3:
                    System.out.println();
                    rotatedColors = Matrix.rotate270(colors);
                    break;
                default:
                    System.out.println("\nНекорректный вариант ввода!\n");
                    continue;
            }
            Matrix.printMatrix(rotatedColors);
        }
    }
}
