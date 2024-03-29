package com.gogo.domain;

import lombok.*;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "endereco")
@SequenceGenerator(name = "endereco_id_seq", sequenceName = "endereco_id_seq", allocationSize = 1)
public class Endereco {

    @Id
    @GeneratedValue(strategy = IDENTITY, generator = "endereco_id_seq")
    private Integer id;


    @OneToOne(fetch = FetchType.LAZY,
            mappedBy = "endereco")
    private Cliente cliente;


    @Column(name = "rua")
    private String rua;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "pais")
    private String pais;

    @Column(name = "numero")
    private String numero;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "cep")
    private String cep;
}
