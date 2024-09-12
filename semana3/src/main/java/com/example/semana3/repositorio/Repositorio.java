package com.example.semana3.repositorio;

import com.example.semana3.modelo.Equipos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface Repositorio extends JpaRepository<Equipos, Long> {
}
