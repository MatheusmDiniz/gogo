package com.gogo.repository;

import com.gogo.domain.Cadastro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CadastroRepository extends CrudRepository<Cadastro, Integer> {
}


