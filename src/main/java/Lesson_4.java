import java.util.Scanner;


public class Lesson_4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        String birthDay = scanner.nextLine();
        System.out.println("Привет, " + name + ", " + birthDay);


        System.out.printf("%-12s %8s %10s%n", "Товар", "Цена", "Кол", "Сумма");
        System.out.println("-".repeat(38));
        System.out.printf("%-12s %8s %10s%n", "Хлеб", 35.0, 2, 70.0);
        System.out.printf("%-12s %8s %10s%n", "Молоко", 89.5, 1, 89.5);
        System.out.printf("%-12s %8s %10s%n", "Сыр", 450.0, 1, 450.0);
        System.out.printf("%-12s %8s %10s%n", "Товар", "Цена", "Кол", "Сумма");

    }
}


