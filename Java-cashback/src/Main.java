import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        double cashback = 0.0;
        float porcentagem = 0.0f; // Declare a variável fora dos blocos if-else

        // Solicita os dados
        System.out.printf("Olá, seja bem-vindo ao sistema de cálculo de Cashback da px.online! \nDigite o seu nome: ");
        String nome = leitor.nextLine();

        System.out.printf("Ótimo, %s! Para prosseguir, digite a sua idade: ", nome);
        int idade = leitor.nextInt();

        System.out.printf("Você se chama, %s, e tem %d anos\n", nome, idade);

        // Limpa o buffer de entrada
        leitor.nextLine();

        System.out.printf("%s, poderia nos informar o valor da sua compra: ", nome);
        float compra = leitor.nextFloat();

        // Calcula o cashback com base na idade e no valor da compra
        if (idade >= 21 && compra < 1000) {
            cashback = 0.05; // 5% de cashback
            porcentagem = 5.0f;
        } else if (idade < 21 && compra < 1000) {
            cashback = 0.07; // 7% de cashback
            porcentagem = 7.0f;
        } else if (idade >= 21 && compra >= 1000) {
            cashback = 0.07; // 7% de cashback
            porcentagem = 7.0f;
        } else if (idade < 21 && compra >= 1000) {
            cashback = 0.10; // 10% de cashback
            porcentagem = 10.0f;
        }

        // Calcula o valor final do cashback
        double valorCashback = compra * cashback;

        // Exibe o resultado
        System.out.printf("Usuário: %s\nIdade: %d\nValor da Compra: R$ %.2f\nCashback final: R$ %.2f\n", nome, idade, compra, valorCashback);
        System.out.printf("Foi aplicado %.1f%% de Cashback\n", porcentagem);

        // Fecha o Scanner
        leitor.close();
    }
}
