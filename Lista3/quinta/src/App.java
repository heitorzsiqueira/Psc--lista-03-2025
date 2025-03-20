import java.util.Scanner;

public class App {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Digite a operação (+, -, *, / ou ^): ");
        String operacao = scanner.next();

       
        double resultado;

        switch (operacao) {
            case "+":
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "-":
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "*":
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Erro: Divisão por zero!");
                } else {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                }
                break;
            case "^":
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado: " + resultado);
                break;
            default:
                System.out.println("Erro: Símbolo de operação inválido!");
                break;
        }


        scanner.close();
    }
}
