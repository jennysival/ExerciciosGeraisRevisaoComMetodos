import java.util.Scanner;

public class Ex1Calculos {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o 1º número:");
        int num1 = leitor.nextInt();

        System.out.println("Digite o 2º número:");
        int num2 = leitor.nextInt();

        calculoDoisNumeros(num1, num2);
    }

    public static void calculoDoisNumeros(int num1, int num2){
        int soma = num1+num2;
        int menos = num1-num2;
        int multi = num1*num1;
        int divi = num1/num2;

        System.out.println(num1+" + "+num2+" = "+soma);
        System.out.println(num1+" - "+num2+" = "+menos);
        System.out.println(num1+" x "+num2+" = "+multi);
        System.out.println(num1+" / "+num2+" = "+divi);

    }

}
