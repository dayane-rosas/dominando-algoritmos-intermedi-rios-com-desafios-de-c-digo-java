/*
 * Um número feliz é um número definido pelo seguinte processo:
• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.
• Aqueles números para os quais esse processo termina em 1 são felizes.
• Retorna true se n for um número feliz e false se não for.
 * Escreva um algoritmo para determinar se o número n é feliz.
 * A entrada será feita por um número inteiro, correpondente 
 * ao valor de entrada para verificar se  o número é feliz ou não.
 * Retorne true, caso o número seja feliz, e retorne false, 
 * caso o número não seja feliz.
 */
package dio.dayane;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DesafioNumeroFeliz {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        boolean isHappy = false;

        Set<Integer> result = new HashSet<>();

        result.add(n);

        while (n != 1) {

            n = sumDigitSquare(n);

            if (result.contains(n)) {

                n = 0;

                break;

            }

            result.add(n);

        }

        if (n == 1) {

            isHappy = true;

        }

        if (n == 0) {

            isHappy = false;

        }

        System.out.println(isHappy);

    }

    private static int sumDigitSquare(int n) {

        int sq = 0;

        String num = Integer.toString(n);

        char[] dig = num.toCharArray();

        for (int x = 0; x < dig.length; x++) {

            int digit = n % 10;

            sq += digit * digit;

            n = n / 10;

        }

        return sq;

    }

}
