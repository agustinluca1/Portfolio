package com.portfolioluca.luca.Repository;

import com.portfolioluca.luca.Entity.Proyectos;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RProyectos extends JpaRepository<Proyectos, Integer>{
    public Optional<Proyectos> findByNombrePr(String nombrePr);
    public boolean existsByNombrePr(String nombrePr);
}
