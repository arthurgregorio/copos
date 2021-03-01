package br.eti.arthurgregorio.copos;

import br.eti.arthurgregorio.liquidos.Agua;
import br.eti.arthurgregorio.liquidos.Liquido;

public class Taca extends Copo {

    public Taca(Liquido conteudo) {
        super(conteudo);
    }

    @Override
    public String getOQueEstouBebendo() {
        if (this.conteudo instanceof Agua) {
            throw new IllegalStateException("Não pode beber agua na taca");
        }
        return super.getOQueEstouBebendo();
    }
}
