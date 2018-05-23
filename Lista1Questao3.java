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
public class Lista1Questao3 {

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner teclado= new Scanner( System.in);
     System.out.println(" Informe o raio");
     float r= teclado.nextFloat();
     System.out.println(" Informe a Altura");
     float a= teclado.nextFloat();
    float v= (float)3.14*(r*r)*(a);
    System.out.printf(" o Volume é: %2f\n", v); 
    
    }
}