package com.gogo.controller;

import com.gogo.domain.Cadastro;
import com.gogo.service.CadastroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
@RequestMapping("/api/cadastro")
public class CadastroController {

    @Autowired
    CadastroService cadastroService;

    @ResponseStatus(OK)
    @RequestMapping(method = POST, consumes = APPLICATION_JSON_VALUE)
    public Cadastro save(@RequestBody Cadastro cadastro) throws Exception {
        return cadastroService.save(cadastro);
    }
}
