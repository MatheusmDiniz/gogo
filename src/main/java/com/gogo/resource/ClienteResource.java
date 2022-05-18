package com.gogo.resource;

import com.gogo.domain.Cliente;
import com.gogo.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/cliente")
public class ClienteResource {

    @Autowired
    ClienteService clienteService;

    @ResponseStatus(OK)
    @RequestMapping(method = POST, consumes = APPLICATION_JSON_VALUE)
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }
}
