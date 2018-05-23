/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Lista1Questao4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
    System.out.println("Digite um número ");
    int n1 = teclado.nextInt();
    System.out.println("Digite outro número ");
    int n2 = teclado.nextInt();
    int troca;
    troca= n1;
    n1= n2;
    n2= troca;
    System.out.println("Os valores estão trocados");
     System.out.println(n1); 
     System.out.println(n2);
    }
    
}
