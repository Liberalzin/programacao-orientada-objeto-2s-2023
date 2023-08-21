import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");
        int choice = scanner.nextInt();

        double result = 0.0;

        switch (choice) {
            case 1:
                System.out.print("Digite a temperatura em Celsius: ");
                double celsius = scanner.nextDouble();
                result = celsiusToFahrenheit(celsius);
                System.out.println("Temperatura em Fahrenheit: " + result);
                break;
            case 2:
                System.out.print("Digite a temperatura em Fahrenheit: ");
                double fahrenheit = scanner.nextDouble();
                result = fahrenheitToCelsius(fahrenheit);
                System.out.println("Temperatura em Celsius: " + result);
                break;
            default:
                System.out.println("Escolha inválida.");
                System.exit(1);
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}