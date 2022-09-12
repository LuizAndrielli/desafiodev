package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Tabela;
import com.example.demo.repositories.TabelaRepository;

@RestController
@RequestMapping(value = "/tabela")
public class TabelaController {
    
    @Autowired
    private TabelaRepository repo;

    @GetMapping
    public List<Tabela> findAll(){
        return repo.findAll();
    }
}
