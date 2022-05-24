package com.gogo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cadastro")
@SequenceGenerator(name = "cadastro_id_seq", sequenceName = "cadastro_id_seq", allocationSize = 1)
public class Cadastro {

    @Id
    @GeneratedValue(strategy = IDENTITY, generator = "cadastro_id_seq")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "phone")
    private String phone;
    
}
