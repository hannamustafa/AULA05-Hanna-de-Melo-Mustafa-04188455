package atividade01;

public class ListaSimples {
    private No inicio;
    private int tamanho;

    public ListaSimples() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public void inserirNolnicio(int valor) {
        No novo = new No(valor);
        novo.proximo = inicio;
        inicio = novo;
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = novo;
        } else {
            No atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novo;
        }
        tamanho++;
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("Posição inválida.");
            return;
        }
        if (pos == 0) {
            inserirNolnicio(valor);
            return;
        }
        No novo = new No(valor);
        No atual = inicio;
        for (int i = 0; i < pos - 1; i++) {
            atual = atual.proximo;
        }
        novo.proximo = atual.proximo;
        atual.proximo = novo;
        tamanho++;
    }

    public void removerNolnicio() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        inicio = inicio.proximo;
        tamanho--;
    }

    public void removerNoFinal() {
        if (inicio == null) {
            System.out.println("A lista está vazia.");
            return;
        }
        if (inicio.proximo == null) {
            inicio = null;
        } else {
            No atual = inicio;
            while (atual.proximo.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = null;
        }
        tamanho--;
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho || inicio == null) {
            System.out.println("Posição inválida.");
            return;
        }
        if (pos == 0) {
            removerNolnicio();
            return;
        }
        No atual = inicio;
        for (int i = 0; i < pos - 1; i++) {
            atual = atual.proximo;
        }
        atual.proximo = atual.proximo.proximo;
        tamanho--;
    }

    public int tamanho() {
        return tamanho;
    }

    public void exibir() {
        No atual = inicio;
        System.out.print("Lista: ");
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}