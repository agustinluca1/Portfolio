package com.portfolioluca.luca.Repository;

import com.portfolioluca.luca.Entity.About;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAbout extends JpaRepository<About, Integer>{
    public Optional<About>findByNombreAb(String nombreAb);
    public boolean existsByNombreAb(String nombreAb);
}
