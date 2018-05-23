/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista1;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Lista1Questao1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int soma = 0, n1, n2;
      Scanner teclado = new Scanner(System.in);
      System.out.println("Informe o primeiro Número");
      n1= teclado.nextInt();
      
      System.out.println("Informe o segundo Número");
      n2= teclado.nextInt();
      
      soma= n1+ n2;
         
      System.out.println("O resultado da Soma é ");
      System.out.println(soma);
      int difer= n1- n2;
      System.out.println("a subtração é");
      System.out.println(difer);
      int m= (n1+ n2)/2;
      System.out.println("a média é ");
      System.out.println(m);
      int p= n1* n2;
      System.out.println("O Produto é ");
      System.out.println(p);
      
    }
    
}
