import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Operacoes operacoes = new Operacoes();

        System.out.println("Digite qual o raio do circulo: ");
        double raio = sc.nextDouble();

        for(boolean verificar = true;verificar == true;){

        System.out.println("Digite qual operação deseja realizar: \n1: Calcular perímetro do círculo.\n2: Calcular área do círculo.\n3: Calcular volume da esfera.");
        int operacao = sc.nextInt();
        sc.nextLine();

        operacoes.Operacoes(raio);

        switch (operacao) {
            case 1:
               System.out.println("O perímetro do circulo é de: "+ operacoes.getPerimetro());
                break;
            case 2:
            System.out.println("A área do circulo é de: "+ operacoes.getArea());
                break;
             case 3:
             System.out.println("O volume do circulo é de: "+ operacoes.getVolune());
                break;
        
            default:
            System.out.println("O código da operação é inválido");
                break;
        }
        System.out.println("Deseja fazer mais um cálculo? s/n");
        String repetir = sc.nextLine();
        
        if (repetir.equals("n")) {  

            verificar = false;

        }
        else if(repetir.equals("s")) {
            verificar = true;
        }

    }

    }
}
