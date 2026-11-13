import java.util.Scanner;
import java.util.Locale;


public class Lesson_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = scanner.nextLine();
        System.out.println("Введите год рождения: ");
        String birthDay = scanner.nextLine();
        System.out.println("Привет, " + name + ", " + birthDay);


        System.out.printf("%-12s %8s %10s%n", "Товар", "Цена", "Кол", "Сумма");
        System.out.println("-".repeat(38));
        System.out.printf("%-12s %8s %10s%n", "Хлеб", 35.0, 2, 70.0);
        System.out.printf("%-12s %y8s %10s%n", "Молоко", 89.5, 1, 89.5);
        System.out.printf("%-12s %8s %10s%n", "Сыр", 450.0, 1, 450.0);
        */

/*
        System.out.print("Введите имя: ");
        String userName = scanner.nextLine();

        System.out.print("Введите год рождения: ");
        if (scanner.hasNextInt()) {
            int age = scanner.nextInt();
            System.out.println("Привет, " + userName
                    + ", твой возраст: " + (2026 - age));
        } else {
            System.out.println("Введите число цифрами");
        }
 */


      //  Scanner scanner = new Scanner(System.in);
        System.out.println("Введите балл: ");

        Integer i;

        if (scanner.hasNextInt()) {
            int point = scanner.nextInt();

            if (point < 0 || point > 100) {
                System.out.println("Ошибка: Баллы должны быть от 0 до 100.");
            } else if (point > 89) {
                i = 5;
                System.out.println(i);
            } else if (point > 74) {
                i = 4;
                System.out.println(i);
            } else if (point > 59) {
                i = 3;
                System.out.println(i);
            } else {
                i = 2;
                System.out.println(i);
            }
        } else {
            System.out.println("Ошибка: Введите целое число.");
        }




/*        System.out.print("Введите значение: ");
         double d = scanner.nextDouble();
         System.out.print("Результат: " + d);*/
    }
}


