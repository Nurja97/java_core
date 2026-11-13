import java.util.Scanner;


public class Hello {
    public static void main(String[] args) {
/*        int age = 19;
        boolean hasTicket = true;

        if (age > 18) {
            System.out.println("Доступ разрешен");
        } else {
            System.out.println("Доступ запрещен");
        }
        if (hasTicket) {
            System.out.println("Добро пожаловать в кино");
        }

        System.out.println("Конец");*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = Integer.parseInt(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Не четное число");
        }*/



/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку: ");
        int score = Integer.parseInt(scanner.nextLine());

        String s;
        if (score > 89) {
            s = "Отлично";
        } else if (score > 74) {
            s = "Хорошо";
        } else if (score > 59) {
            s = "Пойдет";
        } else {
            s = "Пересдача";
        }
        System.out.println(s);*/
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int number = Integer.parseInt(scanner.nextLine());

        if ( number == 0) {
            System.out.println("0");
        } else if (number % 2 == 0 && number > 0) {
            System.out.println("Четное число, Положительное");
        } else if (number % 2 != 0  && number < 0) {
            System.out.println("Не четное число, Отрицательное");
        } else if (number % 2 == 0 && number < 0) {
            System.out.println("Четное число, Отрицательное");
        } else if (number % 2 != 0  && number > 0) {
            System.out.println("Не четное число, Положительное");
        }*/

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите свое решение (Да/Нет): ");
        String s  =  scanner.nextLine();

        if ("Да".equalsIgnoreCase(s)){
            System.out.println("Введли да");
        } else if ("Нет".equalsIgnoreCase(s)){
            System.out.println("Введли нет");
        } else System.out.println("гггг");*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a  =  Integer.parseInt(scanner.nextLine());
        System.out.println("Введите число b: ");
        int b  =  Integer.parseInt(scanner.nextLine());
        System.out.println("Введите число c: ");
        int c  =  Integer.parseInt(scanner.nextLine());

        if ( a > b && a < c ) {
            System.out.println("Max b");
        } else if (b > a && b > c) {
            System.out.println("Max b");
        } else  if (c > a && c > b) {
            System.out.println("Max c");
        } else {
            System.out.println("All ");
        }
    }
}
