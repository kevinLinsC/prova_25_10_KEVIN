/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pergunta_05_kevin;

import java.io.DataInputStream;
import java.io.IOException;

/**
 *
 * @author k.andrade
 */
public class PERGUNTA_05_KEVIN {

    public static void main(String[] args) throws IOException {
        // Codigo e senha corretos.
        int codigo_certo = 1234;
        int senha_certa = 9999;
        
        // Codigo e senha digitados pelo usuário.
        int codigo;
        int senha;
        
        // Faz a pergunta para o usuário até digitar o codigo correto.
        do {
            codigo = PegaNum("Digite o codigo de usuario: ");
            if (codigo != codigo_certo) {
                System.out.println("Usuario invalido!");
                Linha();
            }
        } while (codigo != codigo_certo);
        
        Linha();
        
        // Faz a pergunta ao usuário até digitar a senha correta.
        do {
            senha = PegaNum("Digite a senha do usuario: ");
            if (senha != senha_certa) {
                System.out.println("senha incorreta");
                Linha();
            }
        } while (senha != senha_certa);

        Linha();
        
        System.out.println("Acesso permitido.");
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
