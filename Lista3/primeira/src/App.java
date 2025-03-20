
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        Double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        Double num2 = sc.nextDouble();

        System.out.println("Digite o terceiro número: ");
        Double num3 = sc.nextDouble();

        double maior = Math.max(num1, Math.max(num2, num3));
        double menor = Math.min(num1, Math.min(num2, num3));
        

        double media = (num1 + num2 + num3) / 3;

        System.out.println("O maior número é : "+ maior +"\nO menor número é : "+ menor+"\nA média é : "+media);

    }
}
