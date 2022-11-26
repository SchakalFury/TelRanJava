import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        //1.Создайте строку I love Java Lessons!
        String str = "I love Java Lessons!";

        //2.Распечатать первый символ строки. Используем метод String.charAt().
         System.out.println("2. " + str.charAt(0));

        //3.Проверить, содержит ли строка подстроку “love”. Используем метод String.contains().
        System.out.println("3. " + str.contains("love"));

        //4.Заменить все символы “o” на “a”.
        System.out.println("4. " + str.replace("o", "a"));

        //5.Преобразуйте строку к верхнему регистру.
        System.out.println("5. " + str.toUpperCase());

        //6.Преобразуйте строку к нижнему регистру.
        System.out.println("6. " + str.toLowerCase());

        //7.Вырезать строку Lessons c помощью метода String.substring().
        System.out.println("7. " + str.substring(11, 18));

        //8. Программу для подсчета какой индекс у символа 'L'
        int index = str.indexOf("L");
        System.out.println("8. " + index );

        //9. Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner и после
        // пишет на консоль “Hello …….. вместо многоточий имя.
        System.out.println("9. Enter your Name:: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        if (name != null) {
            System.out.println("Hello, " + name + "!");

        }else {
            System.out.println("Operation failed...");
        }

        //10. Напишите программу, которая спрашивает имя
        // и считывает его с консоли с помощью Scanner и после пишет "Ваше имя начинается с буквы …"

        System.out.println("10. Come on, type your name for me: ");
        Scanner scannerName = new Scanner(System.in);
        String writeName = scanner.nextLine();
        if (writeName != null) {
            System.out.println("Your name starts with a letter ==> " + writeName.charAt(0));

        }else {
            System.out.println("Operation failed...");
        }
        scanner.close();


        //11. имеется число 59.976, нужно вывести целое из него и перевести в int (явное преобразование типов)
        float number = 59.976f;
        int castNumber = 0;
        castNumber = (int) number;
        System.out.println("11. First number:: " + number + ", cast number:: " + castNumber);

        //12. перевести число 475 типа int в short
        int thisInt = 475;
        short castInt = (short) thisInt;
        System.out.println("12. short == " + castInt);

    }
}
