package com.portfolioluca.luca.Service;

import com.portfolioluca.luca.Entity.About;
import com.portfolioluca.luca.Repository.RAbout;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SAbout {
    @Autowired
    RAbout rAbout;
    
    public List<About> list() {
        return rAbout.findAll();
    }
    
    public Optional<About> getOne(int id){
        return rAbout.findById(id);
    }
    
    public Optional<About> getByNombreAb(String nombreAb){
        return rAbout.findByNombreAb(nombreAb);
    }
    
    public void save(About abou){
        rAbout.save(abou);
    }
    
    public void delete(int id){
        rAbout.deleteById(id);
    }
    
    public boolean existsById(int id){
        return rAbout.existsById(id);
    }
    
    public boolean existsByNombreAb(String nombreAb){
        return rAbout.existsByNombreAb(nombreAb);
    }
}
