import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {


        System.out.println("9. Enter sum:: ");
        Scanner scanner = new Scanner(System.in);
        double sum = scanner.nextDouble();
        euroToUsd(sum);
        usdToEuro(sum);


    }

    public static void euroToUsd(double usd) {
        double euro = usd / 1.02;
        System.out.println(euro + " Euro --> Usd" + usd);
    }
    public static void usdToEuro(double eur) {
        double usd = eur * 1.02;
        System.out.println(usd + " Usd --> Euro == " + eur);
    }
 }
