import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("-------------------------");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.println("Escolha uma das opções (1-2): ");

        int opcao = scanner.nextInt();
        double temperatura, resultado;

        switch (opcao){
            case 1:
                System.out.println("Digite a temperatura em Celsius: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura * 9/5) + 32;
                System.out.printf("%.2f°C = %.2f°F\n", temperatura, resultado);
                break;

            case 2:
                System.out.println("Digite a temperatura em Fahrenheit: ");
                temperatura = scanner.nextDouble();
                resultado = (temperatura - 32) * 5/9;
                System.out.printf("%.2f°F = %.2f°C\n", temperatura, resultado);
                break;

            default:
                System.out.println("Opção Inválida!");
        }
        scanner.close();
    }
}