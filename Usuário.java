/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iphone;

/**
 *
 * @author Everton
 */
public class Usuário {
    public static void main(String[] args) {
        Iphone iphone = new Iphone ();
        
        AparelhoTelefonico aparelhotelefonico = iphone;
        ReprodutorMusical reprodutormusical = iphone;
        NavegadorInternet navegadorinternet = iphone;
        
        navegadorinternet.adicionarNovaAba();
        navegadorinternet.atualizarPagina();
        navegadorinternet.exibirPagina();
        
        reprodutormusical.pausar();
        reprodutormusical.selecionarMusica();
        reprodutormusical.tocar();
        
        aparelhotelefonico.atender();
        aparelhotelefonico.iniciarCorreioVoz();
        aparelhotelefonico.ligar();
    }
    
}
