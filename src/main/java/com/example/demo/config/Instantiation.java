package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.entities.Time;
import com.example.demo.repositories.TimeRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private TimeRepository timeRepository;

    @Override
    public void run(String... args) throws Exception {
        timeRepository.deleteAll();
        Time t1 = new Time("Palmeiras", 0);
        timeRepository.saveAll(Arrays.asList(t1));
        
    }


    
}
