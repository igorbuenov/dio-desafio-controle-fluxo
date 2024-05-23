import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o primeiro parâmetro: ");
        int parametroUm = scan.nextInt();
        System.out.print("Digite o segundo parâmetro: ");
        int parametroDois = scan.nextInt();

        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scan.close();
        }

    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException {

        if (paramUm > paramDois) {
            throw new ParametrosInvalidosException("O parâmetro dois deve ser maior que o parâmetro um!");
        }

        int contagem = paramDois - paramUm;
        for (int i = 1; i <= contagem ; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
