/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade024;

import java.util.Scanner;

/**
 *
 * @author Rah
 */
public class Atividade024 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o preço da viagem para a Alemanha: R$ ");
        double precoAlemanha = entrada.nextDouble();

        System.out.print("Digite o preço da viagem para Portugal: R$ ");
        double precoPortugal = entrada.nextDouble();

        System.out.print("Digite o preço da viagem para a Itália: R$ ");
        double precoItalia = entrada.nextDouble();

        System.out.print("Digite a quantidade de pessoas: ");
        int quantidadePessoas = entrada.nextInt();

        double valorAlemanha = precoAlemanha * quantidadePessoas;
        double valorPortugal = precoPortugal * quantidadePessoas;
        double valorItalia = precoItalia * quantidadePessoas;

        double valorTotal = valorAlemanha + valorPortugal + valorItalia;

        System.out.println("\n===== EUROTRIP =====");
        System.out.println("Alemanha: R$" + valorAlemanha);
        System.out.println("Portugal: R$ " + valorPortugal);
        System.out.println("Itália: R$ " + valorItalia);
        System.out.println("Valor total da viagem: R$ " + valorTotal);

        entrada.close();
    }
    
}
