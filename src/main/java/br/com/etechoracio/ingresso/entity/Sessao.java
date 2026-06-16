package br.com.etechoracio.ingresso.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SESSAO")
    private Long id;

    @Column(name = "PRECO")
    private Double preco;

    @Column(name = "SALA")
    private String sala;

    @Column(name = "DATA")
    private LocalDate data;

    @Column(name = "HORARIO")
    private LocalTime horario;

    @ManyToOne
    @JoinTable(name = "TBL_FILME",
            joinColumns = @JoinColumn(name = "ID_FILME"),
            inverseJoinColumns = @JoinColumn(name = "ID_SESSAO"))
    private List<Filme> filmes;

}
