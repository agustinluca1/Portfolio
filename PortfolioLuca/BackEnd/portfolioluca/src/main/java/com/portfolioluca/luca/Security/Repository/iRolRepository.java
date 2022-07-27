package com.portfolioluca.luca.Security.Repository;

import com.portfolioluca.luca.Security.Entity.Rol;
import com.portfolioluca.luca.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
