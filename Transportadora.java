import java.util.Scanner;

public class Transportadora {
    public static double valorDoFrete(Transporte transporte, double peso, double altura, double largura, double distancia) {
        return transporte.calcularFrete(peso, altura, largura, distancia);
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o peso:");
        double peso = ler.nextDouble();

        System.out.println("Digite a altura:");
        double altura = ler.nextDouble();

        System.out.println("Digite a largura:");
        double largura = ler.nextDouble();

        System.out.println("Digite a distancia:");
        double distancia = ler.nextDouble();

        System.out.println("Escolha o transporte:");
        System.out.println("1 - Caminhao");
        System.out.println("2 - Aviao");
        System.out.println("3 - Porta Container");
        int opcao = ler.nextInt();

        Transporte transporte;

        if (opcao == 1) {
            transporte = new Caminhao();
        } else if (opcao == 2) {
            transporte = new Aviao();
        } else {
            transporte = new PortaContainer();
        }

        double frete = valorDoFrete(transporte, peso, altura, largura, distancia);

        System.out.printf("Valor do frete: R$ %.2f\n", frete);

        ler.close();
    }
}
