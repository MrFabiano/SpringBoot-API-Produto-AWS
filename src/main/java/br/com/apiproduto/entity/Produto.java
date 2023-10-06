package br.com.apiproduto.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Produto {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    @Column
    private String nome;
    @Column
    private BigDecimal valor;
    @Column
    private String descricao;

}
