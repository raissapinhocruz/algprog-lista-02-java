/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade023;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Atividade023 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoLitro = entrada.nextDouble();

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = entrada.nextDouble();

        double valorTotal = precoLitro * litros;

        System.out.println("O cliente deverá pagar: R$ " + valorTotal);

        entrada.close();
        // TODO code application logic here
    }
    
}
