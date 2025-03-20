import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Digite o coeficiente a: ");
        double a = sc.nextDouble();
        
        System.out.println("Digite o coeficiente b: ");
        double b = sc.nextDouble();
        
        System.out.println("Digite o coeficiente c: ");
        double c = sc.nextDouble();

       
        if (a == 0 && b == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente.");
        }
       
        else if (a == 0 && b != 0) {
            double raiz = -c / b; 
            System.out.println("Essa é uma equação de primeiro grau.");
            System.out.println("A raiz real da equação é: " + raiz);
        }
      
        else {
            double delta = b * b - 4 * a * c; 

            
            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais.");
            }
           
            else if (delta == 0) {
                double raiz = -b / (2 * a); 
                System.out.println("Esta equação possui duas raízes reais iguais.");
                System.out.println("A raiz única da equação é: " + raiz);
            }
            
            else {
                double raiz1 = (-b + Math.sqrt(delta)) / (2 * a); 
                double raiz2 = (-b - Math.sqrt(delta)) / (2 * a); 

                System.out.println("Esta equação possui duas raízes reais diferentes.");
                System.out.println("A primeira raiz é: " + raiz1);
                System.out.println("A segunda raiz é: " + raiz2);
            }
        }

        sc.close();
    }
}
