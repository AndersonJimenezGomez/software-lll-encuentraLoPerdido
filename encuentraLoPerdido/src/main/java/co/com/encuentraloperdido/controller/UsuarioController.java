package co.com.encuentraloperdido.controller;


import co.com.encuentraloperdido.entity.UsuarioEntity;
import co.com.encuentraloperdido.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios/")
public class UsuarioController {


    @Autowired
    private UsuarioServiceImpl usuarioService;

    @GetMapping("")
    public List<UsuarioEntity> findAll(){
        return usuarioService.findAll();
    }

    @DeleteMapping("{id}/")
    public void deleteById(@PathVariable(value ="id",required = true) Long id){
        usuarioService.deleteById(id);
    }

    @GetMapping("/{id}/")
    public UsuarioEntity findById(@PathVariable(value ="id",required = true)Long id){
        return usuarioService.findById(id);
    }

    @PostMapping("")
    public void insert(@RequestBody UsuarioEntity usuarioEntity){
        usuarioService.save(usuarioEntity);
    }

    @PutMapping("{id}/")
    public void update(@RequestBody UsuarioEntity usuarioEntity,@PathVariable(value ="id",required = true) Long id){
        usuarioEntity.setIdUsuario(id);
        usuarioService.save(usuarioEntity);
    }
}
