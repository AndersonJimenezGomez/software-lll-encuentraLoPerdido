package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.entity.UsuarioEntity;

import java.util.List;

public interface IUsuarioService {


    List<UsuarioEntity> findAll();

    void deleteById(Long id);

    UsuarioEntity findById(Long id);

    void save(UsuarioEntity usuarioEntity);
}
