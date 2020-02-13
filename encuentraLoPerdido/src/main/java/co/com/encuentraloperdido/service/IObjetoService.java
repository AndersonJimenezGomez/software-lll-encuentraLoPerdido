package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.entity.ObjetoEntity;

import java.util.List;

public interface IObjetoService {

    List<ObjetoEntity> findAll();

    void deleteById(Long id);

    ObjetoEntity findById(Long id);

    void save(ObjetoEntity objetoEntity);
}
