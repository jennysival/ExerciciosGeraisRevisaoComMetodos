import java.util.Scanner;

public class Ex5Temperatura {
    // Ler uma temperatura em graus Celsius e apresentá-la convertida em
    // graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F
    // a temperatura em Fahrenheit e C a temperatura em Celsius.

    public static void main(String[] args) {
        conversaoTemp();

    }

    public static double conversaoTemp(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = leitor.nextDouble();
        
        double fahre = ((9*celsius)+160)/5;

        System.out.println("A temperatura digitada equivale à: "+fahre+" em graus Fahrenheit.");

        return fahre;

    }

}
