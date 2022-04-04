import java.util.Scanner;

public class Ex3Vendedor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário: ");
        String nome = leitor.nextLine();

        System.out.println("Digite o salário fixo de "+nome+": ");
        double salario = leitor.nextDouble();

        System.out.println("Digite o total de vendas que "+nome+" fez este mês: ");
        double vendaMensal = leitor.nextDouble();

        vendas(nome, salario, vendaMensal);
    }

    public static void vendas(String nome, double salario, double vendaMensal){

        double comissao = (vendaMensal*15)/100;
        double salarioFinal = comissao+salario;

        System.out.println("---------------------------");
        System.out.println("           VENDAS          ");
        System.out.println("---------------------------");

        System.out.println("Funcionário: "+nome);
        System.out.println("Salário fixo: "+salario);
        System.out.println("Comissão por venda: "+comissao);
        System.out.println("Valor total a receber: "+salarioFinal);
    }
}
