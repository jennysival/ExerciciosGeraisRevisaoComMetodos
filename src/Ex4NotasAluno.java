import java.util.Scanner;

public class Ex4NotasAluno {
    public static void main(String[] args) {
        alunoMedia();

    }

    public static void alunoMedia(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        String nome = leitor.nextLine();

        System.out.println();
        
        int notas[] = new int[3];

        for(int i = 0; i < 3; i++){
            int numeral = i+1;
            System.out.println("Digite a nota da "+numeral+"ª prova: ");
            notas[i] = leitor.nextInt();
        }

        int soma = 0;

        for(int i = 0; i < 3; i++){
            soma = soma+notas[i];
        }

        int media = soma/3;

        System.out.println("----------------");
        System.out.println("Aluno: "+nome);
        System.out.println("Média: "+media);
        System.out.println("----------------");



    }
}
