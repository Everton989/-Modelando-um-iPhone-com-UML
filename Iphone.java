/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphone;

/**
 *
 * @author Everton
 */
public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    public void ligar() {
        System.out.println("Realizando Ligação...");
    }

    public void atender() {
        System.out.println("Atendendo Ligação...");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
    }

    public void tocar() {
        System.out.println("Tocando Música...");
    }

    public void pausar() {
        System.out.println("Pausando Música...");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Música...");
    }

    public void exibirPagina() {
        System.out.println("Exibindo Página...");
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando Nova Aba...");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando Página...");
    }

}
