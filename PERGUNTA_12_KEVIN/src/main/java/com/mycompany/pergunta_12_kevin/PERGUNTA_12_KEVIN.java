/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_12_kevin;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_12_KEVIN {

    public static void main(String[] args) throws IOException {
        int[] numeros = new int[10];
        int num_aux;
        int i;
        Random aleatorio = new Random();
        
        
        for (i = 0; i < numeros.length; i++) {
            //numeros[i] = PegaNumInt("Digite o " + (i + 1) + " numero: ");
            numeros[i] = aleatorio.nextInt(1, 100);
        }
        
        System.out.println(Arrays.toString(numeros));
        
        for (i = 0; i < numeros.length; i++) {
            num_aux = numeros[i];
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] > numeros[j]) {
                    num_aux = numeros[j];
                    numeros[j] = num_aux;
                }
            }
        }
        
        System.out.println(Arrays.toString(numeros));
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
