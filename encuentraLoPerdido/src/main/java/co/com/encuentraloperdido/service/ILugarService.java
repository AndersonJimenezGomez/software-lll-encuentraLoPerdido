package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.domain.Lugar;

import java.util.List;

public interface ILugarService {
    List<Lugar> findAll();

    void deleteById(Long id);

    Lugar findById(Long id);

    void save(Lugar lugar);
}
