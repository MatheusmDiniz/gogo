package com.gogo.controller;

import com.gogo.domain.Cliente;
import com.gogo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @ResponseStatus(OK)
    @RequestMapping(method = POST, consumes = APPLICATION_JSON_VALUE)
    public Cliente save(@RequestBody Cliente cadastro) throws Exception {
        return clienteService.save(cadastro);
    }

    @ResponseStatus(OK)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) throws Exception {
        clienteService.delete(id);
    }
}
