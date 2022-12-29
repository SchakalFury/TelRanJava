import java.util.Random;
import java.util.Scanner;

public class HomeTask {

    public static void main(String[] args) {
        //1) Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //7 14 21 28 35 42 49 56 63 70 77 84 91 98
//        firstLevelTaskOne();

        //2) Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не
        // введёт 0. После ввода нуля, показать на экран количество чисел, которые были
        // введены, их общую сумму и среднее арифметическое. Подсказка: необходимо
        // объявить переменную-счетчик, которая будет считать количество введенных чисел,
        // и переменную, которая будет накапливать общую сумму чисел.


//        firstLevelTaskTwo();


        //3) Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь
        // с клавиатуры.  Например от 10 до 100
//        firstLevelTaskThree();

        //4)Создать программу, выводящую на экран случайно сгенерированное
        // трёхзначное натуральное число и его наибольшую цифру.
//        firstLevelTaskFour();

        //Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его цифр
        // (заранее не известно сколько цифр будет в числе).
       // firstLevelTaskFive();



        //Second level: 1)
        //сломанный лифт
        //лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
        // Лифт сломан. Каждый раз он поднимается на N этажей и спускается на M этажей. Если на
        // последнем подьеме лифт превысил колличество этажей, то считается что лифт поднялся на самый
        // верх. Найдите количество подьемов, которые понадобятся лифту.

        secondLevelTaskOne();

    }

    public static void firstLevelTaskOne(){
        int i = 7;
        while(i < 100){
            System.out.print(i + " ");
            i+=7;
        }
    }

    public static void firstLevelTaskTwo(){
        Scanner intScanner = new Scanner(System.in);
        int i = 0, numbersCount = 0, sum = 0;
        i = intScanner.nextInt();
        while (i != 0) {
            ++numbersCount;
            sum += i;
            i = intScanner.nextInt();
        }
        if(numbersCount != 0)
            System.out.printf("Count: %d, sum: %d, arithmetic mean: %f\n", numbersCount, sum, ((float)sum)/numbersCount);

        intScanner.close();
    }

    public static void firstLevelTaskThree(){

        int start = 0;
        int finish = 0;
        int sumUneven = 0;

        Scanner in = new Scanner(System.in);
        start = in.nextInt();
        finish = in.nextInt();

        int i = start;

        while (i <= finish)
        {
            if (i % 2 != 0)
            {
                System.out.println(i + " ");
                sumUneven += i;
            }
            i++;
        }
        System.out.println("\nSum of uneven numbers from " + start + " to " + finish + " = " + sumUneven);

    }

    public static void firstLevelTaskFour(){
        Random rand = new Random();
        int a = rand.nextInt(899) + 100;
        int first = a / 100;
        int secondBegin = a / 10;
        int second = secondBegin % 10;
        int third = a % 10;
        System.out.println ("Generated number == " + a);
        if (first > second && first > third) {
            System.out.println (first);
        } else if (second > first && second > third) {
            System.out.println (second);
        } else {
            System.out.println (third);
        }

    }

    public static void firstLevelTaskFive(){
        int n,s,i,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        if(sc.hasNextInt()) {
            n = sc.nextInt();
            b = n;
            s = 0;
            i = 0;
            while(n!=0) {
                s = s+n%10;
                n = n/10;
                i++;
            }
            System.out.println("Sum of digits in number: " + b + " = " + s + ", number of digits in it: " + i);
        } else {
            System.out.println("Incorrect input!");
        }
    }


    public static void secondLevelTaskOne(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of floors?");
        int h = scanner.nextInt();
        System.out.println("How much does it rise at one time?");
        int n = scanner.nextInt();
        System.out.println("how much does it drop?");
        int m = scanner.nextInt();

        int subtotal = 0;
        int numberOfLifts = 0;

        while(subtotal <= h){
            subtotal += n - m;
            numberOfLifts++;
        }
        System.out.println("the elevator needs to go up " + numberOfLifts + " times");
    }
}
