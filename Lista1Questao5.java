/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;

/**
 *
 * @author mauri
 */
public class Lista1Questao5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
       System.out.println("Informe um Número");
       int n1 = teclado.nextInt();
       double quadrado= Math.pow(n1,2);
       System.out.println(quadrado);
    }
    
}
