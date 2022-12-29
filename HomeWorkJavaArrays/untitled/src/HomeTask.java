import java.util.Random;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        //Создайте массив А[1..100] с помощью генератора случайных
        // чисел и выведите его на экран. Увеличьте все его элементы в 2 раза.
        //   firstLevelTaskOne();


        //С 8 до 20 часов температура воздуха измерялась ежечасно. Известно,
        // что в течение этого времени температура понижалась. Определите, в
        // котором часу была впервые отмечена отрицательная температура.
        //    firstLevelTaskTwo();

        //Создайте массив из пяти фамилий и выведите их на экран столбиком.
        //  firstLevelTaskThree();


        //В массиве, состоящем из N вещественных элементов (вводится из консоли),
        // после заполняется случайными числами, найти максимальный по модулю
        // элемент массива. Подсказка: модуль числа Math.abs(..)
//        firstLevelTaskFour();


        //Есть массив чисел. Создайте его сами, и наполните сами. Нужно напечатать на консоль:
        //значение каждой ячейки массива (пройтись циклом)
        //значение каждой ячейки всего массива с конца в начало
        //сумму значений всех ячеек
        //напечатать кого в массиве больше, четных или нечетных?
       // firstLevelTaskFive();


        //Все элементы массива поделить на значение наибольшего элемента этого массива.
        //Задача состоит из двух подзадач:
        //
        //
        //
        //Поиск максимума.
        //Деление на него элементов массива
        firstLevelTaskSix();


    }

    public static void firstLevelTaskOne() {
        Random randomNum = new Random();
        int[] tskOne = new int[100];
        for (int i = 0; i < tskOne.length; i++) {
            tskOne[i] = randomNum.nextInt(100);
            System.out.print(tskOne[i] + ", ");
            System.out.println((tskOne[i] * 2) + ", ");
        }

    }

    public static void firstLevelTaskTwo() {
        Random randomNum = new Random();
        int temperature = 10;
        int primaryHours = 8;
        int secondaryHours = 20;
        int[] tskTwo = new int[secondaryHours];
        for (int i = primaryHours; i < tskTwo.length + 1; i++) {
            tskTwo[i] = temperature;
            temperature--;
            if (temperature < 0) {
                System.out.println("temperature: " + temperature);
                System.out.println("time: " + i + " hours");
                break;
            }
        }
    }

    public static void firstLevelTaskThree() {
        String[] surnames = new String[]{"Moreno", "Rice", "Ruiz", "King", "Silva"};
        for (int i = 0; i < surnames.length; i++) {
            System.out.println(surnames[i]);
        }

    }

    public static void firstLevelTaskFour() {
        System.out.println("How many elements of the array are we generating?");
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int nums = scanner.nextInt();
        int[] numbers = new int[nums];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (random.nextInt(100)) - 50;
            System.out.println(numbers[i]);
        }
        for (int j = 0; j < numbers.length; j++) {
            if (numbers[j] > count) {
                count = Math.abs(numbers[j]);
            }
        }
        System.out.println("Result == " + count);
    }

    public static void firstLevelTaskFive() {
        System.out.println("Generating an array with numbers...");


        Random random = new Random();
        int[] numbs = new int[random.nextInt(10)];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = random.nextInt(100);
            System.out.println(numbs[i]);
        }
        System.out.println("array generated...");


        System.out.println("Numbers in reverse order::");
        for (int i = numbs.length - 1; i >= 0; i--) {
            System.out.println(numbs[i]);
        }

        System.out.println("Sum of all elements::");
        int count = 0;
        for (int s = 0; s < numbs.length; s++) {
            count += numbs[s];
        }
        System.out.println(count);

        System.out.println("Most in the array...");
        int even = 0;
        int odd = 0;
        for (int i = 0; i < numbs.length; i++) {
            if (numbs[i] % 2 == 0) {
                even++;
            } else if (numbs[i] % 2 > 0) {
                odd++;
            }
        }
        if (even > odd){
            System.out.println("Even numbers, their " + even);
        }else{
            System.out.println("Odd numbers, them " + odd);
        }
    }

    public static void firstLevelTaskSix(){
        System.out.println("Generating an array ...");
        Random random = new Random();
        int[] numbs = new int[random.nextInt(10)];
        for (int i = 0; i < numbs.length; i++) {
            numbs[i] = random.nextInt(100);
            System.out.println(numbs[i]);
        }
        System.out.println("array generated!");


        int largestNumber = 0;
        for (int i = 0; i < numbs.length; i++) {
            if(numbs[i] > largestNumber){
                largestNumber = numbs[i];
            }
        }
        System.out.println("largest number == " + largestNumber);


        System.out.println();
        System.out.println("The result of dividing by the largest number in the array is:");
        for (int i = 0; i < numbs.length; i++) {
            double a = numbs[i] / largestNumber;
            System.out.println(a);
        }

    }
}



