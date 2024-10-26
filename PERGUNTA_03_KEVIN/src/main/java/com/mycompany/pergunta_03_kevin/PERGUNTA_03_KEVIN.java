/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_03_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_03_KEVIN {

    public static void main(String[] args) throws IOException {
        int escolha;
        String[] opcoes = {"Cafe Expresso", "Cafe Capuccino", "Leite com Cafe", "Totalizar Vendas"};
        int[] quantidade = {0, 0, 0, 0};
        float[] total_preco = {0, 0, 0, 0};
        
        // Introdução
        System.out.println("CAFETERIA BOA-VISTA");
        Linha();
        
        OUTER:
        while (true) {
            for (int i = 0; i < opcoes.length; i++) {
                System.out.println((i + 1) + " - " + opcoes[i]);
            }
            Linha();
            escolha = PegaNum("Escolha uma das opcoes acima: ");
            
            switch (escolha) {
                case 1:
                    total_preco[escolha - 1] += 0.75;
                    total_preco[total_preco.length - 1] += 0.75;
                    
                    quantidade[escolha - 1]++;
                    quantidade[total_preco.length - 1]++;
                    break;
                case 2:
                    total_preco[escolha - 1] += 1;
                    total_preco[total_preco.length - 1] += 1;
                    
                    quantidade[escolha - 1]++;
                    quantidade[total_preco.length - 1]++;
                    break;
                case 3:
                    total_preco[escolha - 1] += 1.25;
                    total_preco[total_preco.length - 1] += 1.25;
                    
                    quantidade[escolha - 1]++;
                    quantidade[total_preco.length - 1]++;
                    break;
                case 4:
                    break OUTER;
            }
        }
        
        for (int i = 0; i < opcoes.length; i++) {
            System.out.println(quantidade[i] + " e R$" + total_preco[i] + " de " + opcoes[i] + " vendido.");
        }
    }
    
    public static int PegaNum(String texto) throws IOException {
        DataInputStream dado;
        String s;
        int num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
        
            try {
                num = Integer.parseInt(s);
                break;        
            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite um numero.");
                Linha();
            }
        }
        
        return num;
    }
    
    public static void Linha() {
        System.out.println("--------------------------------");
    }
}
