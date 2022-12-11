import java.util.Random;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {

        //FIRST_LEVEL

        // 1) С консоли вводится число - возраст человека
        //после чего вызывается метод, который возвращает
        // ответ можно ли этому человеку смотреть фильм,
        // у фильма ограничение по возрасту не меньше 18.
        //Пример:
        //на входе число 19 пишется Можно идти смотреть кино
        //на входе число 7 пишется Нельзя идти смотреть кино
//        System.out.println("1. Please, enter Age::");
//        firstTask(systemInputMethod());

        //2) напишите программу, которая принимает 1 число - год
        // (можно с помощью Scanner или с помощью Random) и выводит
        // високосный год или нет

//        System.out.println("2. Please enter a year");
//        secondTask(systemInputMethod());

//        3)Покупатель приходит в магазин печенья, 1 печенье стоит 0.5 евро
//        Напишите программу которая спрашивает у покупатель сколько он хочет
//        купить печенья, после этого с помощью Scanner считывается число
//        сколько печенья хочет купить покупатель, после спрашивается сколько
//        денег у покупателя и считывается число (сколько денег у покупателя),
//        программа должна написать может ли купить столько печенья за такие
//        деньги, например
//        покупатель хочет купить 10 печенек, у него 4 евро ответ  нельзя
//        покупатель хочет купить 12 печенек, у него 8 евро ответ  можно

//        System.out.println("3.Hello. How many cookies do we want? (things)");
//        long things = systemInputMethod();
//        System.out.println("How much are you willing to spend?(EUR)");
//        long spend = systemInputMethod();
//        thirdTask(things, spend);

        //) напишите программу, которая говорит выпал орел или решка
        //true - орел
        //false -решка
        //используйте Random и метод nextBoolean,

//        System.out.println("4. You got::");
//        fourthTask();


        //5) стране А ездят машины с номерами от 1 до 10000, в городе Б большая
        // проблема с парковками по выходным, чтобы уменьшить количество пробок,
        // власти решили пускать в город по выходным только легковые машины с четными
        // номерами, напишите программу, которая принимает на вход два параметра:
        // номер машины и isLorry (грузовая машина или нет), в результате программа
        // выводит можно заезжать машине или нет в город

//        System.out.println("5. Write number::");
//        long numberAuto = systemInputMethodLong();
//        System.out.println("Is it a truck? Type (true) - yes, (false) - not");
//        boolean isLorry = systemInputMethodBoolean();
//        fifthTask(numberAuto, isLorry);

        //SECOND_LEVEL

//1)
//пользователь вводит с консоли с помощью сканера 3 числа, после чего находится
// максимальное число среди этих трех чисел (используйте if/else if /else и операции сравнения)


//        System.out.println(" Enter the first number::");
//        long first = systemInputMethodLong();
//        System.out.println("Enter second number::");
//        long second = systemInputMethodLong();
//        System.out.println("Enter the third number::");
//        long third = systemInputMethodLong();
//        secondLevelFirstTask(first, second, third);

        //2)
        //Есть устройство, на табло которого показывается количество секунд, оставшихся до конца
        // рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает
        // «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000»
        // (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается
        // «0» (т.е. рабочий день закончился).
        //Некоторый сотрудники не умеют оценивать остаток рабочего дня в секундах.
        //Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные
        // фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
        //Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
        //Обьяснение: в переменную n должно записываться случайное (на время тестирования программы)
        // целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех, кто
        // понимает в секундах) и на следующей строке (для тех кто не понимает) должна выводиться
        // фраза о количестве полных часов, содержащихся в n секундах.

//        long test = generateRandomInt(28801);
//        double testResult = test/ 3600;
//        System.out.println("Seconds left:" + test);
//        System.out.println("Hours left::" + testResult);

        //3) в том же городе Б решили доработать систему с пробками и решили усовершенствовать систему
        // проезда в город, теперь в выходные могут заезжать только легковые автомобили с четными номерами,
        // а в будни все грузовые, а так же машины с нечетными номерами. Напишите программу, которая
        // принимает 3 параметра isWeekend, isLorry, carNumber и пишет можно ли заезжать этой машине
        //4) Бонусная задача: допишите программу, чтобы она говорила почему нельзя заезжать этой машине, например
        //в выходной день пыталась заехать грузовая машина, ответ - в выходные грузовым нельзя

//        System.out.println("Day off today? Type (true) - yes, (false) - not");
//        boolean isWeekend = systemInputMethodBoolean();
//        System.out.println("Is it a truck? Type (true) - yes, (false) - not");
//        boolean isLorry = systemInputMethodBoolean();
//        System.out.println("Vehicle number::");
//        long carNumber = systemInputMethodLong();
//        secondLevelTaskThirdAndFour(isWeekend, isLorry, carNumber);

    }

    public static long systemInputMethodLong() {
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        return number;
    }

    public static boolean systemInputMethodBoolean() {
        Scanner scanner = new Scanner(System.in);
        boolean isLorry = scanner.nextBoolean();
        return isLorry;
    }


    public static void firstTask(long age) {
        if (age <= 0 || age >= 128) {
            System.out.println("Invalid input. Try again");
        }
        if (age < 18) {
            System.out.println("Can't go watch this movie");
        } else if (age >= 18 && age <= 128) {
            System.out.println("Can you go watch this movie");
        }

    }

    public static void secondTask(long age) {
        if (age < 0) {
            System.out.println("Invalid input!");
        } else if (age % 4 == 0) {
            System.out.println("This year is a leap year!");
        } else if (age % 4 > 0) {
            System.out.println("This year is NOT a leap year");
        }
    }

    public static void thirdTask(long things, long spends) {
        if (things <= 0 || spends <= 0) {
            System.out.println("Invalid error! Try again!");
        } else {
            double priceCoockie = 0.5;
            double totalPrice = priceCoockie * things;
            if (spends <= totalPrice) {
                System.out.println("Congratulations. You can buy cookies :)");
            } else {
                System.out.println("Sorry, you don't have enough funds.");
            }
        }

    }

    public static void fourthTask() {
        int coin = 11;
        int side = generateRandomInt(11);
        if (side >= 0 && side <= 5) {
            System.out.println("TRUE");
        } else if (side <= 10 && side >= 6) {
            System.out.println("FALSE");
        }
    }

    public static int generateRandomInt(int upperRange) {
        Random random = new Random();
        return random.nextInt(upperRange);
    }

    public static void fifthTask(long number, boolean isLorry) {
        int from = 1;
        int before = 10000;
        if (number < from || number > before) {
            System.out.println("Invalid input.Try again");
        } else if (number % 2 == 0 && !isLorry) {
            System.out.println("Entry allowed");
        } else {
            System.out.println("No entry!");
        }
    }

    public static void secondLevelFirstTask(long first, long second, long third) {
        if (first > second && first > third) {
            System.out.println("First == > " + first);
        } else if (second > first && second > third) {
            System.out.println("Second ==> " + second);
        } else if (third > first && third > second) {
            System.out.println("Third ==> " + third);
        }
    }

    public static void secondLevelTaskThirdAndFour(boolean isWeekend, boolean isLorry, long carNumber){
        if (carNumber < 0 || carNumber > 10000){
            System.out.println("Invalid car number! Try again");
        }else if (isWeekend && !isLorry && (carNumber % 2 == 0)){
            System.out.println("Entry allowed");
        }else if (isWeekend && !isLorry && (carNumber % 2 != 0)){
            System.out.println("Entry prohibited, on weekends entry only with odd numbers!");
        }else if (isWeekend && isLorry) {
            System.out.println("No Entry, weekend trucks are not allowed to enter!");
        }else if(!isWeekend){
            System.out.println("Entry allowed");
        }

    }
}