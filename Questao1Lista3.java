/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Questao1Lista3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Entre com o 1º número");
        Scanner teclado = new Scanner (System.in);
        int n1 = teclado.nextInt();
      int menor =n1;
      int maior =n1;
      //for (int i = 0; i < 10; i=i+2) para somar de dois em dois   
        for (int i = 1; i < 15; i++) {
            System.out.println("entre com o"+ i +"º número");
            n1 = teclado.nextInt();
            if(n1>maior){
                maior=n1;
            }
                if(n1<menor){
                    menor=n1;
                }
            }
        System.out.println("o maior número é "+maior+"");
        System.out.println("o menor número é "+menor+"");
                
        }
      
      
    }
    

