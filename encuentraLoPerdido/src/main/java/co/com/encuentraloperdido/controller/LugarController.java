package co.com.encuentraloperdido.controller;


import co.com.encuentraloperdido.domain.Lugar;
import co.com.encuentraloperdido.entity.LugarEntity;
import co.com.encuentraloperdido.service.LugarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugar")
public class LugarController {


    @Autowired
    private LugarServiceImpl lugarService;

    @GetMapping("/lugares")
    public List<LugarEntity> findAll(){
        return lugarService.findAll();
    }

    @DeleteMapping("{id}/lugar")
    public void deleteById(@PathVariable(value ="id",required = true) Long id){
        lugarService.deleteById(id);
    }

    @GetMapping("/{id}/lugar")
    public LugarEntity findById(@PathVariable(value ="id",required = true)Long id){
        return lugarService.findById(id);
    }

    @PostMapping("/lugar")
    public void insert(@RequestBody LugarEntity lugarEntity){
        lugarService.save(lugarEntity);
    }

    @PutMapping("/{id}/lugar")
    public void update(@RequestBody LugarEntity lugarEntity,@PathVariable(value ="id",required = true) Long id){
        lugarEntity.setIdLugar(id);
        lugarService.save(lugarEntity);
    }
}
