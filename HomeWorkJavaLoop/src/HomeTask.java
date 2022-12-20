import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        //1) пользователь вводит с консоли (Scanner) 2 числа (2 года)
        //написать программу, которая считает сколько годов между двумя числами високосные
        //Например
        //(2000,2022) -> 6 ( для простоты считайте что год високосный если делится на 4 без остатка)

//        int firstYear = inputMethod("first");
//        int secondYear = inputMethod("second");
//        firstLevelTaskOne(firstYear, secondYear);
//
//
//        //2) Вывести на консоль те двузначные числа которые делятся на 4, но не делятся на 6.
//        firstLevelTaskTwo();

        //4) Вывести на консоль сумму чисел от 0 до 100
//        firstLevelTaskThree();

        //5) Вывести на консоль числа от -10 до -40.
//            firstLevelTaskFour();

//       6) Вывести на консоль произведение двузначных нечетных чисел кратных 13.
//            firstLevelTaskFive();


//       7) Необходимо написать программу, которая проверяет пользователя на знание таблицы умножения.
//       Пользователь сам вводит два
//       целых однозначных числа. Программа задаёт вопрос: результат умножения первого числа на второе.
//       Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет. Если нет
//       – показать еще и правильный результат.

//        int first = inputMethod("first");
//        int second = inputMethod("second");
//        System.out.println("what do you think is the result?");
//        int answer = inputMethod("answer");

//        firstLevelTaskSix(first, second, answer);

    //8) напишите программу, которая проверяет является ли число простым
    //   Простое число - число которое делится только на 1 и на самого себя
    //   Например число 17 - просто оно делится только на 1 и на 17
    //   число 6 не простое - оно делится на 1, 2, 3 и 6
    //   Подсказка - используйте цикл чтобы проверить сколько чисел меньше данного числа делится без остатка
//           firstLevelTaskSeven(inputMethod("natural"));

//      1) написать программу которая выводит результат умножения одного числа на другое, не используя знак умножения. только знаки сложения
//      Подсказка: 5 умножить на 3 = 5+5+5. (используйте цикл)

 //       secondLevelTaskOne(inputMethod("multiplied"), inputMethod("degree"));


//      2) вывести на консоль среднее значение всех нечетных чисел от 0 до 100
//      Подсказка: сначала нужно в цикле посчитать сумму, после цикла разделить сумму на количество элементов
 //       secondLevelTaskTwo();

//        3) Высчитать факториал числа n. Факториал 5 = 1 * 2 * 3 * 4 * 5
 //       secondLevelTaskThree(5);

        //4) Дана строка из 3-х цифр. Найдите сумму этих цифр. То есть сложите как числа первый символ строки, второй и третий.
        //   подсказка:
        //Если забыли какой метод может помочь, посмотрите презентацию лекции c методами у String (в конце 4 лекции)
        //метод Integer.parseInt() чтобы перевести в int

//        secondLevelTaskFour(inputMethod("three-digit"));

      //  int result = inputMethod("natural");


        //5) Дана строка из 6-ти цифр. Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр. Если
        // это так - выведите 'да', в противном случае выведите 'нет'.
        //   в данной задаче нужно использовать 2 сумматора и дополнительно метод if чтобы проверить когда нам нужно
        //   складывать к первому сумматору, а когда ко второму

// не успел :)


}

    public static int inputMethod(String name){
        System.out.println("Enter the " + name + " number::");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void firstLevelTaskOne(int firstYear, int secondYear){
        int result = 0;
      for (int i = firstYear; i < secondYear; i++){
          if (i % 4 == 0){
              result += 1;
          }
      }
        System.out.println("[" + firstYear + ", " + secondYear + "]" + " ===> " + result);
    }

    public static void firstLevelTaskTwo(){
        for (int i = 10; i < 100; i++){
            if((i % 4 == 0) && (i % 6 > 0)){
                System.out.println(i);
            }
        }
    }

    public static void firstLevelTaskThree(){
        int result = 0;
        for(int i = 0; i < 100; i++){
            result += i;
        }
        System.out.println("All amount:: " + result);
    }


    public static void firstLevelTaskFour(){
        for(int i = -10; i >= -40; i--){
            System.out.println(i);
        }
    }

    public static void firstLevelTaskFive(){
        int result = 1;
        for(int i = 10; i <= 100; i++){
            if((i % 2 > 0) && (i % 13 == 0)){
                System.out.println(i);
                result *= i;
            }
        }
        System.out.println("Result:: " + result);
    }

    public static void firstLevelTaskSix(int first, int second, int answer) {

        int result = first * second;
        if (result <= 100 && result >= 0) {
            if (result == answer) {
                System.out.println("Congratulations, you know the multiplication table well!");
            } else {
                System.out.println("\n" +
                        "Alas, wrong.\n" +
                        "Correct answer::" + result);
            }
        }else{
            System.out.println("Something went wrong. You may have entered a negative or two-digit number. Try again");
        }
    }

    public static void firstLevelTaskSeven(int naturalNumber){
        int firstDelimiter = naturalNumber + 1;
        int secondDelimiter = 0;

        for (int i = 1; i <= naturalNumber; i++){
            if(naturalNumber % i == 0){
                System.out.println(i);
                secondDelimiter += i;
            }
        }

        if(firstDelimiter == secondDelimiter){
            System.out.println("\n" +
                    "This number is a natural");
        }else{
            System.out.println("This number is not natural");
        }
    }

    public static void secondLevelTaskOne(int multiplied, int degree){
        int result = 0;
        for(int i = degree; i > 0; i--){
            result +=multiplied;

        }
        System.out.println("Result == " + result);
    }

    public static void secondLevelTaskTwo(){
        int sum = 0;
        int amount = 0;
        int result = 0;

        for(int i = 0; i < 100; i++){
            if(i % 2 > 0){
                sum += i;
                amount++;
                System.out.println(i);
            }
        }
        result = sum / amount;
        System.out.println("Sum == " + sum);
        System.out.println("Amount == " + amount);
        System.out.println("result == " + result);
    }

    public static void secondLevelTaskThree(int factorial){
        int sum = 1;
        for (int i = 1; i < factorial + 1; i++){
            sum *= i;
        }
        System.out.println("Factorial " + factorial + " ==> " + sum);
    }

    public static void secondLevelTaskFour(int number){
        int sum = 0;
        while(number != 0){
            sum += (number % 10);
            number/=10;
        }
        System.out.println("Sum == " + sum );
    }



}

