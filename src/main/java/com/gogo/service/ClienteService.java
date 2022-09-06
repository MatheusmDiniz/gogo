package com.gogo.service;

import com.gogo.domain.Cliente;
import com.gogo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente save(Cliente cadastro) throws Exception {
        if(cadastro.getEndereco() == null){
            throw new NullPointerException("O endereço está vazio");
        }

        Cliente cliente = clienteRepository.save(cadastro);

        return cliente;
    }

    public void delete(Integer id) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("O id inserido não consta no banco de dados"));
        clienteRepository.delete(cliente);
    }
}
