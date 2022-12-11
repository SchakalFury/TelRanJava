import java.util.Scanner;

public class TaskToConditionalStatements {
    public static void main(String[] args) {
        //1) Введите с консоли два числа и выведите больше ли второе число чем   первое


//        long firstNumber = systemInputMethod("first");
//        long secondNumber = systemInputMethod("second");
//        task1(firstNumber, secondNumber);

        //2) Создайте метод, который принимает 2 числа и возвращает больше или равно первое число по сравнению со вторым

//        long numberFirst = systemInputMethod("first");
//        long numberSecond = systemInputMethod("second");
//        task2(numberFirst, numberSecond);

        //3) создайте метод который будет принимать 2 строки и писать возвращать строку, которая
        // составляется склеиванем первой половины первого слова и второй половины второго слова
        //Например
        //Вход : "привет" и "цветок". на выходе будет "приток". (при - первая половина от первого
        // слова, ток - вторая половина от второго слова)
//        String st1 = "Hanllo";
//        String st2 = "dlendler";
//        concateString(st1, st2);

    }

    public static long systemInputMethod(String taskStr) {
        System.out.println("1.Enter the " + taskStr + " number");
        Scanner scanner1 = new Scanner(System.in);
        long number = scanner1.nextLong();
        return number;
    }

    public static void task1(long firstNumber, long secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("The second number is less than the first");
        } else if (secondNumber > firstNumber) {
            System.out.println("The second number is greater than the first");
        } else if (secondNumber == firstNumber) {
            System.out.println("The numbers are equal");
        }
    }

    public static void task2(long firstNumber, long secondNumber) {
        if (firstNumber > secondNumber) {
            System.out.println("The first number is greater than the second");

        } else if (firstNumber == secondNumber) {
            System.out.println("These numbers are equal");
        }

    }

    public static void concateString(String str1, String str2){
        System.out.println((str1.substring(0, str1.length()/2)) + str2.substring(str2.length()/2, str2.length()));

    }
}