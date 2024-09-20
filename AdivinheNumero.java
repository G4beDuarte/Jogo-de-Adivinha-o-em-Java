import java.util.Random;
import java.util.Scanner;

public class AdivinheNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random numero = new Random();

        int sortearNumero = numero.nextInt(101);
        

        int tentativas = 1;
        boolean acertou = false;

        System.out.println("Seja Bem-Vindo ao jogo!");
        System.out.println("Escolha um número entre 1 e 100:(Você tem 5 tentativas!) ");
    

        for(;tentativas <= 5; tentativas++){
            int escolherNumero = ler.nextInt();
            if (sortearNumero == escolherNumero){
                System.out.println("PARABÉNS, VOCÊ ACERTOU!!!! ");
                System.out.println("Você acertou com " + tentativas + " tentativas");
                acertou = true;
                break;
            }
            else if(sortearNumero < escolherNumero){
                System.out.println("Você errou o numero sorteado é menor: (Você tem " + tentativas + " erros, de 5 tentativas!)");
            }
            else{
                System.out.println("Você errou o numero sorteado é maior: (Você tem " + tentativas + " erros, de 5 tentativas!)");
            }
        }
        if (tentativas > 5){
            System.out.println("Não foi dessa vez. Você perdeu!!!");
            System.out.println("O número escolhido era....." + sortearNumero);
        }
    }
}