package RPOVA;

import java.security.SecureRandom;

public class MegaSena {

    public static void main(String[] args) {
        String jogador1Nome = "Carlos";
        int[] jogador1Cartao = megasena();
        imprimirCartao(jogador1Nome, jogador1Cartao);

        String jogador2Nome = "Isabel";
        int[] jogador2Cartao = megasena();
        imprimirCartao(jogador2Nome, jogador2Cartao);
    }

    protected static void imprimirCartao(String jogador, int[] numeros) {
        System.out.print(jogador + ":");
        for (int numero: numeros)        {
            System.out.print(" " + numero);
        }
        System.out.println();
    }

    public static int[] megasena(){
        SecureRandom randomNumbers = new SecureRandom();
        int[] numeros = new int[6];
        int posicao = 0;
        while(posicao < 6){
            int sorteado = randomNumbers.nextInt(60);
            boolean repetido = false;
            for(int numero:numeros){
                if (numero == sorteado){
                    repetido = true;
                    break;
                }
            }


            if(!repetido){
                numeros[posicao] = sorteado;
                posicao++;
            }
        }
        return numeros;
    }

}