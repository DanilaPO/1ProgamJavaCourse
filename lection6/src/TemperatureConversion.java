import java.util.Scanner;

public class TemperatureConversion {
    public static double convertToKelvin(double celsiusTemperature) {
        return celsiusTemperature + 273.15;
    }

    public static double convertToFahrenheit(double celsiusTemperature) {
        return celsiusTemperature * 9 / 5 + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в Цельсиях: ");
        double celsiusTemperature = scanner.nextDouble();

        System.out.println(convertToKelvin(celsiusTemperature) + " Кельвин");
        System.out.println(convertToFahrenheit(celsiusTemperature) + " Фаренгейт");
    }
}
