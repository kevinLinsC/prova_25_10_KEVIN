/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_04_kevin;

import javax.swing.JOptionPane;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_04_KEVIN {

    public static void main(String[] args) {
        int num;
        int antecessor;
        int sucessor;
        String s;
        
        // Pega o numero do usuário.
        while (true) {
            s = JOptionPane.showInputDialog(null, "Digite um número: ");
            try {
                num = Integer.parseInt(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("ERRO! Digite um numero.");
            }
        }
        
        // Faz o antecessor e o sucessor.
        antecessor = num - 1;
        sucessor = num + 1;
        
        // Mostra na tela o antecessor e o sucessor.
        JOptionPane.showMessageDialog(null, "O antecessor de " + num + " é: " + antecessor + "\nO sucessor de " + num + " é: " + sucessor);
    }
}
