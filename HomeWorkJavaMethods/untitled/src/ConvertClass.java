public class ConvertClass {
    int celsius;
    int fahrenheit;


    public static void convert(ConvertClass convertClass){
        double c = (convertClass.fahrenheit - 32) / 1.8;
        double f = (convertClass.celsius * 1.8 + 32);
        System.out.println(c + "C --> " + f + "F");
    }

}
