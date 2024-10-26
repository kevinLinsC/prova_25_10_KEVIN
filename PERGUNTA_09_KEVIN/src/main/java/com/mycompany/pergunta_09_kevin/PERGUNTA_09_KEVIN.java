/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_09_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_09_KEVIN {

    public static void main(String[] args) throws IOException {
        float ganho_hora;
        int horas_trabalhadas;
        
        String[] info = {"Salario Bruto", "Valor pago ao Imposto de Renda (11%)", "Valor pago ao INSS (8%)",
                         "Valor pago ao Sindicato (5%)", "Salario Liquido"};
        float[] resultados = new float[5];
        
        ganho_hora = PegaNumFloat("Digite quanto o funcionario ganha por hora: ");
        Linha();
        
        horas_trabalhadas = PegaNumInt("Digite quantas horas o funcionario trabalhou no mes: ");
        Linha();
        
        // Calculo do salario bruto, descontos e salario liquido.
        resultados[0] = ganho_hora * horas_trabalhadas;
        resultados[1] = (float) (resultados[0] * 0.11);
        resultados[2] = (float) (resultados[0] * 0.08);
        resultados[3] = (float) (resultados[0] * 0.05);
        resultados[4] = resultados[0] - (resultados[1] + resultados[2] + resultados[3]); 
        
        // Escreve salario bruto, descontos e salario liquido.
        System.out.println("+ " + info[0] + ": R$" + resultados[0]);
        for (int i = 1; i < info.length - 1; i++) {
            System.out.println("- " + info[i] + ": R$" + resultados[i]);
        }
        System.out.println("= " + info[4] + ": R$" + resultados[4]);
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
                    System.out.println("Valor para salario invalido.");
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
                    System.out.println("Valor para salario invalido.");
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
