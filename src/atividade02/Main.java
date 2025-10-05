package atividade02;

public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();

        lista.inserirNoInicio(30);
        lista.inserirNoFinal(12);
        lista.inserirNoFinal(77);
        lista.inserirNaPosicao(1, 9);
        lista.exibir();

        lista.removerNoInicio();
        lista.exibir();

        lista.removerNoFinal();
        lista.exibir();

        lista.removerNaPosicao(3);
        lista.exibir();

        System.out.println("Seu tamanho: " + lista.tamanho());
    }
}