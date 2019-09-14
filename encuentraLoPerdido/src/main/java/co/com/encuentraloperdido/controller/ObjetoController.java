package co.com.encuentraloperdido.controller;


import co.com.encuentraloperdido.domain.Objeto;
import co.com.encuentraloperdido.entity.ObjetoEntity;
import co.com.encuentraloperdido.service.ObjetoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/objeto")
public class ObjetoController {


    @Autowired
    private ObjetoServiceImpl objetoService;

    @GetMapping("/objetos")
    public List<ObjetoEntity> findAll(){
        return objetoService.findAll();
    }

    @DeleteMapping("{id}/objeto")
    public void deleteById(@PathVariable(value ="id",required = true) Long id){
        objetoService.deleteById(id);
    }

    @GetMapping("/{id}/objeto")
    public ObjetoEntity findById(@PathVariable(value ="id",required = true)Long id){
        return objetoService.findById(id);
    }

    @PostMapping("/objeto")
    public void insert(@RequestBody ObjetoEntity objetoEntity){
        objetoService.save(objetoEntity);
    }

    @PutMapping("/{id}/objeto")
    public void update(@RequestBody ObjetoEntity objetoEntity,@PathVariable(value ="id",required = true) Long id){
        objetoEntity.setIdObjeto(id);
        objetoService.save(objetoEntity);
    }
}
