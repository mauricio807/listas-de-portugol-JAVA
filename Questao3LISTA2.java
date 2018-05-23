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
public class Questao3LISTA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado= new Scanner(System.in);
      System.out.println("Digite a primerio Nota");
      int n1 =teclado.nextInt();
      System.out.println("Digite o Segundo Nota");
      int n2 =teclado.nextInt();
      System.out.println("Digite a Terceira Nota");
      int n3 =teclado.nextInt();
      int media=(n1 + n2 + n3)/3;
      if((n1>=n2) && (n2>n3)){
      System.out.println("A maior nota é ");
      System.out.println(n1);
      }
      else if ((n2>=n3) && (n2>n1)){
    System.out.println("a maior nota é ");
    System.out.println(n2);
              }       
      else if ((n3>=n2) && (n3>n1)){
    System.out.println("a maior nota é "+n3+"");
      }
      System.out.println(" a media das notas é ");
    System.out.println(media);
      }
    }
    

