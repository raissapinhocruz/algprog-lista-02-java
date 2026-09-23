/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade021;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Atividade021 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro numero: ");
        
        int numero1 = sc.nextInt();
        
        System.out.println("Digite o segundo numero: ");
        
        int numero2 = sc.nextInt();
        
        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        
        System.out.println("resultados: ");
        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("multiplicacao: " + multiplicacao);
        // TODO code application logic here
    }
    
}
