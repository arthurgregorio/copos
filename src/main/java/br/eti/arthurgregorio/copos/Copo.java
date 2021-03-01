package br.eti.arthurgregorio.copos;

import br.eti.arthurgregorio.liquidos.Liquido;

public class Copo {

    protected final Liquido conteudo;

    public Copo(Liquido conteudo) {
        this.conteudo = conteudo;
    }

    public String getOQueEstouBebendo() {
        return this.conteudo.getNome();
    }
}
