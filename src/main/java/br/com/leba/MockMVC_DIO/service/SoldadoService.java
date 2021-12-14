package br.com.leba.MockMVC_DIO.service;

import br.com.leba.MockMVC_DIO.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {
    public Soldado getSoldado(){
        return new Soldado();
    }

    public void salvarSoldado(Soldado soldado){
    }
}
