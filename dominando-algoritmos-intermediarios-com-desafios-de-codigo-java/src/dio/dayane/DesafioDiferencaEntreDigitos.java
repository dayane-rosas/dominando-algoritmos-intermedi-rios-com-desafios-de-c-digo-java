/*
 * O desafio consiste em um número inteiro n, onde será necessário
 *  calcular a diferença entre o produto e a soma dos seus digitos.
 • Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
 • A soma, basta realizar uma adição entre os dígitos.
 • A diferença, é necessário substrair o resultado final dos dois valores.
 * A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.
 */

package dio.dayane;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioDiferencaEntreDigitos {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int soma = 0;

        int multiplicacao = 1;

        int diferenca = 0;

        int numero = scan.nextInt();

        String numeroParaString = String.valueOf(numero);

        String[] vetor = numeroParaString.split("");

        for (int i = 0; i < vetor.length; i++) {

            int item = Integer.parseInt(vetor[i]);

            soma = soma + item;

            multiplicacao = multiplicacao * item;

        }

        diferenca = multiplicacao - soma;

        System.out.println(diferenca);

    }

}
