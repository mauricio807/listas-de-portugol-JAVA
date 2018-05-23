/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import java.util.Scanner;

/**
 *
 * @author mauricio
 */
public class Questão4LISTA2{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       System.out.println("Informe um número");
       int n1= teclado.nextInt();
       System.out.println("Informe o segundo número");
       int n2= teclado.nextInt();
       System.out.println("Informe o terceiro número");
       int n3= teclado.nextInt();
        System.out.println(" Os números deverão ser lidos na ordem crescente ou decrescente ?");
         System.out.println("c para crescente e d para decrescente !");
         String opcao= teclado.next();
         
      if (opcao.equals("c")) {
       
       if((n1>=n2) && (n2>=n3)){
           System.out.println("a ordem crescente dos número citados é " + n3  + n2 +  n1 );
       }
       
       if((n1>=n3) && (n3>=n2)){
           System.out.println("a ordem crescente dos número citados é " + n2  + n3 +  n1 );
        }
       
       if((n2>=n3) && (n3>=n1 )){
           System.out.println("a ordem crescente dos número citados é " + n1  + n3 +  n2 );
       }
       
       if ((n2>=n1) && (n1>=n3)) {
           System.out.println("a ordem crescente dos número citados é " + n3  + n1 +  n2 );
       }
       
      if ((n3>=n1) && (n1>=n2)){
          System.out.println("a ordem crescente dos número citados é " + n2  + n1 +  n3 );
      }
      
      if ((n3>=n2) && (n2>=n1)){
          System.out.println("a ordem crescente dos número citados é " + n1  + n2 +  n3 );
     }
       }  
       
      else if (opcao.equals("d")){
         
   
       if ((n1<=n2) && (n2<=n3)){
         System.out.println("a ordem decrescente dos número citados é " + n3  + n2 +  n1 );
     }
        if ((n2<=n1) && (n1<=n3)){
           System.out.println("a ordem decrescente dos números citados é "+ n3 + n1+ n2);
       }
        if((n1<=n3) && (n3<=n2)){
            System.out.println("a ordem decrescente dos números citados é "+ n2 + n3 + n1);
        }
        if ((n2<=n3) && (n3<=n1)){
        System.out.println("a ordem decrescente dos números citados é "+ n1+ n3+ n2);
                }   
        if((n3<=n1) && (n1<=n2)){
            System.out.println("a ordem decrescente dos números citados é "+ n2+ n1+ n3);
        }
        if ((n3<=n2) && ( n2<=n1)){
            System.out.println("a ordem decrescente dos números citados é "+ n1+ n2+ n3);
        }         
    }
}
}    