/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade022;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Atividade022 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = entrada.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = entrada.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A media das notas e: " + media);

        entrada.close();
        // TODO code application logic here
    }
    
}
