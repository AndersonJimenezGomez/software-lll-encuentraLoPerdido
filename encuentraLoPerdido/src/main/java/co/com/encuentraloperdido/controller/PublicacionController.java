package co.com.encuentraloperdido.controller;

import co.com.encuentraloperdido.entity.PublicacionEntity;
import co.com.encuentraloperdido.service.PublicacionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publicacion")
public class PublicacionController {


    @Autowired
    private PublicacionServiceImpl publicacionService;

    @GetMapping("/personas")
    public List<PublicacionEntity> findAll(){
        return publicacionService.findAll();
    }

    @DeleteMapping("{id}/persona")
    public void deleteById(@PathVariable(value ="id",required = true) Long id){
        publicacionService.deleteById(id);
    }

    @GetMapping("/{id}/persona")
    public PublicacionEntity findById(@PathVariable(value ="id",required = true)Long id){
        return publicacionService.findById(id);
    }

    @PostMapping("/persona")
    public void insert(@RequestBody PublicacionEntity personaEntity){
        publicacionService.save(personaEntity);
    }

    @PutMapping("/{id}/persona")
    public void update(@RequestBody PublicacionEntity personaEntity,@PathVariable(value ="id",required = true) Long id){
        personaEntity.setIdPublicacion(id);
        publicacionService.save(personaEntity);
    }

}
