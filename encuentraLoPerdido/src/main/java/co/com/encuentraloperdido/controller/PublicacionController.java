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

    @GetMapping("/publicaciones")
    public List<PublicacionEntity> findAll(){
        return publicacionService.findAll();
    }

    @DeleteMapping("{id}/publicacion")
    public void deleteById(@PathVariable(value ="id",required = true) Long id){
        publicacionService.deleteById(id);
    }

    @GetMapping("/{id}/publicacion")
    public PublicacionEntity findById(@PathVariable(value ="id",required = true)Long id){
        return publicacionService.findById(id);
    }

    @PostMapping("/publicacion")
    public void insert(@RequestBody PublicacionEntity publicacionEntity){
        publicacionService.save(publicacionEntity);
    }

    @PutMapping("/{id}/publicacion")
    public void update(@RequestBody PublicacionEntity publicacionEntity,@PathVariable(value ="id",required = true) Long id){
        publicacionEntity.setIdPublicacion(id);
        publicacionService.save(publicacionEntity);
    }

}
