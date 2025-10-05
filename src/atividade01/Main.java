package atividade01;

public class Main {
    public static void main(String[] args) {
        ListaSimples lista = new ListaSimples();

        lista.inserirNolnicio(40);
        lista.inserirNoFinal(15);
        lista.inserirNaPosicao(2, 35);
        lista.exibir();

        
        lista.removerNoFinal();
        lista.exibir();

        lista.removerNolnicio();
        lista.exibir();

        lista.inserirNoFinal(2);
        lista.inserirNoFinal(60);
        lista.inserirNoFinal(15);
        lista.exibir();

        lista.removerNaPosicao(3);
        lista.exibir();

        System.out.println("Seu tamanho: " + lista.tamanho());
    }
}