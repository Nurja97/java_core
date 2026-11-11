public class Homeworks {
    public static void main(String[] args) {

        //***Lesson_2***


        //1.
        System.out.println("\n1.:");
        String name = "Nurzhamal";
        int age = 29;
        double height = 166;
        double weight = 57.5;
        boolean isStudent = false;

        int t = age + 7;

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age + " and " + t);
        System.out.println("Рост: " + height);
        System.out.println("Вес: " + weight);
        System.out.println("Студент: " + isStudent);


        //2.
        System.out.println("\n2.:");
        byte b2 = Byte.MIN_VALUE;
        byte b3 = Byte.MIN_VALUE;

        System.out.println("byte:");
        System.out.println("Min: " + b2);
        System.out.println("Max: " + b3);

        System.out.println("\nshort:");
        System.out.println("Min: " + Short.MIN_VALUE);
        System.out.println("Max: " + Short.MAX_VALUE);

        System.out.println("\nint:");
        System.out.println("Min: " + Integer.MIN_VALUE);
        System.out.println("Max: " + Integer.MAX_VALUE);

        System.out.println("\nlong:");
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println("Max: " + Long.MAX_VALUE);

        System.out.println("\nfloat:");
        System.out.println("Min: " + Float.MIN_VALUE);
        System.out.println("Max: " + Float.MAX_VALUE);

        System.out.println("\ndouble:");
        System.out.println("Min: " + Double.MIN_VALUE);
        System.out.println("Max: " + Double.MAX_VALUE);


        //3.
        System.out.println("\n3.:");
        int i = Integer.MAX_VALUE;
        i = i + 1;
        System.out.println(i);

        //4.
        System.out.println("\n4.:");
        int a = 7;
        int b = 8;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
        System.out.println('a' + " " + 'b');



        //***Lesson_3***


        //1.
        System.out.println("\n1:");
        int number = 472;
        int first = number / 100;          // результат: 4
        int second = number % 10;            // результат: 2
        int third = (number / 10) % 10;    // результат: 7

        int sum = first + second + third;   // результат: 4 + 7 + 2
        System.out.println("Сумма цифр: " + sum);


        //2.
        System.out.println("\n2.:");
        int totalSeconds = 3725;

        int hours = totalSeconds / 3600;           // 1
        int minutes = (totalSeconds % 3600) / 60;  // 2
        int seconds = totalSeconds % 60;           // 5

        System.out.printf("Время: %02d:%02d:%02d%n", hours, minutes, seconds); //Время: 01:02:05


        //3.
        System.out.println("\n3.:");
        int a_3 = 10;
        double b_3 = a;
        System.out.println("Неявное приведение: " + b_3);

        double price = 9.99;
        int cut = (int) price;  // дробная часть отбрасывается, результат 9
        System.out.println("Явное приведение: " + cut);

        long rounded = (long)Math.round(price); // округление
        System.out.println("Math.round: " + rounded);

        int half = 5 / 2;
        double full = 5 / 2.0;
        System.out.println("5 / 2: " + half); // дробная часть отбрасывается: 2
        System.out.println("5 / 2: " + full); // результат дробный: 2.5

    }
}