package com.portfolioluca.luca.Service;

import com.portfolioluca.luca.Entity.Proyectos;
import com.portfolioluca.luca.Repository.RProyectos;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyectos {
    @Autowired
    RProyectos rProyectos;
    
    public List<Proyectos> list(){
        return rProyectos.findAll();
    }
    
    public Optional<Proyectos> getOne(int id){
        return rProyectos.findById(id);
    }
    
    public Optional<Proyectos> getByNombrePr(String nombrePr){
        return rProyectos.findByNombrePr(nombrePr);
    }
    
    public void save(Proyectos proye){
        rProyectos.save(proye);
    }
    
    public void delete(int id){
        rProyectos.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rProyectos.existsById(id);
    }
    
    public boolean existsByNombrePr(String nombrePr){
        return rProyectos.existsByNombrePr(nombrePr);
    }
}
