package com.gogo.service;

import com.gogo.domain.Cadastro;
import com.gogo.domain.Cadastro;
import com.gogo.repository.CadastroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CadastroService {

    @Autowired
    CadastroRepository clienteRepository;

    public Cadastro save(Cadastro cadastro) throws Exception {
        if(cadastro.getEndereco() == null){
            throw new NullPointerException("O endereço está vazio");
        }

        System.out.println("OK");
        return clienteRepository.save(cadastro);
    }
}
