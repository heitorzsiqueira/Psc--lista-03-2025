
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random ran = new Random();

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);

        int aleatorio = ran.nextInt(maior - menor)+ menor;

        if (aleatorio % 2 == 0) {   
            System.out.println("O número "+aleatorio+" é par");
            
        }
        else{

            System.out.println("O número "+aleatorio+" é ímpar");
            
        }



        

    }
}
