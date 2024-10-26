/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_10_kevin;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_10_KEVIN {

    public static void main(String[] args) throws IOException {
        DataInputStream dado;
        int N;
        int i;
        String[] nome_produtos;
        float[] preco_produtos;
        
        N = PegaNumInt("Digite quantos itens ira cadastrar: ");
        
        // Inicialização dos vetores.
        nome_produtos = new String[N];
        preco_produtos = new float[N];
        
        dado = new DataInputStream(System.in);
        
        // Pega o nome e o preço dos vetores.
        for (i = 0; i < nome_produtos.length; i++) {
            Linha();
            System.out.print("Digite o nome do " + (i + 1) + " produto: ");
            nome_produtos[i] = dado.readLine();
            preco_produtos[i] = PegaNumFloat("Digite o preco do produto: ");
        }
        
        JOptionPane.showMessageDialog(null, Arrays.toString(nome_produtos) + "\n" + Arrays.toString(preco_produtos));

        FileWriter arquivo = new FileWriter(".\\Produtos");
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("Os produtos e seus respectivos preços são:");
        
        for (i = 0; i < N; i++) {
            gravar.printf("\n" + nome_produtos[i] + ": R$" + preco_produtos[i]);
        }
        
        arquivo.close();
    }
    
    public static int PegaNumInt(String texto) throws IOException {
        DataInputStream dado;
        String s;
        int num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
        
            try {
                num = Integer.parseInt(s);
                if (num > 0) {
                    break;    
                }
                else {
                    System.out.println("Erro! Digite um valor valido positivo.");
                    Linha();
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro! Digite um numero.");
                Linha();
            }
        }
        
        return num;
    }
    
    public static float PegaNumFloat(String texto) throws IOException {
        DataInputStream dado;
        String s;
        float num;
        
        while (true) {
            System.out.print(texto);
            dado = new DataInputStream(System.in);
            s = dado.readLine();
        
            try {
                num = Float.parseFloat(s);
                if (num > 0) {
                    break;    
                }
                else {
                    System.out.println("Valor para preco invalido.");
                }
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
