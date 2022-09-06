package com.gogo.domain;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cliente")
@SequenceGenerator(name = "cliente_id_seq", sequenceName = "cliente_id_seq", allocationSize = 1)
public class Cliente {

    @Id
    @GeneratedValue(strategy = IDENTITY, generator = "cliente_id_seq")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "rg")
    private String rg;

    @Column(name = "cpf")
    private String cpf;

    @OneToOne(fetch = FetchType.EAGER, optional = false, cascade=CascadeType.ALL)
    @JoinColumn(name = "endereco_id", nullable = false)
    private Endereco endereco;
}
