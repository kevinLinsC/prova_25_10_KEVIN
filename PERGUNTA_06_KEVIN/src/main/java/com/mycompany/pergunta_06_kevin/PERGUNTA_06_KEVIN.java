/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_06_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_06_KEVIN {

    public static void main(String[] args) throws IOException {
        int[] valores;
        int N;
        float media;
        float soma = 0;
        int qtd_valores = 0;
        
        // Usuário não sai enquanto o valor for menor que zero.
        do {
            N = PegaNum("Digite a quantidade de valores a serem digitados: ");
        } while (N < 0);
        Linha();
        
        valores = new int[N]; // Cria o vetor com N posições.
        
        // Preenche o vetor com os números.
        for (int i = 0; i < N; i++) {
            valores[i] = PegaNum("Digite o " + (i + 1) + " numero: ");
        }
        Linha();
        
        // Soma os valores.
        for (int i = 0; i < N; i++) {
            soma += valores[i];
            qtd_valores++;
        }
        
        media = soma / N;
        
        System.out.println("A media dos valores e: " + media);
        System.out.println("A soma dos valores e: " + soma);
        System.out.println("A quantidade de valores digitados e: " + qtd_valores);
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
