package com.portfolioluca.luca.Controller;

import com.portfolioluca.luca.Dto.dtoAbout;
import com.portfolioluca.luca.Entity.About;
import com.portfolioluca.luca.Security.Controller.Mensaje;
import com.portfolioluca.luca.Service.SAbout;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/about")
@CrossOrigin(origins = "https://miportfolioluca1.web.app")
public class CAbout {
    @Autowired
    SAbout sAbout;
    
    @GetMapping("/lista")
    public ResponseEntity<List<About>> list(){
        List<About> list = sAbout.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }
    
    @GetMapping("/detail/{id}")
    public ResponseEntity<About> getById(@PathVariable("id") int id){
        if(!sAbout.existsById(id))
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        About about = sAbout.getOne(id).get();
        return new ResponseEntity(about, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") int id) {
        if(!sAbout.existsById(id)) {
            return new ResponseEntity(new Mensaje("no existe"), HttpStatus.NOT_FOUND);
        }
        sAbout.delete(id);
        return new ResponseEntity(new Mensaje("producto eliminado"), HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@PathVariable("id") int id,
            @RequestBody dtoAbout dtoab){
        
        //Validamos si existe id
        if(!sAbout.existsById(id))
            return new ResponseEntity(new Mensaje("El id no existe"), HttpStatus.BAD_REQUEST);
        
        //No puede estar vacio
        if(StringUtils.isBlank(dtoab.getNombreAb()))
            return new ResponseEntity(new Mensaje("El nombre no puede estar en blanco"), HttpStatus.BAD_REQUEST);
        
        About about = sAbout.getOne(id).get();
        about.setNombreAb(dtoab.getNombreAb());
        about.setDescripcionAb((dtoab.getDescripcionAb()));
        
        sAbout.save(about);
        return new ResponseEntity(new Mensaje("About actualizado"), HttpStatus.OK);
    }
}
