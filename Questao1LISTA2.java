/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Questao1LISTA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um Número");
        int n1 = teclado.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("o número é par");
        } else {
            System.out.println("o número é impar!");
        }
        if(n1>0){
            System.out.println("o número é positivo");
        }
             else if (n1 < 0){
            System.out.println("o número é negativo");
            }
        
    }

}
