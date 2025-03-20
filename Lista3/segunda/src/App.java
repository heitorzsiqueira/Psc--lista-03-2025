import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Compra compra = new Compra();
        int[] notasvalidas = {2,5,10,20,50};
        int[] notasusadas = new int[notasvalidas.length];
        int index = 0;

        System.out.println("Digite o nome do produto: ");
        String produto = sc.nextLine();

        System.out.println("Digite o valor do produto: ");
        Double valor = sc.nextDouble();

        System.out.println("Digite qual o valor você deseja pagar");
        Double valorpago = sc.nextDouble();

        compra.Compra(produto, valor, valorpago);

        Double troco = compra.getTroco();

        for(int i = notasvalidas.length - 1; i >= 0; i--){
            if(notasvalidas[i] <= troco ){
                notasusadas[index] = notasvalidas[i];
                troco -= notasusadas[index];
                index ++;
            }

        }

        System.out.println("O produto a ser pago é : "+ compra.getProduto()+"\nO valor a ser pago é : "+ compra.getValor()+"\nO valor já pago é : "+compra.getValorPago()+ "\nO troco é de :"+compra.getTroco()+" pago em notas de :") ;       

        for(int i = 0;i < notasusadas.length;i++){
            System.out.println("R$: "+notasusadas[i]);
        }

        sc.close();
    }

}
