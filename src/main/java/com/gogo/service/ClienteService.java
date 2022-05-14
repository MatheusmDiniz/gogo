package com.gogo.service;

import com.gogo.domain.Cliente;
import com.gogo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente save(Cliente cliente) {
        System.out.println("OK");
        return clienteRepository.save(cliente);
    }
}
