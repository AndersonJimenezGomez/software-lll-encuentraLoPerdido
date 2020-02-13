package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.converter.LugarConverter;
import co.com.encuentraloperdido.domain.Lugar;
import co.com.encuentraloperdido.repository.ILugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarServiceImpl implements ILugarService{



    @Autowired
    private ILugarRepository lugarRepository;

    @Autowired
    private LugarConverter lugarConverter;

    @Override
    public List<Lugar> findAll() {
        return lugarConverter.entityToModel(lugarRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        lugarRepository.deleteById(id);
    }

    @Override
    public Lugar findById(Long id) {
        return lugarConverter.entityToModel(lugarRepository.findById(id).orElse(null));
    }

    @Override
    public void save(Lugar lugar) {
        lugarRepository.save(lugarConverter.modelToEntity(lugar));
    }
}
