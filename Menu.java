import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public static int printMenu(Scanner scanner) {
        System.out.println("Предлагаю вам следующие варианты действия с данной матрицей:\n\n" +
                "1. Повернуть на 90 градусов\n" +
                "2. Повернуть на 180 градусов\n" +
                "3. Повернуть на 270 градусов\n" +
                "4. Выход из программы\n\n" +
                "Для выбора функции выберите вариант и введите его номер:\n");
        int result = scanner.nextInt();
        return result;
    }
}
