package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.entity.LugarEntity;

import java.util.List;

public interface ILugarService {
    List<LugarEntity> findAll();

    void deleteById(Long id);

    LugarEntity findById(Long id);

    void save(LugarEntity lugarEntity);
}
