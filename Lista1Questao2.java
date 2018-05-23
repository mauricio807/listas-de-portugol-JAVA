/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import java.util.Scanner;


/**
 
 * @author mauricio
 */
public class Lista1Questao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        int C;
        System.out.printf("Escreva a temperatura em graus centigrados \n :");
        C = input.nextInt();
        float F;
        F = (float)(9 * C + 160) / 5;
        System.out.println("A temperatura em fahrenheit é:"+ F+"");
    }       
    }
    

