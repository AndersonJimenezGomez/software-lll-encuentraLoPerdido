package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.domain.Publicacion;
import co.com.encuentraloperdido.entity.PublicacionEntity;

import java.util.List;

public interface IPublicacionService {

    List<PublicacionEntity> findAll();

    void deleteById(Long id);

    PublicacionEntity findById(Long id);

    void save(PublicacionEntity publicacionEntity);
}
