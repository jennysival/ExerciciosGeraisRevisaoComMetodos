import java.util.Scanner;

public class Ex2SeteNumeros {
    public static void main(String[] args) {
        seteNumeros();
    }

    public static void seteNumeros(){
        Scanner leitor = new Scanner(System.in);
        
        int vetorNum[] = new int[7];

        for(int i = 0; i < 7; i++){
            System.out.println("Digite um número:");
            vetorNum[i] = leitor.nextInt();
        }

        int menor = vetorNum[0];
        
        for(int i = 1; i < 7; i++){
            if(vetorNum[i] < menor){
                menor = vetorNum[i];
            }
        }

        System.out.println("O menor número digitado foi: "+menor);


    }
}
