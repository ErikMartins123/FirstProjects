import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Escolha uma das seguintes operações (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double resultado;
        switch(operator) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                if (num2 == 0){
                    System.out.println("Erro: divisão por zero!");
                    return;
                }
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação Inválida!");
                return;
        }

        System.out.println("Resultado: " + resultado);
        scanner.close();
    }
}