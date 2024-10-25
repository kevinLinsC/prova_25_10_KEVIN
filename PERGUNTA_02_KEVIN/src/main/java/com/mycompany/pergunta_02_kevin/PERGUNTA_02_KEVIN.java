/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_02_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_02_KEVIN {

    public static void main(String[] args) throws IOException {
        int anos;
        int meses;
        int dias;
        int tot_dias;
        
        // Introdução.
        System.out.println("CALCULADOR DE DIAS DE VIDA");
        Linha();
        System.out.println("Digite quantos anos, meses e dias voce tem:");
        Linha();
        
        // Pega anos, meses e dias do usuário.
        anos = PegaNum("Digite quantos anos: ");
        meses = PegaNum("Digite quantos meses: ");
        dias = PegaNum("Digite quantos dias: ");
        Linha();
        
        // Calculo de quantos dias o usuário tem com base nas informações passadas.
        tot_dias = (anos * 365) + (meses * 30) + dias;
        System.out.println(anos + " anos, " + meses + " meses, " + dias + " dias = " + tot_dias + " dias");
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
