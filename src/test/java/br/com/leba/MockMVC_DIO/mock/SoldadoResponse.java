package br.com.leba.MockMVC_DIO.mock;

import br.com.leba.MockMVC_DIO.dto.Soldado;

public class SoldadoResponse {
    public static Soldado create(){
        Soldado soldado = new Soldado();
        soldado.setArma("Espada");
        soldado.setIdade(24);
        soldado.setNome("João");
        soldado.setRaca("humano");
        soldado.setStatus("vivo");
        return soldado;
    }
}
