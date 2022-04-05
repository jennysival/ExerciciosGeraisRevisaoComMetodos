import java.util.Scanner;

public class Ex6DolarReal {
    //Elaborar um programa que efetue a apresentação do valor da
    // conversão em real (R$) de um valor lido em dólar (US$). O algoritmo
    // deverá solicitar o valor da cotação do dólar e também a quantidade
    // de dólares disponíveis com o usuário.

    public static void main(String[] args) {
        conversaoDolarEmReal();
        
    }

    public static float conversaoDolarEmReal(){
    Scanner leitor = new Scanner(System.in);

    System.out.println("Qual a cotação do dólar(US$) no dia de hoje? ");
    float cota = leitor.nextFloat();

    System.out.println("Quantos dólares(US$) deseja converter para Real(R$)? ");
    float dolar = leitor.nextFloat();

    float real = dolar/cota;

    System.out.println("Você acabou de converter "+dolar+" dólares(US$) no total de "+real+" reais(R$)");

    return real;


    }
}
