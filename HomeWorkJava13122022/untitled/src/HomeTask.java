import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask {
    public static void main(String[] args) {
        //1) В первом подъезде квартиры с 1 по 20. Во втором с 21 по 48.
        // В третьем с 49 по 90. Пользователь вводит номер квартиры.
        // Программа должна указать в каком подъезде находится данная
        // квартира.

        int entrance = inputMethod();
        theFirstTask(entrance);

        //2) Переменная num может принимать 4 значения: 1, 2, 3 или 4.
        // Если она имеет значение '1', то в переменную result запишем
        // 'зима', если имеет значение '2' – 'весна' и так далее. Решите
        // задачу через switch-case.

        int season = inputMethod();
        theSecondTask(season);

//      3)  В переменной month лежит какое-то число из интервала от 1 до
//      12. Определите в какую пору года попадает этот месяц (зима, лето,
//      весна, осень).

        int month = inputMethod();
        theThirdTask(month);


    }

    public static int inputMethod(){
        System.out.println("Please, enter the number::");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void theFirstTask(int entrance){
        if(entrance >= 1 && entrance <= 20 ){
            System.out.println("This first entrance");
        }else if(entrance >= 21 && entrance <= 48){
            System.out.println("This second entrance");
        } else if (entrance >= 49 && entrance <= 90) {
            System.out.println("This third entrance");
        }else {
            System.out.println("There is no such entrance, please re-enter");
        }
    }

    public static void theSecondTask(int season){
        String result;

        switch (season){
            case 1 -> {
                result = "Winter";
                System.out.println(result);

            }
            case 2 -> {
                result = "Spring";
                System.out.println(result);
            }
            case 3 -> {
                result = "Summer";
                System.out.println(result);
            }
            case 4  -> {
                result = "Autumn";
                System.out.println(result);
            }
            default -> {
                System.out.println("There is no such season. Retype");
            }
        }
    }

    public static void theThirdTask(int month){
        switch (month){
            case 12, 1, 2 -> {
                System.out.println("This Winter");
            }
            case 3, 4, 5 -> {
                System.out.println("This Spring");
            }
            case 6, 7, 8 -> {
                System.out.println("This Summer");
            }
            case 9, 10, 11 -> {
                System.out.println("This Autumn");
            }
            default -> {
                System.out.println("no such month");
            }
        }
    }
}
