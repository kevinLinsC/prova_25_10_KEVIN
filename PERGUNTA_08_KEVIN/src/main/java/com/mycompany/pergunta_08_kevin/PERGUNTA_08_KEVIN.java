/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_08_kevin;

import java.io.DataInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_08_KEVIN {

    public static void main(String[] args) throws IOException {
        int num;
        
        num = PegaNum("Digite um numero para ver sua tabuada: ");

        FileWriter arquivo = new FileWriter("C:\\Users\\k.andrade\\Desktop\\Tabuada " + num);
        PrintWriter gravar = new PrintWriter(arquivo);
        
        gravar.printf("Tabuada de " + num);
        for (int i = 1; i <= 10; i++) {
            gravar.printf("\n" + num + " x " + i + " = " + (i * num));
        }
        
        arquivo.close();
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
