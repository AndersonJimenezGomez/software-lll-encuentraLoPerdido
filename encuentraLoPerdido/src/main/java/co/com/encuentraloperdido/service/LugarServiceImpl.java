package co.com.encuentraloperdido.service;

import co.com.encuentraloperdido.entity.LugarEntity;
import co.com.encuentraloperdido.repository.ILugarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugarServiceImpl implements ILugarService{



    @Autowired
    private ILugarRepository lugarRepository;

    @Override
    public List<LugarEntity> findAll() {
        return lugarRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
        lugarRepository.deleteById(id);
    }

    @Override
    public LugarEntity findById(Long id) {
        return lugarRepository.findById(id).orElse(null);
    }

    @Override
    public void save(LugarEntity lugarEntity) {
        lugarRepository.save(lugarEntity);
    }
}
