package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entities.Time;

public interface TimeRepository extends JpaRepository<Time, String>{

    
}
