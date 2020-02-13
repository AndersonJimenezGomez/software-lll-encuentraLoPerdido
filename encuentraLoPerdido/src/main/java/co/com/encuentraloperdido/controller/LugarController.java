package co.com.encuentraloperdido.controller;


import co.com.encuentraloperdido.domain.Lugar;
import co.com.encuentraloperdido.service.LugarServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lugares/")
public class LugarController {


    @Autowired
    private LugarServiceImpl lugarService;

    @GetMapping("")
    public List<Lugar> findAll(){
        return lugarService.findAll();
    }

    @DeleteMapping("{id}/")
    public void deleteById(@PathVariable(value ="id",required = true) Long id){
        lugarService.deleteById(id);
    }

    @GetMapping("{id}/")
    public Lugar findById(@PathVariable(value ="id",required = true)Long id){
        return lugarService.findById(id);
    }

    @PostMapping("")
    public void insert(@RequestBody Lugar lugar){
        lugarService.save(lugar);
    }

    @PutMapping("{id}/")
    public void update(@RequestBody Lugar lugar,@PathVariable(value ="id",required = true) Long id){
        lugar.setIdLugar(id);
        lugarService.save(lugar);
    }
}
