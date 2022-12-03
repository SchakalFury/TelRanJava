import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
       // 1.) Написать программу, которая считывает с консоли (Scanner) строку и выводит на консоль ее длину
        System.out.println("Please enter something::");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println();
        System.out.println("Line length:: " + str.length());


        // 2) Написать метод который будет возвращать результат склейки двух строк. например:
        //вызывается метод со строками  "I love " и "Java" после этого метод вернет I love Java

        String str2 = methodForTaskTwo("I love", "Java");
       System.out.println(str2);


        //3) создайте 5 методов с разной сигнатурой, но с одинаковым названием метода;
        calculateVolume();
       calculateVolume(5);
       calculateVolume(5,5);
        calculateVolume(5, true);
        calculateVolume(5, false);
        calculateVolume(3,4,6);


//        4) напишите класс с методами для конвертации градусы цельсия в фаренгейты и метод для конвертации фаренгейтов в цельсия
//(Фаренгейт — 32) : 1,8 = Цельсий Пример: (50°F - 32) : 1,8 = 10°C
//Цельсий х 1,8 + 32 = Фаренгейт Пример: 10°C x 1,8 + 32 = 50°F

            ConvertClass convertClass = new ConvertClass();
            convertClass.celsius = 8;
           ConvertClass.convert(convertClass);

      //  5) напишите метод для получения суммы трех чисел
        int a = 16;
        int b = 3;
        int c = 1;
        System.out.println("Result :: " + calculate(a, b, c));
    }


    public static String methodForTaskTwo(String first, String second) {
        return first + " " + second;
    }

    public static void calculateVolume(int hight) {
        System.out.println("Cube Volume == " + Math.pow(hight, 3));
    }

    public static void calculateVolume(int hight, int length, int width) {
        System.out.println("Parallelepiped Volume == " + hight * length * width);
    }

    public static void calculateVolume(int radius, boolean sphere) {
        if (sphere) {
            System.out.println("Sphere Volume == " + (4 / 3) * Math.PI * Math.pow(radius, 2));
        }else{
            System.out.println("Regular Tetrahedron Volume == " + (Math.pow(radius, 3) * Math.sqrt(2)) / 12);
        }
    }


    public static void calculateVolume() {
        System.out.println("Something went wrong. Probably, you need to first select a three-dimensional figure for calculation. Restart the program and try again :)");
    }


    public static void calculateVolume(int radius, int hight) {
        System.out.println("Cylinder Volume == " + Math.PI * Math.pow(radius, 2) * hight);
    }

        public static int calculate(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
        }


}