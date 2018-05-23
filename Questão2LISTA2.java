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
public class Questão2LISTA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe os lados do Triângulo");
        double n1 = teclado.nextDouble();
        double n2 = teclado.nextDouble();
        double n3 = teclado.nextDouble();
        if ((n1 == n2) && (n2 == n3)) {
            System.out.println("É um triângulo!");
            System.out.println("É um triângulo Equilatero");
        } 
        else if ((n1 == n2 && n2 != n3) || (n3 == n1)) {
            System.out.println("trata se de um triângulo isosceles");
        } 
        else if ((n2 != n3) && (n3 != n1)) {
            System.out.println("É um triângulo escaleno");
        }

    }
}
