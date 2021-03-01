package br.eti.arthurgregorio;

import br.eti.arthurgregorio.copos.Copo;
import br.eti.arthurgregorio.copos.Taca;
import br.eti.arthurgregorio.liquidos.Agua;
import br.eti.arthurgregorio.liquidos.Vinho;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

public class OQueVouBeber {

    @Test
    void bebereiAguaNoCopo() {
        final var copo = new Copo(new Agua());
        assertThat(copo.getOQueEstouBebendo()).isEqualTo("Agua");
    }

    @Test
    void bebereiVinhoNaTaca() {
        final var taca = new Taca(new Vinho());
        assertThat(taca.getOQueEstouBebendo()).isEqualTo("Vinho");
    }

    @Test
    void possoBeberQualquerCoisaNoCopo() {
        final var copoDeAgua = new Copo(new Agua());
        assertThat(copoDeAgua.getOQueEstouBebendo()).isEqualTo("Agua");

        final var copoDeVinho = new Copo(new Vinho());
        assertThat(copoDeVinho.getOQueEstouBebendo()).isEqualTo("Vinho");
    }

    @Test
    void tacaSomenteServeParaVinho() {
        final var taca = new Taca(new Agua());
        assertThatExceptionOfType(IllegalStateException.class)
                .isThrownBy(() -> {
                    final var bebida = taca.getOQueEstouBebendo();
                    System.out.println("Estou bebendo " + bebida);
                });
    }
}
