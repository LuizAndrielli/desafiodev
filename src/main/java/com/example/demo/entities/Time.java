package com.example.demo.entities;


import javax.persistence.JoinColumn;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@Table
@RequestMapping(name = "tb_times")
public class Time {

    private String nome;
    private Long pontos;
    
    @Autowired
    @JoinColumn(name = "tabela_id")
    private Tabela tabela;

    public Time(){
    }

    public Time(String nome, Long pontos, Tabela tabela) {
        this.nome = nome;
        this.pontos = pontos;
        this.tabela = tabela;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getPontos() {
        return pontos;
    }

    public void setPontos(Long pontos) {
        this.pontos = pontos;
    }

    public Tabela getTabela() {
        return tabela;
    }

    public void setTabela(Tabela tabela) {
        this.tabela = tabela;
    }

    
}
