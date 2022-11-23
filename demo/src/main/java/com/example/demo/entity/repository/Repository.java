package com.example.demo.entity.repository;

import com.example.demo.entity.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Funcionario,Long> {
}
