package atividade02;

class ListaDupla {
    No inicio;
    No fim;
    int tamanho;

    public ListaDupla() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    public void inserirNoInicio(int valor) {
        No novo = new No(valor);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            novo.proximo = inicio;
            inicio.anterior = novo;
            inicio = novo;
        }
        tamanho++;
    }

    public void inserirNoFinal(int valor) {
        No novo = new No(valor);
        if (fim == null) {
            inicio = fim = novo;
        } else {
            fim.proximo = novo;
            novo.anterior = fim;
            fim = novo;
        }
        tamanho++;
    }

    public void inserirNaPosicao(int pos, int valor) {
        if (pos < 0 || pos > tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (pos == 0) {
            inserirNoInicio(valor);
            return;
        } else if (pos == tamanho) {
            inserirNoFinal(valor);
            return;
        }

        No novo = new No(valor);
        No atual = inicio;

        for (int i = 0; i < pos - 1; i++) {
            atual = atual.proximo;
        }

        novo.proximo = atual.proximo;
        novo.anterior = atual;
        atual.proximo.anterior = novo;
        atual.proximo = novo;
        tamanho++;
    }

    public void removerNoInicio() {
        if (inicio == null) return;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            inicio = inicio.proximo;
            inicio.anterior = null;
        }
        tamanho--;
    }

    public void removerNoFinal() {
        if (fim == null) return;

        if (inicio == fim) {
            inicio = fim = null;
        } else {
            fim = fim.anterior;
            fim.proximo = null;
        }
        tamanho--;
    }

    public void removerNaPosicao(int pos) {
        if (pos < 0 || pos >= tamanho) {
            System.out.println("Posição inválida.");
            return;
        }

        if (pos == 0) {
            removerNoInicio();
            return;
        } else if (pos == tamanho - 1) {
            removerNoFinal();
            return;
        }

        No atual = inicio;
        for (int i = 0; i < pos; i++) {
            atual = atual.proximo;
        }

        atual.anterior.proximo = atual.proximo;
        atual.proximo.anterior = atual.anterior;
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

