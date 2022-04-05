import java.util.Scanner;

public class Ex7VendaProduto {
    // Faça um programa que receba o preço de custo de um produto e
    // mostre o valor de venda. Sabe-se que o preço de custo receberá um
    // acréscimo de acordo com um percentual informado pelo usuário.

    public static void main(String[] args) {
        valorDeVendaProduto();
        
    }

    public static float valorDeVendaProduto(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto: ");
        float custo = leitor.nextFloat();

        System.out.println("Digite a porcentagem de lucro do produto: ");
        float porcentagemLucro = leitor.nextFloat();

        float valorFinal = ((custo*porcentagemLucro)/100)+custo;

        System.out.println("O preço final do produto é: R$"+valorFinal);

        return valorFinal;
    }
}
