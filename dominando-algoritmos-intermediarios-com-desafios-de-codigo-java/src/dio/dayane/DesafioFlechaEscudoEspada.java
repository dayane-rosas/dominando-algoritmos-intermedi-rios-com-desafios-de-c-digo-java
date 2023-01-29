/*
 * Você e seus amigos estão em uma aula de criação de jogos. 
 * Para inspirar os alunos e treinar, o professor pediu para 
 * que vocês fizessem um jogo que já existe com alguma modificação. 
 * A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação 
 * foi mudar Pedra para Flecha, Papel para Escudo e Tesoura para Espada.
 * Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:
 * 1 - Flecha
 * 2 - Escudo
 * 3 - Espada
 * A entrada vão ser dois números representando cada um dos parâmetros. 
 * Sendo a primeira entrada o jogador e a segunda o inimigo.
 * A saída deve ser se o jogador ganhou, empatou ou perdeu 
 * após a análise das duas entradas. A saída deve ser sem as aspas.
 */

package dio.dayane;

import java.util.Scanner;

public class DesafioFlechaEscudoEspada {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();

        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == 1) {

            if (jogadaInimigo == 1)
                System.out.println("Empatou");

            if (jogadaInimigo == 2)
                System.out.println("Perdeu");

            if (jogadaInimigo == 3)
                System.out.println("Ganhou");

        }

        if (jogadaJogador == 2) {

            if (jogadaInimigo == 1)
                System.out.println("Ganhou");

            if (jogadaInimigo == 2)
                System.out.println("Empatou");

            if (jogadaInimigo == 3)
                System.out.println("Perdeu");

        }

        if (jogadaJogador == 3) {

            if (jogadaInimigo == 1)
                System.out.println("Perdeu");

            if (jogadaInimigo == 2)
                System.out.println("Ganhou");

            if (jogadaInimigo == 3)
                System.out.println("Empatou");

        }

    }

}