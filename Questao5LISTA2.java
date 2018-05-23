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
public class Questao5LISTA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado = new Scanner (System.in);
         
        System.out.println("informe os números para cada opção abaixo"); 
        System.out.println("1. Soma");
        System.out.println("2. Média");
        System.out.println("3. Multiplicação");
        System.out.println("informe o número para opção desejada");
       int opcao = teclado.nextInt();
         System.out.println("");
    
        System.out.println("Informe o primeiro número ");
        int n1 = teclado.nextInt();
         System.out.println("Informe o segundo número");
        int n2 = teclado.nextInt();
         System.out.println("Informe o terceiro números: ");
        int n3 = teclado.nextInt();
         System.out.println("");
    
        switch (opcao){
            case 1:{
               int soma = n1 + n2 + n3;
                System.out.println("a soma dos números é" + soma);
                System.out.println("");
                break;
            }    
             
            case 2:{
             int   media = (n1 + n2 + n3) / 3;
                System.out.println("a média é: " + media);
                System.out.println("");
                break;
            }    
             
            case 3:{
             int   mult = n1 * n2 * n3;
                System.out.println(" a multiplicação dos numeros é " + mult);
                System.out.println("");
                break;
            }    
            default:{
                System.out.println("Opção invalida!");
                System.out.println("");
                break;
        }    
      }
   }
    
}
